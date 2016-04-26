package ru.savochkindv.patterns.mvc;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Класс, запускающий пример
 *
 * @author savochkindv
 *         Date 26.04.2016.
 */
public class MAIN {

    public static void main(String[] args) {
        ContactModel model = new ContactModel();
        ContactEditView editorView = new ContactEditView(model);
        model.addContactView(editorView);
        createGui(editorView, "Contact Edit Window");

        ContactDisplayView displayView = new ContactDisplayView();
        model.addContactView(displayView);
        createGui(displayView, "Contact Display Window");
    }

    private static void createGui(JPanel view, String title) {
        JFrame applicationFrame = new JFrame(title);
        applicationFrame.getContentPane().add(view);
        applicationFrame.addWindowListener(new WindowCloseManager());
        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }

    private static class WindowCloseManager extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
