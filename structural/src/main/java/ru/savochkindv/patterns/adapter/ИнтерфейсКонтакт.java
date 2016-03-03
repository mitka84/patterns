package ru.savochkindv.patterns.adapter;

/**
 * Интерфейс, описывающий контакт на нетипичном языке
 *
 * @author savochkindv
 *         Date: 03.03.2016.
 */
public interface ИнтерфейсКонтакт {

    String вернутьИмя();

    String вернутьФамилия();

    String вернутьЗаголовок();

    String вернутьОрганизация();

    void установитьИмя(String имя);

    void установитьФамилия(String фамилия);

    void установитьЗаголовок(String заголовок);

    void установитьОрганизация(String организация);
}
