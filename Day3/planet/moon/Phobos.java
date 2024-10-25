package planet.moon;

import planet.Mars;

public class Phobos {
    private Mars mars;
    private String landingSite;

    public Phobos(Mars mars, String landingSite) {
        this.mars = mars;
        this.landingSite = landingSite;

        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(String landingSite) {
        this.landingSite = landingSite;

        System.out.println("No planet given.");
    }

    // MARS
    public Mars getMars() {
        return mars;
    }

    // LANDING SITE
    public String getLandingSite() {
        return landingSite;
    }
}
