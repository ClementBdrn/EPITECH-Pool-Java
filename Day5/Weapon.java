public abstract class Weapon {
    protected String name;
    protected int apcost;
    protected int damage;
    protected boolean melee;

    protected Weapon(String name, int apcost, int damage, boolean melee) {
        this.name = name;
        this.apcost = apcost;
        this.damage = damage;
        this.melee = melee;
    }

    // NAME
    public String getName() {
        return name;
    }

    // APCOST
    public int getApcost() {
        return apcost;
    }

    // DAMAGE
    public int getDamage() {
        return damage;
    }

    // MELEE
    public boolean isMelee() {
        return melee;
    }

    // METHODS
    public abstract void attack();
}
