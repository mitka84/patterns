package ru.savochkindv.patterns.chain_of_responsibility;

import ru.savochkindv.patterns.common.IContact;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий проект
 * Created by savochkindv on 31.01.2016.
 */
public class Project implements IProjectItem {

    /**
     * Наименование проекта
     */
    private String name;

    /**
     * Владелец проекта
     */
    private IContact owner;

    /**
     * Описание проекта
     */
    private String details;

    /**
     * Список дочерних проектов/задач
     */
    private List<IProjectItem> projectItems = new ArrayList<>();

    /**
     * Конструктор
     */
    public Project() {
    }

    /**
     * Конструктор
     *
     * @param name    название
     * @param owner   владелец
     * @param details описание
     */
    public Project(String name, IContact owner, String details) {
        this.name = name;
        this.owner = owner;
        this.details = details;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Добавляет задачу в проект
     *
     * @param projectItem задача
     */
    public void addProjectItem(IProjectItem projectItem) {
        if (!projectItems.contains(projectItem)) {
            projectItems.add(projectItem);
        }
    }

    /**
     * Удаляет задачу из проекта
     *
     * @param projectItem удаляет задачу
     */
    public void removeProjectItem(IProjectItem projectItem) {
        projectItems.remove(projectItem);
    }

    @Override
    public IProjectItem getParent() {
        return null;
    }

    @Override
    public IContact getOwner() {
        return owner;
    }

    public void setOwner(IContact owner) {
        this.owner = owner;
    }

    @Override
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public List<IProjectItem> getProjectItems() {
        return projectItems;
    }

    @Override
    public String toString() {
        return name;
    }
}
