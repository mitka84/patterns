package ru.savochkindv.patterns.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.apache.commons.lang3.StringUtils.isAlpha;

/**
 * Класс, описывающий контроллер
 *
 * @author savochkindv
 *         Date 26.04.2016.
 */
public class ContactEditController implements ActionListener {

    private ContactModel model;

    private ContactEditView view;

    public ContactEditController(ContactModel model, ContactEditView view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == view.getUpdateRef()) {
            updateModel();
        }
    }

    private void updateModel() {
        String firstName = null;
        String lastName = null;
        if (isAlpha(view.getFirstName())) {
            firstName = view.getFirstName();
        }
        if (isAlpha(view.getLastName())) {
            lastName = view.getLastName();
        }
        model.updateModel(firstName, lastName, view.getTitle(), view.getOrganization());
    }
}
