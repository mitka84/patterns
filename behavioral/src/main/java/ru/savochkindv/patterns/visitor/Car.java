package ru.savochkindv.patterns.visitor;

/**
 * Класс, описывающий автомобиль
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class Car implements ICarElement {

    /**
     * Массив элементов машины
     */
    private ICarElement[] elements;

    /**
     * Конструктор
     */
    public Car() {
        this.elements = new ICarElement[]{new Wheel("front left"),
                new Wheel("front right"), new Wheel("back left"),
                new Wheel("back right"), new Body(), new Engine()};
    }

    @Override
    public void accept(ICarElementVisitor visitor) {
        for (ICarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }

}
