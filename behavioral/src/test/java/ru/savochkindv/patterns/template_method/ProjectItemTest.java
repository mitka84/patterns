package ru.savochkindv.patterns.template_method;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * @author savochkindv
 *         Date: 01.03.2016.
 */
public class ProjectItemTest {

    private Task task = prepareData();

    @Test
    public void testGetCostEstimate() throws Exception {
        double result = task.getCostEstimate();
        assertEquals(24000.0, result);
    }

    private Task prepareData() {
        Task primaryTask = new Task("Put a JVM on the moon", "Lunar mission as part of the JavaSpace program", 240.0, 100.0);
        primaryTask.addProjectItem(new Task("Establish ground control", "", 1000.0, 10.0));
        primaryTask.addProjectItem(new Task("Train the Javanaughts", "", 80.0, 30.0));
        Deliverable deliverableOne = new Deliverable("Lunar landing module", "Ask the local garage if they can make a few minor modifications to one of their cars", 2800, 40.0, 35.0);
        primaryTask.addProjectItem(deliverableOne);
        return primaryTask;
    }
}