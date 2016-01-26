package ru.savochkindv.patterns.builder;

/**
 * Исключение, выбрасываемое, когда не все элементы встречи указаны
 * Created by savochkindv on 26.01.2016.
 */
public class InformationRequiredException extends Exception {

    /**
     * Необходима дата начала
     */
    public static final int START_DATE_REQUIRED = 1;
    /**
     * Необходима дата завершения
     */
    public static final int END_DATE_REQUIRED = 2;
    /**
     * Необходимо описание
     */
    public static final int DESCRIPTION_REQUIRED = 4;
    /**
     * Необходим список участников
     */
    public static final int ATTENDEE_REQUIRED = 8;
    /**
     * Необходимо местоположение
     */
    public static final int LOCATION_REQUIRED = 16;
    private static final String MESSAGE = "Appointment cannot be created because further information is required";
    /**
     * Необходимая информация
     */
    private int informationRequired;

    /**
     * Конструктор
     *
     * @param informationRequired необходимая информация
     */
    public InformationRequiredException(int informationRequired) {
        super(MESSAGE);
        this.informationRequired = informationRequired;
    }

    public int getInformationRequired() {
        return informationRequired;
    }
}
