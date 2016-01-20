package ru.savochkindv.patterns.messenger;

/**
 * Класс, предоставляющий методы для рассчетов
 * Created by savochkindv on 18.01.2016.
 */
public class Space {

    public static Point translate ( Point p, Vector v ) {
        p = new Point(p); // Не изменяем оригинал
        // Выполняем расчеты, используя v. Макет расчетов:
        p.setX(p.getX() + 1);
        p.setY(p.getY() + 1);
        p.setZ(p.getZ() + 1);
        return p;
    }

}
