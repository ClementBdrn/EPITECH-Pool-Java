public class Astronaut {
    private String name;
    private int snacks;
    private String destination;
    private int id;
    private static int countId;

    public Astronaut(String name) {
        id = countId;
        countId++;

        this.name = name;
        this.snacks = 0;
        this.destination = null;

        System.out.println(name + " ready for launch!");
    }

    // NAME
    /*public void setName(String name) {
        this.name = name;
    }*/
    public String getName() {
        return name;
    }

    // ID
    public int getId() {
        return id;
    }

    // SNACKS
    /*public void setSnacks(int snacks) {
        this.snacks = snacks;
    }*/
    public int getSnacks() {
        return snacks;
    }

    // DESTINATION
    /*public void setDestination(String destination) {
        this.destination = destination;
    }*/
    public String getDestination() {
        return destination;
    }

    // METHODS
    public void doActions(planet.Mars planetMars) {
        System.out.println(name + ": Started a mission!");
        this.destination = planetMars.getLandingSite();
        if (this.destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
    public void doActions(chocolate.Mars chocoMars) {
        System.out.println(name + ": Thanks for this Mars number " + chocoMars.getId());
        this.snacks++;
        if (this.destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
    public void doActions(planet.moon.Phobos moonPhobos) {
        System.out.println(name + ": Started a mission!");
        this.destination = moonPhobos.getLandingSite();
        if (this.destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
    public void doActions() {
        System.out.println(name + ": Nothing to do.");
        if (this.destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }
}
