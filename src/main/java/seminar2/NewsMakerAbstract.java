package seminar2;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsMakerAbstract implements NewsMaker{
    protected String message;
    protected final List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void sendMessage() {
        for (Subscriber sub : subscribers) {
            sub.getMessage(message);
        }
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public abstract void setMessage(String message);

}
