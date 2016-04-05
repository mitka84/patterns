package ru.savochkindv.patterns.decorator;

import org.junit.Test;
import ru.savochkindv.patterns.model.ContactImpl;
import ru.savochkindv.patterns.model.Deliverable;
import ru.savochkindv.patterns.model.Task;
import ru.savochkindv.patterns.model.interfaces.IContact;

import java.io.File;

/**
 * @author savochkindv
 *         Date: 05.04.2016.
 */
public class ProjectDecoratorTest {

    @Test
    public void testDecorators() throws Exception {
        IContact contact1 = new ContactImpl("Dennis", "Moore", "Managing Director", "Highway Man, LTD", null);
        Task taskl = new Task("Fortune", "Acquire a small fortune", contact1, 0);
        Task task2 = new Task("Isle", "Locate an island for sale", contact1, 7.5);
        Deliverable deliverable1 = new Deliverable("Island Paradise", "", contact1);

        System.out.println("Projectltem objects created. Results:");
        System.out.println(taskl);
        System.out.println(task2);
        System.out.println(deliverable1);
        System.out.println();

        System.out.println("Creating decorators");
        ProjectDecorator decorator1 = new SupportedProjectItem(new File("JavaHistory.txt"));
        ProjectDecorator decorator2 = new DependentProjectItem(task2);
        System.out.println("Decorators created. Adding decorators to the first task");
        decorator1.setProjectItem(taskl);
        decorator2.setProjectItem(decorator1);

        System.out.println();
        System.out.println("Decorators added. Results");
        System.out.println(decorator2);
    }
}