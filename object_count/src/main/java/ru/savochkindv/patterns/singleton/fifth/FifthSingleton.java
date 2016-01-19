package ru.savochkindv.patterns.singleton.fifth;

/**
 * Пятая реализация синглетона.
 * Все проблемы решены.
 * Created by savochkindv on 19.01.2016.
 */
public final class FifthSingleton {

    private static volatile FifthSingleton instance;

    private FifthSingleton() {
    }

    public static FifthSingleton getInstance(){
        if(instance == null){
            synchronized (FifthSingleton.class){
                if(instance == null) {
                    instance = new FifthSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException();
    }
}
