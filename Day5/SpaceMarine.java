import java.util.HashSet;
import java.util.Set;

public abstract class SpaceMarine extends Unit {
    protected Weapon weapon;
    private static Set<Weapon> equippedWeapons = new HashSet<>();

    protected SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
        this.weapon = null;
    }

    // WEAPON
    public Weapon getWeapon() {
        return weapon;
    }

    public boolean equip(Weapon newWeapon) {
        if (hp == 0) {
            return false;
        }

        if (newWeapon == null || equippedWeapons.contains(newWeapon)) {
            return false;
        }

        if (weapon != null) {
            equippedWeapons.remove(weapon);
        }

        this.weapon = newWeapon;
        equippedWeapons.add(newWeapon);
        System.out.println(name + " has been equipped with a " + weapon.getName() + ".");
        return true;
    }

    @Override
    public boolean attack(Fighter target) {
        if (hp == 0) {
            return false;
        }

        if (weapon == null) {
            System.out.println(name + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        }

        if (weapon.isMelee() && closeTarget != target) {
            System.out.println(name + ": I'm too far away from " + target.getName() + ".");
            return false;
        }

        if (ap < weapon.getApcost()) {
            return false;
        }

        ap -= weapon.getApcost();
        System.out.println(name + " attacks " + target.getName() + " with a " + weapon.getName() + ".");

        weapon.attack();

        target.receiveDamage(weapon.getDamage());

        return true;
    }

    @Override
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
    }

    @Override
    public boolean moveCloseTo(Fighter target) {
        if (weapon != null && weapon.isMelee()) {
            if (closeTarget == target) {
                return false;
            }
            closeTarget = target;
            System.out.println(name + " is moving closer to " + target.getName() + ".");
            return true;
        }

        return false;
    }

    @Override
    public void recoverAP() {
        ap = Math.min(ap + 9, 50);
    }
}
