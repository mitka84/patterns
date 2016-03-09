package ru.savochkindv.patterns.bridge;

/**
 * Класс, реализующий нумерованный список
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class NumberedList extends BaseList {

    @Override
    public String get(int index) {
        return (index + 1) + ". " + super.get(index);
    }
}
