package ru.savochkindv.patterns.factory_method;

/**
 * Класс, описывающий фабрику юнитов-пучеглазиков
 * Created by savochkindv on 27.01.2016.
 */
public class GoggleEyedFactory extends AbstractUnitFactory {

    @Override
    IUnit getUnit() {
        return new IUnit() {

            @Override
            public String getName() {
                return "GoggleEyed";
            }

            @Override
            public String getFace() {
                return "0_0";
            }

            @Override
            public String getWeapon() {
                return "==";
            }
        };
    }
}
