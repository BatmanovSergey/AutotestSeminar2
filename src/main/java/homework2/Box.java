package homework2;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> components = new ArrayList();

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void print() {
        for (Component component : components) {
            component.print();
        }
    }

    @Override
    public int getCount() {
        int count = 0;
        for (Component component : components) {
            count = count + component.getCount();
        }
        return count;
    }

}
