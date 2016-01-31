package ru.savochkindv.patterns.chain_of_responsibility;

import org.junit.Test;
import ru.savochkindv.patterns.common.ContactImpl;
import ru.savochkindv.patterns.common.IContact;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by savochkindv on 31.01.2016.
 */
public class ProjectTest {

    private Project project = null;

    @Test
    public void testCreateProject() throws Exception {
        prepareProject();
        assertNull(project.getParent());
        List<IProjectItem> projectItems = project.getProjectItems();
        assertEquals(1, projectItems.size());
        List<IProjectItem> baseTask = projectItems.get(0).getProjectItems();
        assertEquals(1, baseTask.size());
        List<IProjectItem> matherTask = baseTask.get(0).getProjectItems();
        assertEquals(3, matherTask.size());
        assertEquals("Савочек", matherTask.get(0).getOwner().getTitle());
        assertEquals("", matherTask.get(1).getOwner().getTitle());
        assertEquals("Овечка", matherTask.get(2).getOwner().getTitle());
    }

    private Project prepareProject() {
        IContact projectOwner = newContact("Дмитрий", "Савочкин", "Савок", "нет");
        IContact task1Owner = newContact("Светлана", "Савочкина", "Овечка", "нет");
        IContact task2Owner = newContact("Максим", "Савочкин", "Савочек", "нет");
        IContact task3Owner = newContact("Артем", "Долгов", "", "нет");
        project = new Project("testProject", projectOwner, "Тестовый проект");
        Task baseTask = new Task(project, "Общая задача", "Описание", null, true);
        project.addProjectItem(baseTask);
        Task motherTask = new Task(baseTask, "Мамина задача", "Описание маминой задачи", task1Owner, false);
        baseTask.addProjectItem(motherTask);
        Task maksimTask = new Task(motherTask, "Задача Максика", "Описание Максимкиной задачи", task2Owner, false);
        motherTask.addProjectItem(maksimTask);
        Task artemTask = new Task(motherTask, "Задача Темы", "Описание Теминой задачи", task3Owner, false);
        motherTask.addProjectItem(artemTask);
        motherTask.addProjectItem(new Task(motherTask));
        return project;
    }

    private IContact newContact(String firstName, String lastName, String title, String organization) {
        return new ContactImpl(firstName, lastName, title, organization);
    }
}