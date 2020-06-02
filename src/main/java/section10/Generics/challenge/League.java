package section10.Generics.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class League<A extends Team> {

    private String name;
    private ArrayList<A> teams = new ArrayList<>();

    public String getName() {
        return name;
    }

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam (A team){
        if(teams.contains(team)){
            System.out.println("Team already on this league");
            return false;
        }else {
            teams.add(team);
            System.out.println(team.getName() + " - succesfully added to " + this.name);
            return true;
        }
    }

    public void showLeagueTeams(League<A> league){
        for (A tea: league.teams
             ) {
            System.out.println(league.getName() +" members : " + Arrays.asList(tea.getName()));
        }
    }

}
