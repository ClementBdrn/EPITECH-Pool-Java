public class Gecko {
    String name;

    public Gecko() {
        System.out.println("Hello!");
        this.name = "Unknown";
    }

    public Gecko(String name) {
        System.out.println("Hello " + name + "!");
        this.name = name;
    }
}
