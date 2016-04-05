package ru.savochkindv.patterns.composite;

import org.junit.Test;
import ru.savochkindv.patterns.model.ContactImpl;
import ru.savochkindv.patterns.model.Deliverable;
import ru.savochkindv.patterns.model.Task;
import ru.savochkindv.patterns.model.interfaces.IContact;

import static junit.framework.TestCase.assertEquals;

/**
 * @author savochkindv
 *         Date: 09.03.2016.
 */
public class ProjectTest {

    private Project project = prepareData();

    @Test
    public void testGetTimeRequired() throws Exception {
        assertEquals(50.3, project.getTimeRequired());
    }

    private Project prepareData() {
        IContact contact1 = new ContactImpl("Dennis", "Moore", "Managing Director", "Highway Man, LTD", null);
        IContact contact2 = new ContactImpl("Joseph", "Mongolfier", "High Flyer", "Lighter than Air Productions", null);
        IContact contact3 = new ContactImpl("Erik", "Njoll", "Nomad without Portfolio", "Nordic Trek, Inc.", null);
        IContact contact4 = new ContactImpl("Lemming", "", "Principal Investigator", "BDA", null);
        project = new Project("IslandParadise", "Acquire a personal island paradise");
        Deliverable deliverable1 = new Deliverable("Island Paradise", "", contact1);
        Task taskl = new Task("Fortune", "Acquire a small fortune", contact4, 0);
        Task task2 = new Task("Isle", "Locate an island for sale", contact2, 7.5);
        Task task3 = new Task("Name", "Decide on a name for the island", contact3, 2);
        project.addProjectItem(deliverable1);
        project.addProjectItem(taskl);
        project.addProjectItem(task2);
        project.addProjectItem(task3);
        Deliverable deliverable11 = new Deliverable("$1,000,000", "(total net worth after taxes)", contact1);
        Task task11 = new Task("Fortunel", "Use psychic hotline to predict winning lottery numbers", contact4, 2.5);
        Task task12 = new Task("Fortune2", "Invest winnings to ensure 50% annual interest", contact1, 14.0);
        taskl.addProjectItem(task11);
        taskl.addProjectItem(task12);
        taskl.addProjectItem(deliverable11);
        Task task21 = new Task("Islel", "Research whether climate is better in the Atlantic or Pacific", contact1, 1.8);
        Task task22 = new Task("Isle2", "Locate an island for auction on EBay", contact4, 5.0);
        Task task23 = new Task("Isle2a", "Negotiate for sale of the island", contact3, 17.5);
        task2.addProjectItem(task21);
        task2.addProjectItem(task22);
        task2.addProjectItem(task23);
        Deliverable deliverable31 = new Deliverable("Island Name", "", contact1);
        task3.addProjectItem(deliverable31);
        return project;
    }
}