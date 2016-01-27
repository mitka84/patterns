package ru.savochkindv.patterns.factory_method;

/**
 * Created by savochkindv on 27.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        new ChineseFactoryImpl().displayUnit();
        new HeadlessFactoryImpl().displayUnit();
        new GoggleEyedFactoryImpl().displayUnit();
    }
}
