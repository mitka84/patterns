package ru.savochkindv.patterns.singleton.second;

/**
 * ��� ���� ���������� ����������.
 * ������ �������� ���������������.
 * ������:
 * ����������� ������� �������������
 * ����������� ����������� ��������� �������������� �������� �� ����� ������ ������������.
 * Created by savochkindv on 19.01.2016.
 */
public final class SecondSingleton {

    private static SecondSingleton instance = new SecondSingleton();

    private SecondSingleton(){
    }

    public static SecondSingleton getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new UnsupportedOperationException();
    }
}
