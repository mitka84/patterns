package ru.savochkindv.patterns.singleton.fourth;

/**
 * Четвертая реализация синглетона.
 * Все проблемы решены.
 * Одно но: синхронизация нужна только в первый раз.
 * Все остальные вызовы тратят время
 * Created by savochkindv on 19.01.2016.
 */
public final class FourthSingleton {

    private static FourthSingleton instance;

    private FourthSingleton() {
    }

    public static synchronized FourthSingleton getInstance(){
        if(instance == null){
            instance = new FourthSingleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException();
    }
}
