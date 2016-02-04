package ru.savochkindv.patterns.iterator;

import org.junit.Test;

import java.util.Random;

/**
 * Created by savochkindv on 04.02.2016.
 */
public class ListPrinterTest {

    private ToDoList toDoList = makeToDoList();

    private ToDoListCollection toDoListCollection = makeToDoListCollection();

    @Test
    public void testPrintToDoList() throws Exception {
        ListPrinter.printToDoList(toDoList, System.out);
    }

    @Test
    public void testPrintToDoListCollection() throws Exception {
        ListPrinter.printToDoListCollection(toDoListCollection, System.out);
    }

    @Test
    public void testPrintlteratingElement_ToDoList() throws Exception {
        ListPrinter.printlteratingElement(toDoList, System.out);
    }

    @Test
    public void testPrintlteratingElement_ToDoListCollection() throws Exception {
        ListPrinter.printlteratingElement(toDoListCollection, System.out);
    }

    private ToDoList makeToDoList() {
        Random rnd = new Random();
        ToDoList list = new ToDoListImpl();
        list.setListName("" + rnd.nextInt());
        for (int i = 0; i < 10; ++i) {
            list.add("" + rnd.nextInt());
        }
        return list;
    }

    private ToDoListCollection makeToDoListCollection() {
        ToDoListCollection collection = new ToDoListCollectionImpl();
        for (int i = 0; i < 10; ++i) {
            collection.add(makeToDoList());
        }
        return collection;
    }
}