package seminar2;

public class SubscriberImpl implements Subscriber {
    @Override
    public void getMessage(String message) {
        System.out.println(message);
    }
}
