package ru.savochkindv.patterns.visitor;

/**
 * Интерфейс, описывающий элемент машины
 *
 * @author savochkindv
 *         Date: 29.02.2016.
 */
interface ICarElement {

    /**
     * Действие при посещении
     *
     * @param visitor визитор
     */
    void accept(ICarElementVisitor visitor);

}
