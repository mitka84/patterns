package ru.savochkindv.patterns.factory_method;

/**
 * Абстрактный класс, описывающий фабрику Юнитов
 * Created by savochkindv on 27.01.2016.
 */
public abstract class AbstractUnitFactory {

    /**
     * Отображает юнита
     */
    public void displayUnit() {
        IUnit unit = getUnit();
        System.out.println("Name: " + unit.getName());
        System.out.println(unit.getFace());
        System.out.println("/|\\" + unit.getWeapon());
        System.out.println("/ \\");
    }

    /**
     * Возвращает юнита
     *
     * @return юнита
     */
    abstract IUnit getUnit();
}
