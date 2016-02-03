package ru.savochkindv.patterns.interpreter;

/**
 * Класс, представляющий проверку, содержит ли первое выражение,
 * представленное в виде строки, вторую строку
 * Created by savochkindv on 02.02.2016.
 */
public class ContainsExpression extends AbstractComparisonExpression {

    /**
     * Конструктор
     *
     * @param expressionA выражение А
     * @param expressionB выражение Б
     */
    public ContainsExpression(IExpression expressionA, IExpression expressionB) {
        super(expressionA, expressionB);
    }

    @Override
    public void interpret(Context c) {
        expressionA.interpret(c);
        expressionB.interpret(c);
        Object exprAResult = c.get(expressionA);
        Object exprBResult = c.get(expressionB);
        if ((exprAResult instanceof String) && (exprBResult instanceof String)) {
            if (((String) exprAResult).indexOf((String) exprBResult) != -1) {
                c.addVariable(this, Boolean.TRUE);
                return;
            }
        }
        c.addVariable(this, Boolean.FALSE);
    }
}
