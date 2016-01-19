package ru.savochkindv.patterns.singleton.fifth;

/**
 * ����� ���������� ����������.
 * ��� �������� ������.
 * Created by savochkindv on 19.01.2016.
 */
public class FifthSingleton {

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
}
