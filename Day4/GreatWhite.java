public class GreatWhite extends Shark{
    protected GreatWhite(String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            return false;
        }
        else if (animal == this) {
            return false;
        }

        return true;
    }

    @Override
    public void eat(Animal animal) {
        if (canEat(animal)) {
            setFrenzy(false);
            System.out.println(super.getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");

            if (animal instanceof Shark) {
                System.out.println(getName() + ": The best meal one could wish for.");
            }
        }
        else {
            if (animal instanceof Canary) {
                System.out.println(super.getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            }
            else {
                System.out.println(super.getName() + ": It's not worth my time.");
            }
        }
    }
}
