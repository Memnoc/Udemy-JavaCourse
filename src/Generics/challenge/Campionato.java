package Generics.challenge;

import java.util.ArrayList;

public class Campionato<T extends Team> {

    private String tournamentName;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> teams = new ArrayList();

    public Campionato(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public boolean addTeam(T team){
        if(teams.contains(team)){
            System.out.println(team.getTeamName() + " is already in the tournament" );
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getTeamName() + " has entered the tournament " + this.tournamentName);
            return true;
        }
    }

    public int numTeams(){
        return this.teams.size();
    }

}
