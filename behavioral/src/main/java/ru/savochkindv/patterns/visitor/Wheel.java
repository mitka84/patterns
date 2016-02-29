package ru.savochkindv.patterns.visitor;

/**
 * Класс, описывающий колесо
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
public class Wheel implements ICarElement {

    /**
     * Имя
     */
    private String name;

    /**
     * Конструктор
     *
     * @param name имя
     */
    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(ICarElementVisitor visitor) {
        visitor.visit(this);
    }
}
