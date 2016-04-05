package ru.savochkindv.patterns.model;

import ru.savochkindv.patterns.model.interfaces.IContact;
import ru.savochkindv.patterns.model.interfaces.ProjectItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, представляющий коллекцию операций, подлежащих выполнению.
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class Task implements ProjectItem {

    private String name;

    private String details;

    private List<ProjectItem> projectItems = new ArrayList<>();

    private IContact owner;

    private double timeRequired;

    /**
     * Конструктор
     */
    public Task() {
    }

    /**
     * Конструктор
     *
     * @param name         наименование
     * @param details      детали
     * @param owner        владелец
     * @param timeRequired необходимое время
     */
    public Task(String name, String details, IContact owner, double timeRequired) {
        this.name = name;
        this.details = details;
        this.owner = owner;
        this.timeRequired = timeRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void addProjectItem(ProjectItem item) {
        if (!projectItems.contains(item)) {
            projectItems.add(item);
        }
    }

    public void removeProjectItem(ProjectItem item) {
        projectItems.remove(item);
    }


    public IContact getOwner() {
        return owner;
    }

    public void setOwner(IContact owner) {
        this.owner = owner;
    }

    @Override
    public double getTimeRequired() {
        double totalTime = timeRequired;
        for (ProjectItem item : projectItems) {
            totalTime += item.getTimeRequired();
        }
        return totalTime;
    }

    public void setTimeRequired(double timeRequired) {
        this.timeRequired = timeRequired;
    }
}
