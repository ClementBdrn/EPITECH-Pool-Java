import java.util.Objects;

public class Shark extends Animal{
    private boolean frenzy;

    protected Shark(String name) {
        super(name, 0, Type.FISH);

        setFrenzy(false);
        System.out.println("A KILLER IS BORN!");
    }

    // FRENZY
    public boolean isFrenzy() {
        return frenzy;
    }
    public void setFrenzy(boolean frenzy) {
        this.frenzy = frenzy;
    }

    // METHODS
    public void smellBlood(boolean bool) {
        setFrenzy(bool);
    }

    public void status() {
        if (isFrenzy()) {
            System.out.println(super.getName() + " is smelling blood and wants to kill.");
        }
        else {
            System.out.println(super.getName() + " is swimming peacefully.");
        }
    }

    public boolean canEat(Animal animal) {
        if (animal == this) {
            return false;
        }
        else {
            return true;
        }
    }

    public void eat(Animal animal) {
        if (canEat(animal)) {
            setFrenzy(false);
            System.out.println(super.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
        }
        else {
            System.out.println(super.getName() + ": It's not worth my time.");
        }
    }
}
