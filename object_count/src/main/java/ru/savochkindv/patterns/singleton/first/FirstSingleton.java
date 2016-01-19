package ru.savochkindv.patterns.singleton.first;

/**
 * Класс, реализующий синглетон
 * Самая примитивная реализация.
 * Не работает в многопоточной среде
 * Created by savochkindv on 19.01.2016.
 */
public final class FirstSingleton {

    private static FirstSingleton instance;

    private FirstSingleton() {
    }

    public static FirstSingleton getInstance(){
        if(instance == null){
            instance = new FirstSingleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException();
    }
}
