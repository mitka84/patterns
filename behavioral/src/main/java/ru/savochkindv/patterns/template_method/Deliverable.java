package ru.savochkindv.patterns.template_method;

/**
 * Класс, описывающий конкретный продукт
 *
 * @author savochkindv
 *         Date: 01.03.2016.
 */
public class Deliverable extends ProjectItem {

    /**
     * Цена материалов
     */
    private double materialsCost;

    /**
     * Время производства
     */
    private double productionTime;

    /**
     * Конструктор
     */
    public Deliverable() {
    }

    /**
     * Конструктор
     *
     * @param name           имя
     * @param description    описание
     * @param materialsCost  цена материала
     * @param productionTime время производства
     * @param rate           ставка
     */
    public Deliverable(String name, String description, double materialsCost, double productionTime, double rate) {
        super(name, description, rate);
        this.materialsCost = materialsCost;
        this.productionTime = productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    @Override
    protected double getMaterialsCost() {
        return materialsCost;
    }

    public void setMaterialsCost(double materialsCost) {
        this.materialsCost = materialsCost;
    }

    @Override
    protected double getTimeRequired() {
        return productionTime;
    }
}
