package ru.savochkindv.patterns.interpreter;

/**
 * Абстрактный класс, описывающий пару выражений, при анализе которых получается логический результат
 * Created by savochkindv on 02.02.2016.
 */
public abstract class AbstractComparisonExpression implements IExpression {

    /**
     * Выражение А
     */
    protected IExpression expressionA;

    /**
     * Выражение Б
     */
    protected IExpression expressionB;

    /**
     * Конструктор
     *
     * @param expressionA выражение А
     * @param expressionB выражение Б
     */
    public AbstractComparisonExpression(IExpression expressionA, IExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
