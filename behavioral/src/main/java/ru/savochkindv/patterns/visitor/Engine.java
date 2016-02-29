package ru.savochkindv.patterns.visitor;

/**
 * Класс, описывающий двигатель
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class Engine implements ICarElement {

    @Override
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }

}
