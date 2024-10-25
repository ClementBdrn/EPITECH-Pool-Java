package chocolate;

public class Mars {
    private int id;
    private static int count;

    public Mars() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }
}

