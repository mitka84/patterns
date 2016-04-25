package ru.savochkindv.patterns.proxy;

import ru.savochkindv.patterns.model.interfaces.IAddress;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий прокси объект адресной книги
 *
 * @author savochkindv
 *         Date 25.04.2016.
 */
public class AddressBookProxy implements AddressBook {

    /**
     * Файл с адресной книгой
     */
    private File file;

    /**
     * Адресная книга
     */
    private AddressBookImpl addressBook;

    /**
     * Локальная адресная книга
     */
    private List<IAddress> localAddresses = new ArrayList<>();

    public AddressBookProxy(String filename) {
        file = new File(filename);
    }

    @Override
    public void add(IAddress address) {
        if (addressBook != null) {
            addressBook.add(address);
        } else if (!localAddresses.contains(address)) {
            localAddresses.add(address);
        }
    }

    @Override
    public List<IAddress> getAllAddresses() {
        if (addressBook == null) {
            open();
        }
        return addressBook.getAllAddresses();
    }

    @Override
    public IAddress getAddress(String description) {
        if (!localAddresses.isEmpty()) {
            for (IAddress address : localAddresses) {
                if (address.getDescription().equalsIgnoreCase(description)) {
                    return address;
                }
            }
        }
        if (addressBook == null) {
            open();
        }
        return addressBook.getAddress(description);
    }

    @Override
    public void open() {
        addressBook = new AddressBookImpl(file);
        for (IAddress address : localAddresses) {
            addressBook.add(address);
        }
    }

    @Override
    public void save() {
        if (addressBook != null) {
            addressBook.save();
        } else if (!localAddresses.isEmpty()) {
            open();
            addressBook.save();
        }
    }
}
