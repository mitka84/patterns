package ru.savochkindv.patterns.visitor;

/**
 * Класс, реализующий визитора для печати
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class CarElementPrintVisitor implements ICarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}
