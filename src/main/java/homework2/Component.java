package homework2;

public interface Component {
    void print();

    default int getCount() {
        return 1;
    }
}
