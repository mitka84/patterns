package ru.savochkindv.patterns.model.interfaces;

/**
 * Интерфейс, описывающий общую для всех элементов проекта функциональность.
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public interface ProjectItem {

    String EOL_STRING = System.getProperty("line.separator");

    /**
     * Возвращает необходимое время
     *
     * @return необходимое время
     */
    double getTimeRequired();

}
