package homeworkTest;

import homework2.Apple;
import homework2.Box;
import homework2.Component;
import homework2.Pineapple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomeworkTest {
    static Component apple1;
    static Component apple2;
    static Component pineapple1;
    static Component pineapple2;
    static Box box;
    static Box box1;
    static Box box2;

    @BeforeAll
    static void setUp() {
        apple1 = new Apple();
        apple2 = new Apple();
        pineapple1 = new Pineapple();
        pineapple2 = new Pineapple();
        box = new Box();
        box1 = new Box();
        box2 = new Box();
        box1.addComponent(apple1);
        box1.addComponent(apple2);
        box2.addComponent(pineapple1);
        box1.addComponent(box2);
        box.addComponent(pineapple2);
        box.addComponent(box1);
    }

    @Test
    void getComponentsTest() {
        Assertions.assertEquals(2, box.getComponents().size());
        Assertions.assertEquals(3, box1.getComponents().size());
        Assertions.assertEquals(1, box2.getComponents().size());
    }

    @Test
    void getAllInBoxCountTest() {
        Assertions.assertEquals(4, box.getCount());
    }
    @Test
    void getInBoxCountTest() {
        Assertions.assertEquals(3, box1.getCount());
        Assertions.assertEquals(1, box2.getCount());
    }

}
