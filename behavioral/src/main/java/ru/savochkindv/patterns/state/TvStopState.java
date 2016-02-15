package ru.savochkindv.patterns.state;

/**
 * @author savochkindv
 *         Date: 15.02.2016.
 */
public class TvStopState implements IState {

    @Override
    public String doAction() {
        return "Телевизор выключен";
    }
}
