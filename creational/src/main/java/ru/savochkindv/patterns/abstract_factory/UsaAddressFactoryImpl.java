package ru.savochkindv.patterns.abstract_factory;

/**
 * Класс, реализующий фабрику для адресов и телефонов США
 * Created by savochkindv on 25.01.2016.
 */
public class UsaAddressFactoryImpl implements IAddressFactory {

    @Override
    public AbstractAddress createAddress() {
        return new UsaAddressImpl();
    }

    @Override
    public AbstractPhoneNumber createPhoneNumber() {
        return new UsaPhoneNumberImpl();
    }
}
