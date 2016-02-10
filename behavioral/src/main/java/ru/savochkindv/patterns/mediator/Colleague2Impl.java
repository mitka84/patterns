package ru.savochkindv.patterns.mediator;

/**
 * Класс, реализующий коллегу 2
 * Created by savochkindv on 09.02.2016.
 */
public class Colleague2Impl extends AbstractColleague {

    /**
     * Конструктор
     *
     * @param mediator посредник
     */
    public Colleague2Impl(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague2 gets message: " + message);
    }
}
