package ru.savochkindv.patterns.visitor;

/**
 * Класс, описывающий кузов машины
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class Body implements ICarElement {

    @Override
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }

}
