package planet;

public class Mars {
    private int id;
    private static int count;
    private String landingSite;

    public Mars(String landingSite) {
        id = count;
        count++;

        this.landingSite = landingSite;
    }

    // ID
    public int getId() {
        return id;
    }

    // LANDING SITE
    public String getLandingSite() {
        return landingSite;
    }
}
