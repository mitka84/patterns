package ru.savochkindv.patterns.mediator;

/**
 * Класс, реализующий посредника
 * Created by savochkindv on 09.02.2016.
 */
public class MediatorImpl implements IMediator {

    /**
     * Коллега 1
     */
    private Colleague1Impl colleague1;

    /**
     * Коллега 2
     */
    private Colleague2Impl colleague2;

    public void setColleague1(Colleague1Impl colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(Colleague2Impl colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public void send(String message, AbstractColleague colleague) {
        if (colleague.equals(colleague2)) {
            colleague1.notify(message);
        } else {
            colleague2.notify(message);
        }
    }
}
