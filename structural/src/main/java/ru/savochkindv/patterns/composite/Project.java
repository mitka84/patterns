package ru.savochkindv.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, являющийся корнем композиции и представляющий весь проект в целом.
 *
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class Project implements ProjectItem {

    private String name;

    private String description;

    private List<ProjectItem> projectItems = new ArrayList<>();

    public Project() {
    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void addProjectItem(ProjectItem item) {
        if (!projectItems.contains(item)) {
            projectItems.add(item);
        }
    }

    @Override
    public double getTimeRequired() {
        double totalTime = 0;
        for (ProjectItem item : projectItems) {
            totalTime += item.getTimeRequired();
        }
        return totalTime;
    }
}
