package ru.savochkindv.patterns.iterator;

/**
 * Интерфейс, описывающий коллекцию из списков задач
 * Created by savochkindv on 04.02.2016.
 */
public interface ToDoListCollection extends Iterating<ToDoList> {

    /**
     * Добавляет в коллекцию список задач
     *
     * @param list список задач
     */
    void add(ToDoList list);

    /**
     * Удаляет список задач из коллекции
     *
     * @param list список задач
     */
    void remove(ToDoList list);

    /**
     * Возвращает количество списков задач в коллекции
     *
     * @return количество списков задач в коллекции
     */
    int getNumberOfItems();
}
