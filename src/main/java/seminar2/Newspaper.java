package seminar2;

public class Newspaper extends NewsMakerAbstract {

    @Override
    public void setMessage(String message) {
        this.message = message + " Newspaper";
    }
}
