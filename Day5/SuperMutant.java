public class SuperMutant extends Monster {

    private static int count = 0;
    private int id;

    public SuperMutant() {
        super("SuperMutant #" + (++count), 170, 20);
        this.damage = 60;
        this.apcost = 20;
        System.out.println(getName() + ": Roaarrr!");
    }

    @Override
    public void recoverAP() {
        super.recoverAP();
        if (hp < 170) {
            hp = Math.min(hp + 10, 170);
        }
    }

    @Override
    public boolean attack(Fighter target) {
        if (closeTarget == target) {
            if (ap >= apcost) {
                target.receiveDamage(damage);
                ap -= apcost;

                return true;
            }
        }

        return false;
    }
}
