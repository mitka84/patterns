package ru.savochkindv.patterns.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация интерфейса, описывающего список
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class OrderedListImpl implements IList {

    /**
     * Список элементов
     */
    private List<String> items = new ArrayList<>();

    @Override
    public void addItem(String item) {
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    @Override
    public void addItem(String item, int position) {
        if (!items.contains(item)) {
            items.add(position, item);
        }
    }

    @Override
    public void removeItem(String item) {
        if (items.contains(item)) {
            items.remove(item);
        }
    }

    @Override
    public int getNumberOfItems() {
        return items.size();
    }

    @Override
    public String getItem(int index) {
        if (index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    @Override
    public boolean supportsOrdering() {
        return true;
    }
}
