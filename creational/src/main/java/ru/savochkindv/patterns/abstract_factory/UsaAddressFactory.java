package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, реализующий фабрику для адресов и телефонов США
 * Created by savochkindv on 25.01.2016.
 */
public class UsaAddressFactory implements AddressFactory {

    @Override
    public Address createAddress() {
        return new UsaAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new UsaPhoneNumber();
    }
}
