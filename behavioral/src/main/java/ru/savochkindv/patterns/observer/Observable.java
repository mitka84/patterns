package ru.savochkindv.patterns.observer;

/**
 * Интерфейс, определяющий методы для добавления, удаления и оповещения наблюдателей;
 *
 * @author savochkindv
 *         Date: 11.02.2016.
 */
public interface Observable {

    /**
     * Регестрирует наблюдателя
     *
     * @param o наблюдатель
     */
    void registerObserver(Observer o);

    /**
     * Удаляет наблюдателя
     *
     * @param o наблюдатель
     */
    void removeObserver(Observer o);

    /**
     * Уведомляет наблюдателей
     */
    void notifyObservers();

}
