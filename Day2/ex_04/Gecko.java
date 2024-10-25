public class Gecko {
    // VARIABLES
    private String name;
    private int age;

    // CONSTRUCTORS
    public Gecko(String name, int age) {
        System.out.println("Hello " + name + "!");
        setName(name);
        setAge(age);
    }

    public Gecko(String name) {
        System.out.println("Hello " + name + "!");
        setName(name);
    }

    public Gecko(int age) {
        System.out.println("Hello!");
        setName("Unknown");
        setAge(age);
    }

    public Gecko() {
        System.out.println("Hello!");
        setName("Unknown");
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
}
