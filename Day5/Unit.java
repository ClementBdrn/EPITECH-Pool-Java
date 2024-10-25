public abstract class Unit implements Fighter{
    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeTarget;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    // METHODS
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getAp() {
        return ap;
    }

    public Fighter getCloseTarget() {
        return closeTarget;
    }

    @Override
    public void receiveDamage(int damage) {
        if (hp > 0) {
            hp -= damage;
            if (hp <= 0) {
                hp = 0;
            }
        }
    }

    @Override
    public boolean moveCloseTo(Fighter target) {
        if (hp == 0) {
            return false;
        }

        if (target == this || target == closeTarget) {
            return false;
        }
        closeTarget = target;
        System.out.println(name + " is moving closer to " + target.getName() + ".");
        return true;
    }

    @Override
    public void recoverAP() {
        if (hp > 0) {
            ap = Math.min(ap + 7, 50);
        }
    }
}
