package ru.savochkindv.patterns.template_method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Класс, описывающий задачу
 *
 * @author savochkindv
 *         Date: 01.03.2016.
 */
public class Task extends ProjectItem {

    /**
     * Список элементов проекта
     */
    private List<ProjectItem> projectItems = new ArrayList<>();

    /**
     * Время выполнения задачи
     */
    private double taskTimeRequired;

    /**
     * Конструктор
     */
    public Task() {
    }

    /**
     * Конструктор
     *
     * @param name             имя
     * @param description      описание
     * @param taskTimeRequired время выполнения задачи
     * @param rate             ставка
     */
    public Task(String name, String description, double taskTimeRequired, double rate) {
        super(name, description, rate);
        this.taskTimeRequired = taskTimeRequired;
    }

    public void setProjectItems(List<ProjectItem> projectItems) {
        this.projectItems = projectItems;
    }

    public void addProjectItem(ProjectItem element) {
        if (projectItems.contains(element)) {
            projectItems.add(element);
        }
    }

    public void removeProjectltem(ProjectItem element) {
        projectItems.remove(element);
    }

    public void setTaskTimeRequired(double taskTimeRequired) {
        this.taskTimeRequired = taskTimeRequired;
    }

    @Override
    protected double getMaterialsCost() {
        double totalCost = 0;
        Iterator<ProjectItem> items = getProjectItemIterator();
        while (items.hasNext()) {
            totalCost += items.next().getMaterialsCost();
        }
        return totalCost;
    }

    @Override
    protected double getTimeRequired() {
        double totalTime = taskTimeRequired;
        Iterator<ProjectItem> items = getProjectItemIterator();
        while (items.hasNext()) {
            totalTime += items.next().getTimeRequired();
        }
        return totalTime;
    }

    private Iterator<ProjectItem> getProjectItemIterator() {
        return projectItems.iterator();
    }
}
