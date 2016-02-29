package ru.savochkindv.patterns.visitor;

/**
 * Класс, реализующий визитора для действий машины
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class CarElementDoVisitor implements ICarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Starting my engine");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Moving my body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }

}
