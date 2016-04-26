package ru.savochkindv.patterns.mvc;

import javax.swing.*;
import java.awt.*;

/**
 * Класс, описывающий представление, обеспечивающее отображение обновленной информации модели,
 * но не поддерживает работу с контроллером, являясь примером реализации поведения "только чтение".
 *
 * @author savochkindv
 *         Date 26.04.2016.
 */
public class ContactDisplayView extends JPanel implements ContactView {

    private JTextArea display;

    public ContactDisplayView() {
        createGui();
    }

    /**
     * Построение GUI
     */
    public void createGui() {
        setLayout(new BorderLayout());
        display = new JTextArea(10, 40);
        display.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(display);
        this.add(scrollDisplay, BorderLayout.CENTER);
    }

    @Override
    public void refreshContactView(String firstName, String lastName, String title, String organization) {
        display.setText("UPDATED CONTACT:\nNEW VALUES:\n" +
                "\tName: " + firstName + " " + lastName +
                "\n" + "\tTitle: " + title + "\n" +
                "\tOrganization: " + organization);
    }
}
