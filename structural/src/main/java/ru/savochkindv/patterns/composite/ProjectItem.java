package ru.savochkindv.patterns.composite;

/**
 * Интерфейс, описывающий общую для всех элементов проекта функциональность.
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public interface ProjectItem {

    /**
     * Возвращает необходимое время
     *
     * @return необходимое время
     */
    double getTimeRequired();

}
