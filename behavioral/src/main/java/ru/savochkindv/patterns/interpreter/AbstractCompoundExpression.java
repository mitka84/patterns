package ru.savochkindv.patterns.interpreter;

/**
 * Абстрактный класс, описывающий пару выражений сравнения, при анализе которых
 * получается логический результат
 * Created by savochkindv on 02.02.2016.
 */
public abstract class AbstractCompoundExpression implements IExpression {

    /**
     * Логическое выражение А
     */
    protected AbstractComparisonExpression expressionA;

    /**
     * Логическое выражение Б
     */
    protected AbstractComparisonExpression expressionB;

    /**
     * Конструктор
     *
     * @param expressionA логическое выражение А
     * @param expressionB логическое выражение Б
     */
    public AbstractCompoundExpression(AbstractComparisonExpression expressionA, AbstractComparisonExpression expressionB) {
        this.expressionA = expressionA;
        this.expressionB = expressionB;
    }
}
