package ru.savochkindv.patterns.proxy;

import org.junit.*;
import ru.savochkindv.patterns.model.enums.AddressType;
import ru.savochkindv.patterns.model.helper.TestHelper;
import ru.savochkindv.patterns.model.interfaces.IAddress;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Класс, описывающий
 *
 * @author savochkindv
 *         Date 25.04.2016.
 */
public class AddressBookProxyTest {

    private static final String FILE_NAME = "test.data";

    private AddressBookProxy proxy = new AddressBookProxy(FILE_NAME);

    @BeforeClass
    public static void initTest() {
        ArrayList<IAddress> list = new ArrayList<>();
        list.add(TestHelper.makeAddress(AddressType.WORK, "Московская область", "Ногинск", "Бабушкина", "142407", "магазин"));
        list.add(TestHelper.makeAddress(AddressType.WORK, "Московская область", "Черноголовка", "Институтский проспект", "142432", "садик"));
        list.add(TestHelper.makeAddress(AddressType.HOME, "Московская область", "Черноголовка", "Институтский проспект", "142432", "жена"));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
        } catch (Exception e) {
            fail();
        }
    }

    @AfterClass
    public static void tearDownTest() {
        File file = new File(FILE_NAME);
        file.delete();
    }

    @Before
    public void setUp() {
        proxy = new AddressBookProxy(FILE_NAME);
    }

    @After
    public void tearDown() {
        proxy = null;
    }

    @Test
    public void add() throws Exception {
        proxy.add(TestHelper.makeAddress(AddressType.HOME, "Московская область", "Ногинск", "Юбилейная", "142407", "дом"));
        assertEquals("Московская область", proxy.getAddress("дом").getState());
        assertEquals("Ногинск", proxy.getAddress("дом").getCity());
        assertEquals("Юбилейная", proxy.getAddress("дом").getStreet());
        assertEquals("142407", proxy.getAddress("дом").getZipCode());
    }

    @Test
    public void getAllAddresses() throws Exception {
        proxy.add(TestHelper.makeAddress(AddressType.HOME, "Московская область", "Ногинск", "Юбилейная", "142407", "дом"));
        assertEquals(4, proxy.getAllAddresses().size());
    }

    @Test
    public void getAddress() throws Exception {
        assertEquals("Московская область", proxy.getAddress("магазин").getState());
        assertEquals("Ногинск", proxy.getAddress("магазин").getCity());
        assertEquals("Бабушкина", proxy.getAddress("магазин").getStreet());
        assertEquals("142407", proxy.getAddress("магазин").getZipCode());
    }

}