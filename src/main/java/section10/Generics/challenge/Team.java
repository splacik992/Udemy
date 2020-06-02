package section10.Generics.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Team<T extends Player> {

    private String name;
    private int played = 0;
    private int won = 0;
    private int lose = 0;
    private int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println("Player already on this team.");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getName() + " succesfully added to " + this.name);
            return true;
        }

    }

    public int numPlayers(){
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){

        String message;
      if(ourScore > theirScore) {
          won++;
          message = " beat " ;
      }else if(ourScore == theirScore){
          tied++;
          message = " drew with ";
      }
              else {
          lose++;
          message = " lost to ";
      }
      played++;
      if(opponent != null){
          System.out.println(this.getName() + message + opponent.getName());
          opponent.matchResult(null, theirScore,ourScore);
      }
    }

    public int ranking(){
        return (won *2 ) + tied;
    }


    public void showTeamPlayers(Team<T> team) {

        System.out.println(team.getName() + " players :");
        for (T players: team.members
             ) {
            System.out.println(Arrays.asList(players.getName()));
        }

        System.out.println("Team members : \n"
                +  team.numPlayers());
    }
}

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.
