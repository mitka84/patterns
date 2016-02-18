package ru.savochkindv.patterns.strategy;

import ru.savochkindv.patterns.model.interfaces.IContact;

/**
 * Интерфейс, описывающий стратегию
 *
 * @author savochkindv
 *         Date: 16.02.2016.
 */
public interface ISummarizingStrategy {

    /**
     * Пробел
     */
    String SPACE = " ";

    /**
     * Двоеточие
     */
    String COLON = ": ";

    /**
     * Возвращает строку с отсортированным списком контактов,
     * в зависимости от выбранной стратегии
     *
     * @param contactsAsArray массив контактов
     * @return строку с отсортированным списком контактов
     */
    String summarize(IContact[] contactsAsArray);

    /**
     * Возвращает отсортированный массив строк, представляющих контакт
     *
     * @param contactsAsArray массив контактов
     * @return отсортированный массив строк
     */
    String[] makeSummarizedList(IContact[] contactsAsArray);

}
