package ru.savochkindv.patterns.iterator;

import java.io.PrintStream;
import java.util.Iterator;

/**
 * Класс, описывающий методы для печати списков
 * Created by savochkindv on 04.02.2016.
 */
public class ListPrinter {

    /**
     * Печатает список задач
     *
     * @param list список задач
     * @param out  поток
     */
    public static void printToDoList(ToDoList list, PrintStream out) {
        Iterator<String> elements = list.getIterator();
        out.println(" List - " + list + ":");
        while (elements.hasNext()) {
            out.println("\t" + elements.next());
        }
    }

    /**
     * Печатает коллекцию списков задач
     *
     * @param lotsOfLists коллекция списков звдач
     * @param output      поток
     */
    public static void printToDoListCollection(ToDoListCollection lotsOfLists, PrintStream output) {
        Iterator<ToDoList> elements = lotsOfLists.getIterator();
        output.println("\"To Do\" ListCollection:");
        while (elements.hasNext()) {
            printToDoList(elements.next(), output);
        }
    }

    /**
     * Выводит на печать элемент
     *
     * @param element элемент
     * @param output  поток
     */
    public static void printlteratingElement(Iterating element, PrintStream output) {
        output.println("Printing the element " + element);
        Iterator elements = element.getIterator();
        while (elements.hasNext()) {
            Object currentElement = elements.next();
            if (currentElement instanceof Iterating) {
                printlteratingElement((Iterating) currentElement, output);
                output.println();
            } else {
                output.println(currentElement);
            }
        }
    }

}
