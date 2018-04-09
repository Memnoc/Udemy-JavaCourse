package Generics.MyChallenge;

import java.util.ArrayList;

public class Universe <T extends Warrior> implements Comparable<Universe<T>> {

    private String teamName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Universe(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Universe<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getTeamName() + message + opponent.getTeamName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Universe<T> universe) {
        if (this.ranking() > universe.ranking()) {
            return -1;
        } else if (this.ranking() < universe.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

}
