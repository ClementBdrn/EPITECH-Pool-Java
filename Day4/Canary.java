public class Canary extends Animal {
    private int eggs;

    protected Canary(String name) {
        super(name, 2, Type.BIRD);

        setEggs(0);
        System.out.println("Yellow and smart? Here I am!");
    }

    // EGGS
    public int getEggsCount() {
        return eggs;
    }
    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    // METHODS
    public void layEgg() {
        setEggs(getEggsCount() + 1);
    }
}
