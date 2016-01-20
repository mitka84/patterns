package ru.savochkindv.patterns.pool_manager;

import ru.savochkindv.patterns.pool_manager.exceptions.EmptyPoolException;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, управляющий пулом
 * Created by savochkin on 20.01.2016.
 */
public class PoolManager {

    private List<PoolItem> items = new ArrayList<>();

    public void add(Object item) {
        items.add(new PoolItem(item));
    }

    /**
     * Возвращает объект из пула
     *
     * @return объект
     * @throws EmptyPoolException пул пустой или все объекты заняты
     */
    public Object get() throws EmptyPoolException {
        for (PoolItem pitem : items) {
            if (pitem.inUse == false) {
                pitem.inUse = true;
                return pitem.item;
            }
        }
        throw new EmptyPoolException();
    }

    /**
     * Освобождает объект в пуле
     *
     * @param item объект
     */
    public void release(Object item) {
        for (PoolItem pitem : items) {
            if (item == pitem.item) {
                pitem.inUse = false;
                return;
            }
        }
        throw new RuntimeException(item + " not found");
    }

    /**
     * Класс, оборачивающий объект в пуле
     */
    private static class PoolItem {

        /**
         * Используется ли объект
         */
        boolean inUse = false;

        /**
         * Объект
         */
        Object item;

        /**
         * Конструктор
         *
         * @param item объект
         */
        public PoolItem(Object item) {
            this.item = item;
        }
    }
}
