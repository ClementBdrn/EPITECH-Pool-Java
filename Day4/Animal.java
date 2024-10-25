public class Animal {
    protected enum Type {
        MAMMAL,
        FISH,
        BIRD
    };

    // VARIABLES
    private String name;
    private int legs;
    private Type type;
    private static int numberOfAnimals;
    private static int numberOfMammals;
    private static int numberOfFish;
    private static int numberOfBirds;

    // CONSTRUCTOR
    protected Animal(String name, int legs, Type type) {
        setName(name);
        this.legs = legs;
        this.type = type;

        numberOfAnimals++;
        System.out.println("My name is " + getName() + " and I am a " + getType() + "!");

        if (type == Type.MAMMAL) {
            numberOfMammals++;
        }
        else if (type == Type.FISH) {
            numberOfFish++;
        }
        else if (type == Type.BIRD) {
            numberOfBirds++;
        }
    }

    // NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // LEGS
    public int getLegs() {
        return legs;
    }

    // TYPE
    public String getType() {
        return type.toString().toLowerCase();
    }

    // NUMBER ANIMALS
    public static int getNumberOfAnimals() {
        if (numberOfAnimals >= 2 || numberOfAnimals == 0) {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        else if (numberOfAnimals == 1) {
            System.out.println("There is currently 1 animal in our world.");
        }

        return numberOfAnimals;
    }
    public static int getNumberOfMammals() {
        if (numberOfMammals >= 2 || numberOfMammals == 0) {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }
        else if (numberOfMammals == 1) {
            System.out.println("There is currently 1 mammal in our world.");
        }

        return numberOfMammals;
    }
    public static int getNumberOfFish() {
        if (numberOfFish >= 2 || numberOfFish == 0) {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }
        else if (numberOfFish == 1) {
            System.out.println("There is currently 1 fish in our world.");
        }

        return numberOfFish;
    }
    public static int getNumberOfBirds() {
        if (numberOfBirds >= 2 || numberOfBirds == 0) {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        else if (numberOfBirds == 1) {
            System.out.println("There is currently 1 bird in our world.");
        }

        return numberOfBirds;
    }
}
