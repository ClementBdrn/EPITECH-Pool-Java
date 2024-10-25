import java.util.ArrayList;
import java.util.List;

public class SpaceArena {
    private List<Monster> monsters = new ArrayList<>();
    private List<SpaceMarine> spaceMarines = new ArrayList<>();

    public void enlistMonsters(List<Monster> monstersToEnlist) {
        for (Monster monster : monstersToEnlist) {
            if (!monsters.contains(monster)) {
                monsters.add(monster);
            }
        }
    }

    public void enlistSpaceMarines(List<SpaceMarine> marinesToEnlist) {
        for (SpaceMarine marine : marinesToEnlist) {
            if (!spaceMarines.contains(marine)) {
                spaceMarines.add(marine);
            }
        }
    }

    public boolean fight() {
        if (monsters.isEmpty()) {
            System.out.println("No monsters available to fight.");
            return false;
        }
        if (spaceMarines.isEmpty()) {
            System.out.println("Those cowards ran away.");
            return false;
        }

        boolean hasRounds = false;

        while (!monsters.isEmpty() && !spaceMarines.isEmpty()) {
            hasRounds = true;

            for (SpaceMarine marine : spaceMarines) {
                if (marine.getHp() == 0) continue;
                if (monsters.isEmpty()) break;


                System.out.println(marine.getName() + " has entered the arena.");

                Monster targetMonster = monsters.get(0);

                if (marine.attack(targetMonster)) {
                    if (targetMonster.getHp() == 0) {
                        System.out.println(targetMonster.getName() + " has died.");
                        monsters.remove(targetMonster);
                    }
                } else {
                    if (!marine.moveCloseTo(targetMonster)) {
                        marine.recoverAP();
                    }
                }
            }

            for (Monster monster : monsters) {
                if (monster.getHp() == 0) continue;
                if (spaceMarines.isEmpty()) break;


                System.out.println(monster.getName() + " has entered the arena.");

                SpaceMarine targetMarine = spaceMarines.get(0);

                if (monster.attack(targetMarine)) {
                    if (targetMarine.getHp() == 0) {
                        System.out.println(targetMarine.getName() + " has died.");
                        spaceMarines.remove(targetMarine);
                    }
                } else {
                    if (!monster.moveCloseTo(targetMarine)) {
                        monster.recoverAP();
                    }
                }
            }

            if (monsters.isEmpty()) {
                System.out.println("The Space Marines are victorious.");
            } else if (spaceMarines.isEmpty()) {
                System.out.println("The monsters are victorious.");
            }
        }

        return hasRounds;
    }
}
