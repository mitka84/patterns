package ru.savochkindv.patterns.abstract_factory;

/**
 * Реализация фабрики для французких адресов и телефонов
 * Created by savochkin on 25.01.2016.
 */
public class FrenchAddressFactory implements AddressFactory {

    @Override
    public Address createAddress() {
        return new FrenchAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new FrenchPhoneNumber();
    }
}
