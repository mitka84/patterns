package ru.savochkindv.patterns.abstract_factory;

/**
 * Реализация фабрики для французких адресов и телефонов
 * Created by savochkin on 25.01.2016.
 */
public class FrenchAddressFactoryImpl implements IAddressFactory {

    @Override
    public AbstractAddress createAddress() {
        return new FrenchAddressImpl();
    }

    @Override
    public AbstractPhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumberImpl();
    }
}
