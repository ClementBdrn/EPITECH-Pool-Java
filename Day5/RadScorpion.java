public class RadScorpion extends Monster{
    private static int count;
    private int id = count;

    public RadScorpion() {
        super("RadScorpion #" + (++count), 80, 50);
        this.damage = 25;
        this.apcost = 8;
        System.out.println(getName() + ": Crrr!");
    }

    @Override
    public boolean attack(Fighter target) {
        if (closeTarget != target) {
            System.out.println(getName() + ": I'm too far away from " + target.getName() + ".");
            return false;
        }

        if (ap < apcost) {
            System.out.println(getName() + ": I don't have enough action points to attack");
            return false;
        }

        ap -= apcost;

        if (target instanceof SpaceMarine && !(target instanceof AssaultTerminator)) {
           target.receiveDamage(damage*2);
        }
        else {
            target.receiveDamage(damage);
        }

        System.out.println(getName() + ": attacks " + target.getName() + ".");
        return true;
    }
}
