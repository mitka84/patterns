package ru.savochkindv.patterns.singleton.second;

/**
 * ��� ���� ���������� ����������.
 * ������ �������� ���������������.
 * ������:
 * ����������� ������� �������������
 * ����������� ����������� ��������� �������������� �������� �� ����� ������ ������������.
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
