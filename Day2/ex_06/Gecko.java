public class Gecko {
    // VARIABLES
    private String name;
    private int age;
    private int energy;

    // CONSTRUCTORS
    public Gecko(String name, int age) {
        System.out.println("Hello " + name + "!");
        setName(name);
        setAge(age);
        setEnergy(100);
    }

    public Gecko(String name) {
        System.out.println("Hello " + name + "!");
        setName(name);
        setEnergy(100);
    }

    public Gecko(int age) {
        System.out.println("Hello!");
        setName("Unknown");
        setAge(age);
        setEnergy(100);
    }

    public Gecko() {
        System.out.println("Hello!");
        setName("Unknown");
        setEnergy(100);
    }

    // NAME
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // AGE
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // ENERGY
    public int getEnergy() {
        return energy;
    }
    public void setEnergy(int energy) {
        if (energy > 100) {
            this.energy = 100;
        }
        else if (energy < 0) {
            this.energy = 0;
        }
        else {
            this.energy = energy;
        }
    }

    // METHODS
    public void status() {
        switch (age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String stringName) {
        System.out.println("Hello " + stringName + ", I'm " + getName() + "!");
    }
    public void hello(int iterations) {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Hello, I'm " + getName() + "!");
        }
    }

    public void eat(String food) {
        if (food.equalsIgnoreCase("Vegetable")) {
            System.out.println("Erk!");

            // Set Energy
            setEnergy(Math.max(getEnergy() - 10, 0));
        }
        else if (food.equalsIgnoreCase("Meat")) {
            System.out.println("Yummy!");

            // Set Energy
            setEnergy(Math.min(getEnergy() + 10, 100));
        }
        else {
            System.out.println("I can't eat this!");
        }
    }


}
