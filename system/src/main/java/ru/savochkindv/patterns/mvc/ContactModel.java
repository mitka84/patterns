package ru.savochkindv.patterns.mvc;

import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isEmpty;

/**
 * Класс, описывающий модель
 *
 * @author savochkindv
 *         Date 26.04.2016.
 */
public class ContactModel {

    /**
     * Имя
     */
    private String firstName;

    /**
     * Фамилия
     */
    private String lastName;

    /**
     * Заголовок
     */
    private String title;

    /**
     * Организация
     */
    private String organization;

    /**
     * Список зарегестрированных вьюх
     */
    private List<ContactView> contactViews = new ArrayList<>();

    /**
     * Конструктор
     */
    public ContactModel() {
        this(null);
    }

    /**
     * Конструктор
     *
     * @param contactView вьюха
     */
    public ContactModel(ContactView contactView) {
        this.firstName = "";
        this.lastName = "";
        this.title = "";
        this.organization = "";
        if (contactView != null) {
            contactViews.add(contactView);
        }
    }

    public void addContactView(ContactView view) {
        if (!contactViews.contains(view)) {
            contactViews.add(view);
        }
    }

    public void removeContactView(ContactView view) {
        contactViews.remove(view);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * Обновление модели
     *
     * @param newFirstName        новое имя
     * @param newLastName         новая фамилия
     * @param newTitle            новый заголовок
     * @param newOrganizationName новое название организации
     */
    public void updateModel(String newFirstName, String newLastName, String newTitle, String newOrganizationName) {
        if (!isEmpty(newFirstName)) {
            setFirstName(newFirstName);
        }
        if (!isEmpty(newLastName)) {
            setLastName(newLastName);
        }
        if (!isEmpty(newTitle)) {
            setTitle(newTitle);
        }
        if (!isEmpty(newOrganizationName)) {
            setOrganization(newOrganizationName);
        }
        updateView();
    }

    /**
     * Обновление представлений
     */
    private void updateView() {
        for (ContactView view : contactViews) {
            view.refreshContactView(firstName, lastName, title, organization);
        }
    }
}
