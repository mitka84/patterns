package ru.savochkindv.patterns.singleton.second;

/**
 * Еще одна реализация синглетона.
 * Решена проблема многопоточности.
 * Минусы:
 * Отсутствует ленивая инициализация
 * Отсутствует возможность обработки исключительных ситуаций во время вызова конструктора.
 * Created by savochkindv on 19.01.2016.
 */
public class SecondSingleton {

    private static SecondSingleton instance = new SecondSingleton();

    private SecondSingleton(){
    }

    public static SecondSingleton getInstance(){
        return instance;
    }
}
