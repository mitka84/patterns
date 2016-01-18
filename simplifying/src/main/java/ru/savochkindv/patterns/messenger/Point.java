package ru.savochkindv.patterns.messenger;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * �����, ����������� ���������� ����� (���������)
 *
 * Created by savochkindv on 18.01.2016.
 */
public class Point {

    private int x, y, z;

    /**
     * ����������
     * @param x ���������� x
     * @param y ���������� y
     * @param z ���������� z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * ����������� �����������
     * @param point �����
     */
    public Point(Point point) {
        this.x = point.x;
        this.y = point.y;
        this.z = point.z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
