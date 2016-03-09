package ru.savochkindv.patterns.bridge;

/**
 * Интерфейс, описывающий список строк
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public interface IList {

    /**
     * Добавляет элемент в список
     *
     * @param item элемент
     */
    void addItem(String item);

    /**
     * Добавить элемент в указанную позицию
     *
     * @param item     элемент
     * @param position позиция
     */
    void addItem(String item, int position);

    /**
     * Удалить элемент из списка
     *
     * @param item элемент
     */
    void removeItem(String item);

    /**
     * Возвращает количество элементов в списке
     *
     * @return количество элементов в списке
     */
    int getNumberOfItems();

    /**
     * Возвращает элемент по индексу
     *
     * @param index индекс
     * @return элемент
     */
    String getItem(int index);

    /**
     * Поддерживает ли список сортировку
     *
     * @return true, если список поддерживает сортировку
     */
    boolean supportsOrdering();
}
