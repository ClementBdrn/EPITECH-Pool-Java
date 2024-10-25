public class Cat extends Animal {
    private String color;

    // CONSTRUCTOR
    protected Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);

        this.color = color;
        System.out.println(super.getName() + ": MEEEOOWWWW");
    }

    protected Cat(String name) {
        super(name, 4, Type.MAMMAL);

        this.color = "grey";
        System.out.println(super.getName() + ": MEEEOOWWWW");
    }

    // COLOR
    public String getColor() {
        return color;
    }

    // METHODS
    public void meow() {
        System.out.println(super.getName() + " the " + getColor() + " kitty is meowing.");
    }
}
