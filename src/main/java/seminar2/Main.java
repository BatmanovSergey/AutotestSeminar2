package seminar2;

public class Main {
    public static void main(String[] args) {

        NewsMakerAbstract newspaper = new Newspaper();
        NewsMakerAbstract magazine = new Magazine();
        Subscriber subscriber1 = new SubscriberImpl();
        Subscriber subscriber2 = new SubscriberImpl();

        newspaper.subscribe(subscriber1);
        magazine.subscribe(subscriber1);
        magazine.subscribe(subscriber2);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                publishingNews(newspaper, i);
            } else {
                publishingNews(magazine, i);
            }
        }
    }

    // ctrl+alt+m - вынести нужные строки в отдельный метод
    private static void publishingNews(NewsMakerAbstract newsMakerAbstract, int i) {
        newsMakerAbstract.setMessage("Новость " + i);
        newsMakerAbstract.sendMessage();
    }
}