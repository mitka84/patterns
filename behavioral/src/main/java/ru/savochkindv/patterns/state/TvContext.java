package ru.savochkindv.patterns.state;

/**
 * Класс, описывающий контекст телевизора
 *
 * @author savochkindv
 *         Date: 15.02.2016.
 */
public class TvContext implements IState {

    /**
     * Состояние
     */
    private IState state;

    public IState getState() {
        return this.state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    @Override
    public String doAction() {
        return this.state.doAction();
    }
}
