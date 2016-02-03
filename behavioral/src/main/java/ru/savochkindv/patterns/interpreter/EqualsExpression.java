package ru.savochkindv.patterns.interpreter;

/**
 * Класс, представляющий метод equals, сравнивающий результаты двух выражений
 * Created by savochkindv on 02.02.2016.
 */
public class EqualsExpression extends AbstractComparisonExpression {

    /**
     * Конструктор
     *
     * @param expressionA выражение А
     * @param expressionB выражение Б
     */
    public EqualsExpression(IExpression expressionA, IExpression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public void interpret(Context c) {
        expressionA.interpret(c);
        expressionB.interpret(c);
        Boolean result = new Boolean(c.get(expressionA).equals(c.get(expressionB)));
        c.addVariable(this, result);
    }
}
