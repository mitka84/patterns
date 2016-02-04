package ru.savochkindv.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Реализация списка задач
 * Created by savochkindv on 04.02.2016.
 */
public class ToDoListImpl implements ToDoList {

    /**
     * Наименование списка
     */
    private String listName;

    /**
     * Список элементов
     */
    private List<String> items = new ArrayList<>();

    @Override
    public void add(String item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    @Override
    public void add(String item, int position) {
        if (!items.contains(item)) {
            items.add(position, item);
        }
    }

    @Override
    public void remove(String item) {
        items.remove(item);
    }

    @Override
    public int getNumberOfItems() {
        return items.size();
    }

    @Override
    public String getListName() {
        return listName;
    }

    @Override
    public void setListName(String newListName) {
        this.listName = newListName;
    }

    @Override
    public Iterator getIterator() {
        return items.iterator();
    }

    @Override
    public String toString() {
        return listName;
    }
}
