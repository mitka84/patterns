package ru.savochkindv.patterns.command;

import ru.savochkindv.patterns.model.Location;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Класс, реализующий редактор местоположения
 * Created by savochkindv on 01.02.2016.
 */
public class LocationEditorImpl implements ILocationEditor {

    private static final List<String> LOCATIONS = Arrays.asList(
            "Ногинск",
            "Черноголовка",
            "Москва",
            "Железнодорожный",
            "Подольск",
            "Чебоксары",
            "Казань",
            "Санкт-Петербург",
            "Сочи",
            "Королев"
    );

    private Random rnd = new Random();

    @Override
    public Location getNewLocation() {
        return new Location(LOCATIONS.get(rnd.nextInt(LOCATIONS.size())));
    }
}
