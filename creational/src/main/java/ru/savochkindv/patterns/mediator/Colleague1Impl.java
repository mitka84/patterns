package ru.savochkindv.patterns.mediator;

/**
 * Класс, реализующий коллегу 1
 * Created by savochkindv on 09.02.2016.
 */
public class Colleague1Impl extends AbstractColleague {

    /**
     * Конструктор
     *
     * @param mediator посредник
     */
    public Colleague1Impl(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("Colleague1 gets message: " + message);
    }
}
