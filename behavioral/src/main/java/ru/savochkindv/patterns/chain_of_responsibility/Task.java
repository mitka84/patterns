package ru.savochkindv.patterns.chain_of_responsibility;

import ru.savochkindv.patterns.common.IContact;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий задачу
 * Created by savochkindv on 31.01.2016.
 */
public class Task implements IProjectItem {

    /**
     * Наименование задачи
     */
    private String name;

    /**
     * Список дочерних задач
     */
    private List<IProjectItem> projectItems = new ArrayList<>();

    /**
     * Владелец задачи
     */
    private IContact owner;

    /**
     * Описание задачи
     */
    private String details;

    /**
     * Родитель задачи
     */
    private IProjectItem parent;

    /**
     * Флаг первичной задачи
     */
    private boolean primaryTask;

    /**
     * Конструктор
     *
     * @param parent родительская задача
     */
    public Task(IProjectItem parent) {
        this(parent, "", "", null, false);
    }

    /**
     * Конструктор
     *
     * @param parent      родительская задача
     * @param name        наименование задачи
     * @param details     описание задачи
     * @param owner       владелец задачи
     * @param primaryTask флаг первичной задачи
     */
    public Task(IProjectItem parent, String name, String details, IContact owner, boolean primaryTask) {
        this.owner = owner;
        this.details = details;
        this.parent = parent;
        this.primaryTask = primaryTask;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPrimaryTask() {
        return primaryTask;
    }

    public void setPrimaryTask(boolean primaryTask) {
        this.primaryTask = primaryTask;
    }

    /**
     * Добавляет подзадачу
     *
     * @param projectItem подзадача
     */
    public void addProjectItem(IProjectItem projectItem) {
        if (!projectItems.contains(projectItem)) {
            projectItems.add(projectItem);
        }
    }

    /**
     * Удаляет подзадачу
     *
     * @param projectItem подзадача
     */
    public void removeProjectItem(IProjectItem projectItem) {
        projectItems.remove(projectItem);
    }

    @Override
    public IProjectItem getParent() {
        return null;
    }

    public void setParent(IProjectItem parent) {
        this.parent = parent;
    }

    @Override
    public IContact getOwner() {
        if (owner == null) {
            return parent.getOwner();
        }
        return owner;
    }

    public void setOwner(IContact owner) {
        this.owner = owner;
    }

    @Override
    public String getDetails() {
        if (primaryTask) {
            return details;
        }
        return parent.getDetails() + EOL_STRING + "\t" + details;
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
