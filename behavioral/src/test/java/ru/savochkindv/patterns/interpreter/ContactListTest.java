package ru.savochkindv.patterns.interpreter;

import org.junit.Test;
import ru.savochkindv.patterns.model.ContactImpl;
import ru.savochkindv.patterns.model.IContact;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by savochkindv on 03.02.2016.
 */
public class ContactListTest {

    private ContactList candidates = makeContactList();
    ;
    private Context ctx = new Context();
    private IContact testContact = new ContactImpl();

    @Test
    public void testContainsExpression() throws Exception {
        VariableExpression varLName = new VariableExpression(testContact, "getLastName");
        ConstantExpression constLName = new ConstantExpression("Сав");
        ContainsExpression eqLName = new ContainsExpression(varLName, constLName);
        List<IContact> result = candidates.getContactMatchingExpression(eqLName, ctx, testContact);
        System.out.println(result);
        assertEquals(3, result.size());
    }

    @Test
    public void testEqualsExpression() throws Exception {
        VariableExpression varOrganization = new VariableExpression(testContact, "getOrganization");
        ConstantExpression constOrganization = new ConstantExpression("садик");
        EqualsExpression eqOrganization = new EqualsExpression(varOrganization, constOrganization);
        List<IContact> result = candidates.getContactMatchingExpression(eqOrganization, ctx, testContact);
        System.out.println(result);
        assertEquals(2, result.size());
    }

    @Test
    public void testAndExpression() throws Exception {
        VariableExpression varOrganization = new VariableExpression(testContact, "getOrganization");
        ConstantExpression constOrganization = new ConstantExpression("садик");
        EqualsExpression eqOrganization = new EqualsExpression(varOrganization, constOrganization);

        VariableExpression varLastName = new VariableExpression(testContact, "getLastName");
        ConstantExpression constLastName = new ConstantExpression("Сав");
        ContainsExpression cLName = new ContainsExpression(varLastName, constLastName);
        AndExpression andExpr = new AndExpression(eqOrganization, cLName);
        List<IContact> result = candidates.getContactMatchingExpression(andExpr, ctx, testContact);
        System.out.println(result);
        assertEquals(1, result.size());
    }

    private ContactList makeContactList() {
        ContactList contactList = new ContactList();
        contactList.addContact(makeContact("Дмитрий", "Савочкин", "Папа", "БИФИТ"));
        contactList.addContact(makeContact("Светлана", "Савочкина", "Мама", "нет"));
        contactList.addContact(makeContact("Артем", "Долгов", "Старшенький", "садик"));
        contactList.addContact(makeContact("Максим", "Савочкин", "Младшенький", "садик"));
        return contactList;
    }

    private IContact makeContact(String firstName, String lastName, String title, String organization) {
        return new ContactImpl(firstName, lastName, title, organization);
    }
}