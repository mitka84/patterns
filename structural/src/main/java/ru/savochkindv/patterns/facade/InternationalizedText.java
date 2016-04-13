package ru.savochkindv.patterns.facade;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Класс, описывающий интернациализованный текст
 *
 * @author savochkindv
 *         Date: 13.04.2016.
 */
public class InternationalizedText {

    /**
     * Файл со свойствами по умолчанию
     */
    private static final String DEFAULT_FILE_NAME = "";

    /**
     * Текстовые свойства
     */
    private Properties textProperties = new Properties();

    /**
     * Конструктор
     */
    public InternationalizedText() {
        this(DEFAULT_FILE_NAME);
    }

    /**
     * Конструктор
     *
     * @param fileName имя файла
     */
    public InternationalizedText(String fileName) {
        loadProperties(fileName);
    }

    public void setFileName(String fileName) {
        if (fileName != null) {
            loadProperties(fileName);
        }
    }

    /**
     * Возвращает свойство по ключу
     *
     * @param key ключ
     * @return свойство
     */
    public String getProperty(String key) {
        return getProperty(key, "");
    }

    /**
     * Возвращает свойство по ключу
     *
     * @param key          ключ
     * @param defaultValue значение по умолчанию
     * @return свойство либо значение по умолчанию
     */
    public String getProperty(String key, String defaultValue) {
        return textProperties.getProperty(key, defaultValue);
    }

    /**
     * Загружает свойства из файла
     *
     * @param fileName имя файла
     */
    private void loadProperties(String fileName) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(fileName)) {
            textProperties.load(resourceStream);
        } catch (IOException exc) {
            textProperties = new Properties();
        }
    }
}
