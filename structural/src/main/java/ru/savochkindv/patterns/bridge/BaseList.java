package ru.savochkindv.patterns.bridge;

/**
 * Класс, представляющий перечень выполняемых над списком операций
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class BaseList {

    /**
     * Реализация списка
     */
    protected IList implementor;

    public void setImplementor(IList implementor) {
        this.implementor = implementor;
    }

    /**
     * Добавляет элемент в список
     *
     * @param item элемент
     */
    public void add(String item) {
        implementor.addItem(item);
    }

    /**
     * Добавляет элемент в список в указанную позицию
     *
     * @param item     элемент
     * @param position позиция
     */
    public void add(String item, int position) {
        if (implementor.supportsOrdering()) {
            implementor.addItem(item, position);
        }
    }

    /**
     * Удаляет элемент из списка
     *
     * @param item элемент
     */
    public void remove(String item) {
        implementor.removeItem(item);
    }

    /**
     * Возвращает элемент по указанному индексу
     *
     * @param index индекс
     * @return элемент
     */
    public String get(int index) {
        return implementor.getItem(index);
    }

    /**
     * Возвращает количество элементов в списке
     *
     * @return количество элементов в списке
     */
    public int count() {
        return implementor.getNumberOfItems();
    }
}
