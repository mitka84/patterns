package ru.savochkindv.patterns.composite;

import ru.savochkindv.patterns.model.interfaces.IContact;

/**
 * Класс, представляющий конечный продукт, получаемый в результате завершения текущего этапа.
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class Deliverable implements ProjectItem {

    /**
     * Наименование
     */
    private String name;

    /**
     * Описание
     */
    private String description;

    /**
     * Владелец
     */
    private IContact owner;

    /**
     * Конструктор
     */
    public Deliverable() {
    }

    /**
     * Конструктор
     *
     * @param name        наименование
     * @param description описание
     * @param owner       владелец
     */
    public Deliverable(String name, String description, IContact owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IContact getOwner() {
        return owner;
    }

    public void setOwner(IContact owner) {
        this.owner = owner;
    }

    @Override
    public double getTimeRequired() {
        return 0;
    }
}
