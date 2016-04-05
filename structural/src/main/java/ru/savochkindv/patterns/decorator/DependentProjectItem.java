package ru.savochkindv.patterns.decorator;

import ru.savochkindv.patterns.model.interfaces.ProjectItem;

/**
 * @author savochkindv
 *         Date: 05.04.2016.
 */
public class DependentProjectItem extends ProjectDecorator {

    private ProjectItem dependentItem;

    public DependentProjectItem() {
    }

    public DependentProjectItem(ProjectItem dependentItem) {
        this.dependentItem = dependentItem;
    }

    public ProjectItem getDependentItem() {
        return dependentItem;
    }

    public void setDependentItem(ProjectItem dependentItem) {
        this.dependentItem = dependentItem;
    }

    @Override
    public String toString() {
        return getProjectItem().toString() + EOL_STRING + "\tProjectItem dependent on: " + dependentItem;
    }
}
