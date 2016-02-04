package ru.savochkindv.patterns.iterator;

/**
 * Интерфейс, описывающий список задач
 * Created by savochkindv on 04.02.2016.
 */
public interface ToDoList extends Iterating {

    /**
     * Добавить элемент в список
     *
     * @param item элемент
     */
    void add(String item);

    /**
     * Добавить элемент в нужную позицию
     *
     * @param item     элемент
     * @param position позиция
     */
    void add(String item, int position);

    /**
     * Удаляет элемент из списка
     *
     * @param item элемент
     */
    void remove(String item);

    /**
     * Возвращает количество элементов в списке
     *
     * @return
     */
    int getNumberOfItems();

    /**
     * Возвращает имя списка
     *
     * @return
     */
    String getListName();

    /**
     * Устанавливает имя списка
     *
     * @param newListName имя списка
     */
    void setListName(String newListName);
}
