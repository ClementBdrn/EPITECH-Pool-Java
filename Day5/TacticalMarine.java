public class TacticalMarine extends SpaceMarine{
    private int weapon;

    protected TacticalMarine(String name) {
        super(name, 100, 20);

        System.out.println(name + " on duty.");
        equip(new PlasmaRifle());
    }

    @Override
    public void recoverAP() {
        ap = Math.min(ap + 12, 50);
    }
}
