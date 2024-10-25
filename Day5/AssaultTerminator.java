public class AssaultTerminator extends SpaceMarine {
    protected AssaultTerminator(String name) {
        super(name, 150, 30);

        System.out.println(name + " has teleported from space.");
        equip(new PowerFist());
    }

    @Override
    public void receiveDamage(int damage) {
        int reducedDamage = Math.max(damage - 3, 1);
        super.receiveDamage(reducedDamage);
    }
}
