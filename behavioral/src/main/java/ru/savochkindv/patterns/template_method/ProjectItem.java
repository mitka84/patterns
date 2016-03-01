package ru.savochkindv.patterns.template_method;

/**
 * Абстрактный класс, описывающий элемент проекта
 *
 * @author savochkindv
 *         Date: 01.03.2016.
 */
public abstract class ProjectItem {

    /**
     * Имя
     */
    private String name;

    /**
     * Описание
     */
    private String description;

    /**
     * Ставка
     */
    private double rate;

    /**
     * Конструктор
     */
    public ProjectItem() {
    }

    /**
     * Конструктор
     *
     * @param name        имя
     * @param description описание
     * @param rate        ставка
     */
    public ProjectItem(String name, String description, double rate) {
        this.name = name;
        this.description = description;
        this.rate = rate;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * Возвращает стоимость выполнения
     *
     * @return стоимость выполнения
     */
    public final double getCostEstimate() {
        return getTimeRequired() * getRate() + getMaterialsCost();
    }

    /**
     * Возвращает стоимость материала
     *
     * @return стоимость материала
     */
    protected abstract double getMaterialsCost();

    /**
     * Возвращает требуемое время
     *
     * @return требуемое время
     */
    protected abstract double getTimeRequired();
}
