import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Astronaut> teamList;

    public Team(String teamName) {
        this.teamName = teamName;
        teamList = new ArrayList<Astronaut>();
    }

    // TEAM NAME
    public String getTeamName() {
        return teamName;
    }

    // TEAM LIST
    public ArrayList<Astronaut> getTeamList() {
        return teamList;
    }

    // METHODS
    public void add(Astronaut astronaut) {
        teamList.add(astronaut);
    }

    public void remove(Astronaut astronaut) {
        teamList.remove(astronaut);
    }

    public int countMembers() {
        return teamList.size();
    }

    public void showMembers() {
        ArrayList<Astronaut> members = getTeamList();
        String text = getTeamName() + ":";

        if (countMembers() <= 0) {
            return;
        }

        for (int i = 0; i < countMembers(); i++) {
            if (members.get(i).getDestination() != null) {
                text += " " + members.get(i).getName() + " on mission,";
            }
            else {
                text += " " + members.get(i).getName() + " on standby,";
            }
        }

        if (text.endsWith(",")) {
            text = text.substring(0, text.length() - 1) + ".";
        }

        System.out.println(text);
    }

    public void doActions() {
        System.out.println(getTeamName() + ": Nothing to do.");
    }
    public void doActions(chocolate.Mars mars) {
        if (countMembers() < 0) {
            return;
        }

        ArrayList<Astronaut> members = getTeamList();
        for (int i = 0; i < countMembers(); i++) {
            members.get(i).doActions(mars);
        }
    }
    public void doActions(planet.Mars mars) {
        if (countMembers() < 0) {
            return;
        }

        ArrayList<Astronaut> members = getTeamList();
        for (int i = 0; i < countMembers(); i++) {
            members.get(i).doActions(mars);
        }
    }
    public void doActions(planet.moon.Phobos moon) {
        if (countMembers() < 0) {
            return;
        }

        ArrayList<Astronaut> members = getTeamList();
        for (int i = 0; i < countMembers(); i++) {
            members.get(i).doActions(moon);
        }
    }
}
