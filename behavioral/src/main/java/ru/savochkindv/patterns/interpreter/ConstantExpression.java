package ru.savochkindv.patterns.interpreter;

/**
 * Класс, представляющий константу
 * Created by savochkindv on 02.02.2016.
 */
public class ConstantExpression implements IExpression {

    /**
     * Значение
     */
    private Object value;

    /**
     * Конструктор
     *
     * @param value значение
     */
    public ConstantExpression(Object value) {
        this.value = value;
    }

    @Override
    public void interpret(Context c) {
        c.addVariable(this, value);
    }
}
