package ru.savochkindv.patterns.visitor;

/**
 * Интерфейс, описывающий визитора автомобиля
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public interface ICarElementVisitor {

    /**
     * "Посещение" колеса
     *
     * @param wheel колесо
     */
    void visit(Wheel wheel);

    /**
     * "Посещение" двигателя
     *
     * @param engine двигатель
     */
    void visit(Engine engine);

    /**
     * "Посещение" кузова
     *
     * @param body кузов
     */
    void visit(Body body);

    /**
     * "Посещение" автомобиля
     *
     * @param car автомобиль
     */
    void visit(Car car);

}
