public class Gecko {
    private String name;

    public Gecko() {
        System.out.println("Hello!");
        this.name = "Unknown";
    }

    public Gecko(String name) {
        System.out.println("Hello " + name + "!");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
