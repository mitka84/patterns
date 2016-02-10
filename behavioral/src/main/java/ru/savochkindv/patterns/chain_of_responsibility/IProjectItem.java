package ru.savochkindv.patterns.chain_of_responsibility;

import ru.savochkindv.patterns.model.interfaces.IContact;

import java.util.List;

/**
 * Интерфейс, описывающий элемент проекта
 * Created by savochkindv on 31.01.2016.
 */
public interface IProjectItem {

    /**
     * Конец строки
     */
    String EOL_STRING = System.getProperty("line.separator");

    /**
     * Возвращает родительский элемент проекта
     *
     * @return родительский элемент проекта
     */
    IProjectItem getParent();

    /**
     * Возвращает владельца элемента проекта
     *
     * @return владельца элемента проекта
     */
    IContact getOwner();

    /**
     * Возвращает описание элемента проекта
     *
     * @return описание элемента проекта
     */
    String getDetails();

    /**
     * Возвращает список дочерних элементов проекта
     *
     * @return список дочерних элементов проекта
     */
    List<IProjectItem> getProjectItems();
}
