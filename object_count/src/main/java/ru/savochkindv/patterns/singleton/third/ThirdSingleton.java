package ru.savochkindv.patterns.singleton.third;

/**
 * ������ ���������� ����������.
 * �������� ��������������� � ������� ������������� ������.
 * ������: �������� �������� � ���������� �������������� �������� � ������������
 * Created by savochkindv on 19.01.2016.
 */
public class ThirdSingleton {

    private ThirdSingleton() {
    }

    private static class SingletonHolder{
        private final static ThirdSingleton instance = new ThirdSingleton();
    }

    public static ThirdSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
