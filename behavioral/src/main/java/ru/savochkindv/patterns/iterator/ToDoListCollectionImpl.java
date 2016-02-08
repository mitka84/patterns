package ru.savochkindv.patterns.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Реализация коллекции списков задач
 * Created by savochkindv on 04.02.2016.
 */
public class ToDoListCollectionImpl implements ToDoListCollection {

    private Map<String, ToDoList> lists = new HashMap<>();

    @Override
    public void add(ToDoList list) {
        if (!lists.containsKey(list.getListName())) {
            lists.put(list.getListName(), list);
        }
    }

    @Override
    public void remove(ToDoList list) {
        lists.remove(list.getListName());
    }

    @Override
    public int getNumberOfItems() {
        return lists.size();
    }

    @Override
    public Iterator<ToDoList> getIterator() {
        return lists.values().iterator();
    }
}
