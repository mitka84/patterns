package ru.savochkindv.patterns.mediator;

/**
 * Интерфейс, описывающий посредника
 * Created by savochkindv on 09.02.2016.
 */
public interface IMediator {

    /**
     * Отправить сообщение коллеге
     *
     * @param message   сообщение
     * @param colleague коллелга
     */
    void send(String message, AbstractColleague colleague);

}
