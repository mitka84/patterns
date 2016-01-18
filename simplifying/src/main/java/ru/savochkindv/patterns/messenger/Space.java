package ru.savochkindv.patterns.messenger;

/**
 * �����, ��������������� ������ ��� ���������
 * Created by savochkindv on 18.01.2016.
 */
public class Space {

    public static Point translate ( Point p, Vector v ) {
        p = new Point ( p ) ; // �� �������� ��������
        // ��������� �������, ��������� v. ����� ��������:
        p.setX(p.getX() + 1);
        p.setY(p.getY() + 1);
        p.setZ(p.getZ() + 1);
        return p;
    }

}
