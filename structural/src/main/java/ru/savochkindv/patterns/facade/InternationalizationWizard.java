package ru.savochkindv.patterns.facade;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Играет роль фассада. Этот класс координирует взаимодействие клиента с несколькими объектами,
 * так или иначе связанными с выбранным национальным стандартом.
 *
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class InternationalizationWizard {

    private Map<NationType, Nation> map;

    private Currency currency = new Currency();

    private InternationalizedText propertyFile = new InternationalizedText();

    public InternationalizationWizard() {
        map = new HashMap<>();
        Nation[] nations = {
                new Nation(NationType.USA, '$', "+1", "us.properties", NumberFormat.getInstance(Locale.US)),
                new Nation(NationType.GER, 'f', "+31", "dutch.properties", NumberFormat.getInstance(Locale.GERMANY)),
                new Nation(NationType.FRA, 'f', "+33", "french.properties", NumberFormat.getInstance(Locale.FRANCE))
        };
        for (Nation nation : nations) {
            map.put(nation.getType(), nation);
        }
    }

    public void setNation(NationType type) {
        Nation nation = map.get(type);
        if (nation != null) {
            currency.setCurrencySymbol(nation.getSymbol());
            currency.setNumberFormat(nation.getNumberFormat());
            PhoneNumber.setSelectedInterPrefix(nation.getDialingPrefix());
            propertyFile.setFileName(nation.getPropertyFileName());
        }
    }

    public Nation[] getNations() {
        return map.values().toArray(new Nation[]{});
    }

    public Nation getNation(NationType type) {
        return map.get(type);
    }

    public char getCurrencySymbol() {
        return currency.getCurrencySymbol();
    }

    public NumberFormat getNumberFormat() {
        return currency.getNumberFormat();
    }

    public String getPhonePrefix() {
        return PhoneNumber.getSelectedInterPrefix();
    }

    public String getPropery(String key) {
        return propertyFile.getProperty(key);
    }

    public String getProperty(String key, String defaultValue) {
        return propertyFile.getProperty(key, defaultValue);
    }
}
