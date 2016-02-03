package ru.savochkindv.patterns.interpreter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Класс, представляющий переменную, полученную путем вызова метода некоторого класса
 * Created by savochkindv on 02.02.2016.
 */
public class VariableExpression implements IExpression {

    /**
     * Объект
     */
    private Object lookup;

    /**
     * Имя метода
     */
    private String methodName;

    /**
     * Конструктор
     *
     * @param lookup     объект
     * @param methodName имя метода
     */
    public VariableExpression(Object lookup, String methodName) {
        this.lookup = lookup;
        this.methodName = methodName;
    }

    @Override
    public void interpret(Context c) {
        try {
            Object source = c.get(lookup);
            if (source != null) {
                Method m = source.getClass().getMethod(methodName, null);
                Object result = m.invoke(source, null);
                c.addVariable(this, result);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
