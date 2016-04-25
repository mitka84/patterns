package ru.savochkindv.patterns.proxy;

import java.io.*;

/**
 * Класс, описывающий утилиты для загрузки/выгрузки файлов
 *
 * @author savochkindv
 *         Date 25.04.2016.
 */
public class FileLoader {

    /**
     * Загружает объект
     *
     * @param inputFile файл
     * @return объект
     */
    public static Object loadData(File inputFile) {
        Object returnValue = null;
        if (inputFile.exists()) {
            if (inputFile.isFile()) {
                try (ObjectInputStream readIn = new ObjectInputStream(new FileInputStream(inputFile))) {
                    returnValue = readIn.readObject();
                } catch (ClassNotFoundException | IOException exc) {
                    exc.printStackTrace();
                }
            } else {
                System.err.println(inputFile + " is a directory.");
            }
        } else {
            System.err.println("File " + inputFile + "does not exist.");
        }
        return returnValue;
    }

    /**
     * Сохраняет объект
     *
     * @param outputFile файл
     * @param data       данные
     */
    public static void storeData(File outputFile, Serializable data) {
        try (ObjectOutputStream writeOut = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            writeOut.writeObject(data);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
