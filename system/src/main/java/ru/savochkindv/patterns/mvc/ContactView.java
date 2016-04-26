package ru.savochkindv.patterns.mvc;

/**
 * Интерфейс, описывающий представление
 *
 * @author savochkindv
 *         Date 26.04.2016.
 */
public interface ContactView {

    /**
     * Обновление представления
     *
     * @param firstName    имя
     * @param lastName     фамилия
     * @param title        заголовок
     * @param organization организация
     */
    void refreshContactView(String firstName, String lastName, String title, String organization);
}
