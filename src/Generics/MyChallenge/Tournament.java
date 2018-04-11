package Generics.MyChallenge;

import java.util.ArrayList;
import java.util.Collections;

public class Tournament<T extends Universe> {

    public String name;
    private ArrayList<T> tournament = new ArrayList<>();

    public Tournament(String name) {
        this.name = name;
    }

    // Save universes to the tournament
    public boolean add (T universe) {
        if (tournament.contains(universe)) {
            return false;
        }
        tournament.add(universe);
        return true;
    }

    //
    public void showTournamentTable() {
        Collections.sort(tournament);
        for (T t : tournament) {
            System.out.println(t.getTeamName() + ": " + t.ranking());
        }
    }
}
