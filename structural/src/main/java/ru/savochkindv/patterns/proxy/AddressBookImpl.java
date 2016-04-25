package ru.savochkindv.patterns.proxy;

import ru.savochkindv.patterns.model.interfaces.IAddress;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий адресную книгу
 *
 * @author savochkindv
 *         Date 25.04.2016.
 */
public class AddressBookImpl implements AddressBook {

    private File file;

    private ArrayList<IAddress> addresses = new ArrayList<>();

    public AddressBookImpl(File file) {
        this.file = file;
        open();
    }

    @Override
    public void add(IAddress address) {
        if (!addresses.contains(address)) {
            addresses.add(address);
        }
    }

    @Override
    public List<IAddress> getAllAddresses() {
        return addresses;
    }

    @Override
    public IAddress getAddress(String description) {
        for (IAddress address : addresses) {
            if (address.getDescription().equalsIgnoreCase(description)) {
                return address;
            }
        }
        return null;
    }

    @Override
    public void open() {
        addresses = (ArrayList<IAddress>) FileLoader.loadData(file);
    }

    @Override
    public void save() {
        FileLoader.storeData(file, addresses);
    }
}
