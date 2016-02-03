package ru.savochkindv.patterns.interpreter;

/**
 * Класс, представляющий логическое "И" для двух выражений
 * Created by savochkindv on 02.02.2016.
 */
public class AndExpression extends AbstractCompoundExpression {

    /**
     * Конструктор
     *
     * @param expressionA выражение А
     * @param expressionB выражение Б
     */
    public AndExpression(AbstractComparisonExpression expressionA, AbstractComparisonExpression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public void interpret(Context c) {
        expressionA.interpret(c);
        expressionB.interpret(c);
        Boolean result = new Boolean(((Boolean) c.get(expressionA)).booleanValue() && ((Boolean) c.get(expressionB)).booleanValue());
        c.addVariable(this, result);
    }
}
