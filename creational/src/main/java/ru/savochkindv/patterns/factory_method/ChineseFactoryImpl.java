package ru.savochkindv.patterns.factory_method;

/**
 * Класс, описывающий фабрику юнитов - китайцев
 * Created by savochkindv on 27.01.2016.
 */
public class ChineseFactoryImpl extends AbstractUnitFactory {

    @Override
    IUnit getUnit() {
        return new IUnit() {

            @Override
            public String getName() {
                return "Chinese";
            }

            @Override
            public String getFace() {
                return "-_-";
            }

            @Override
            public String getWeapon() {
                return "=|---";
            }
        };
    }
}
