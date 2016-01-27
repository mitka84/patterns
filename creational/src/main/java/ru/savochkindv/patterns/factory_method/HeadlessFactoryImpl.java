package ru.savochkindv.patterns.factory_method;

/**
 * Класс, описывающий фабрику юнитов без головы
 * Created by savochkindv on 27.01.2016.
 */
public class HeadlessFactoryImpl extends AbstractUnitFactory {

    @Override
    IUnit getUnit() {
        return new IUnit() {

            @Override
            public String getName() {
                return "Headless";
            }

            @Override
            public String getFace() {
                return "";
            }

            @Override
            public String getWeapon() {
                return "=|======";
            }
        };
    }
}
