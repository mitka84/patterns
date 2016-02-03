package ru.savochkindv.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, описывающий контекст
 * Created by savochkindv on 02.02.2016.
 */
public class Context {

    /**
     * Мапа
     */
    private Map map = new HashMap();

    /**
     * Возвращает объект по ключу
     *
     * @param name ключ
     * @return объект
     */
    public Object get(Object name) {
        return map.get(name);
    }

    /**
     * Добавляет объект
     *
     * @param name  ключ
     * @param value значение
     */
    public void addVariable(Object name, Object value) {
        map.put(name, value);
    }
}
