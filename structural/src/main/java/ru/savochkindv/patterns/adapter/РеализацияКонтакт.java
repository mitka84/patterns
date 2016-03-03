package ru.savochkindv.patterns.adapter;

/**
 * Класс, реализующий интерфейс контакта на нетипичном языке
 *
 * @author savochkindv
 *         Date: 03.03.2016.
 */
public class РеализацияКонтакт implements ИнтерфейсКонтакт {

    private String имя;

    private String фамилия;

    private String заголовок;

    private String организация;


    @Override
    public String вернутьИмя() {
        return имя;
    }

    @Override
    public String вернутьФамилия() {
        return фамилия;
    }

    @Override
    public String вернутьЗаголовок() {
        return заголовок;
    }

    @Override
    public String вернутьОрганизация() {
        return организация;
    }

    @Override
    public void установитьИмя(String имя) {
        this.имя = имя;
    }

    @Override
    public void установитьФамилия(String фамилия) {
        this.фамилия = фамилия;
    }

    @Override
    public void установитьЗаголовок(String заголовок) {
        this.заголовок = заголовок;
    }

    @Override
    public void установитьОрганизация(String организация) {
        this.организация = организация;
    }
}
