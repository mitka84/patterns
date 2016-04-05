package ru.savochkindv.patterns.decorator;

import ru.savochkindv.patterns.model.interfaces.ProjectItem;

/**
 * Класс, обеспечиваеющий принципиальную возможность дополнения классов Task и Deliverable
 *
 * @author savochkindv
 *         Date: 05.04.2016.
 */
public abstract class ProjectDecorator implements ProjectItem {

    /**
     * Элемент проекта
     */
    private ProjectItem projectItem;

    protected ProjectItem getProjectItem() {
        return projectItem;
    }

    public void setProjectItem(ProjectItem projectItem) {
        this.projectItem = projectItem;
    }

    @Override
    public double getTimeRequired() {
        return projectItem.getTimeRequired();
    }
}
