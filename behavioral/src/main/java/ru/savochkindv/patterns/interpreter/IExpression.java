package ru.savochkindv.patterns.interpreter;

/**
 * Интерфейс, описывающий все выражения
 * Created by savochkindv on 02.02.2016.
 */
public interface IExpression {

    /**
     * Выполнить анализ выражения
     *
     * @param c контекст
     */
    void interpret(Context c);

}
