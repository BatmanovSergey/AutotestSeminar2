package seminar2;

public class Magazine extends NewsMakerAbstract {
    @Override
    public void setMessage(String message) {
        this.message = message + " " + this.getClass().getName();
    }
}
