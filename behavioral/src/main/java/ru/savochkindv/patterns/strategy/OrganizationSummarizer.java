package ru.savochkindv.patterns.strategy;

import org.apache.commons.lang3.ObjectUtils;
import ru.savochkindv.patterns.model.interfaces.IContact;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Класс, реализующий стратегию сортировки по названию организации
 *
 * @author savochkindv
 *         Date: 16.02.2016.
 */
public class OrganizationSummarizer implements ISummarizingStrategy {


    /**
     * Компаратор
     */
    private Comparator<IContact> comparator = new OrganizationComparator();

    @Override
    public String summarize(IContact[] contacts) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(contacts, comparator);
        for (IContact contact : contacts) {
            sb.append(contact.getOrganization());
            sb.append(COLON);
            sb.append(contact.getLastName());
            sb.append(SPACE);
            sb.append(contact.getFirstName());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public String[] makeSummarizedList(IContact[] contacts) {
        Arrays.sort(contacts, comparator);
        String[] product = new String[contacts.length];
        for (int i = 0; i < contacts.length; i++) {
            product[i] = contacts[i].getOrganization() + COLON + contacts[i].getLastName() + SPACE +
                    contacts[i].getFirstName();
        }
        return product;
    }

    /**
     * Класс, реализующий компаратор
     */
    private class OrganizationComparator implements Comparator<IContact> {

        @Override
        public int compare(IContact o1, IContact o2) {
            if (o1 == null && o2 == null) {
                return 0;
            }
            if (o1 == null) {
                return -1;
            }
            if (o2 == null) {
                return 1;
            }
            int compareResult = ObjectUtils.compare(o1.getOrganization(), o2.getOrganization());
            if (compareResult == 0) {
                compareResult = ObjectUtils.compare(o1.getLastName(), o2.getLastName());
            }
            if (compareResult == 0) {
                compareResult = ObjectUtils.compare(o1.getFirstName(), o2.getFirstName());
            }
            return compareResult;
        }
    }
}
