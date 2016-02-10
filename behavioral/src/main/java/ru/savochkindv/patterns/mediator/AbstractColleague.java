package ru.savochkindv.patterns.mediator;

/**
 * Абстрактный класс, описывающий коллегу
 * Created by savochkindv on 09.02.2016.
 */
public abstract class AbstractColleague {

    /**
     * Посредник
     */
    protected IMediator mediator;

    /**
     * Конструктор
     *
     * @param mediator посредник
     */
    public AbstractColleague(IMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Отправка сообщения
     *
     * @param message сообщение
     */
    public void send(String message) {
        mediator.send(message, this);
    }

    /**
     * Уведомить о сообщении
     *
     * @param message сообщение
     */
    public abstract void notify(String message);

}
