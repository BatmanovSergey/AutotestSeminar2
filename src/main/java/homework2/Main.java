package homework2;

public class Main {
    public static void main(String[] args) {

        Component apple1 = new Apple();
        Component apple2 = new Apple();
        Component pineapple1 = new Pineapple();

        Component pineapple2 = new Pineapple();
        Component pineapple3 = new Pineapple();
        Component apple3 = new Apple();

        Component pineapple4 = new Pineapple();
        Component apple4 = new Apple();

        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();

        box1.addComponent(apple1);
        box1.addComponent(apple2);
        box1.addComponent(apple3);

        box2.addComponent(pineapple2);
        box2.addComponent(pineapple3);
        box2.addComponent(pineapple1);
        box2.addComponent(box1);

        box.addComponent(pineapple4);
        box.addComponent(apple4);
        box.addComponent(box2);

        box.print();

        System.out.println(box.getCount());

    }
}
