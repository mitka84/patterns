package ru.savochkindv.patterns.singleton.fourth;

/**
 * ��������� ���������� ����������.
 * ��� �������� ������.
 * ���� ��: ������������� ����� ������ � ������ ���.
 * ��� ��������� ������ ������ �����
 * Created by savochkindv on 19.01.2016.
 */
public class FourthSingleton {

    private static FourthSingleton instance;

    private FourthSingleton() {
    }

    public static synchronized FourthSingleton getInstance(){
        if(instance == null){
            instance = new FourthSingleton();
        }
        return instance;
    }
}
