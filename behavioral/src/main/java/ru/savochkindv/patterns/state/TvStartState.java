package ru.savochkindv.patterns.state;

/**
 * Класс, описывающий состояние включенного телевизора
 *
 * @author savochkindv
 *         Date: 15.02.2016.
 */
public class TvStartState implements IState {

    @Override
    public String doAction() {
        return "Телевизор включен";
    }

}
