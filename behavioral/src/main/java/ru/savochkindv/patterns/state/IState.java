package ru.savochkindv.patterns.state;

/**
 * Интерфейс, описывающий действия при определенном состоянии
 *
 * @author savochkindv
 *         Date: 15.02.2016.
 */
public interface IState {

    /**
     * Выполнить действие
     */
    String doAction();

}
