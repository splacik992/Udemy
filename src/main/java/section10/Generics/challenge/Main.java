package section10.Generics.challenge;

public class Main {

    public static void main(String[] args) {
//        FootballPlayer marcin = new FootballPlayer("Marcin");
//        BaseballPlayer wojtek = new BaseballPlayer("Wojtek");
//        SoccerPlayer kuba = new SoccerPlayer("Kuba");
//        BaseballPlayer kk = new BaseballPlayer("Kujbik");
//
//        Team<BaseballPlayer> lions = new Team<>("Lions");
//        Team<SoccerPlayer> tigers = new Team<>("Tigers");
//        Team<FootballPlayer> jagiellonia = new Team<>("Jaga");


        League<Team<FootballPlayer>> footballLeague = new League<>("EXTRAKLASA");
        Team<FootballPlayer> jaga = new Team<>("Jagiellonia");
        Team<FootballPlayer> legia = new Team<>("Legia");
        Team<FootballPlayer> wisla = new Team<>("Wisla");
        //Team<BaseballPlayer> ooo = new Team<>("ooo");
        // Cant add different sport team to football league

        jaga.matchResult(legia, 1,3);
        jaga.matchResult(wisla, 5,1);
        wisla.matchResult(legia, 2,2);
        wisla.matchResult(jaga, 2,4);


        footballLeague.addTeam(jaga);
        footballLeague.addTeam(legia);
        footballLeague.addTeam(wisla);

        footballLeague.showLeagueTeams(footballLeague);

//        jagiellonia.addPlayer(marcin);
//        lions.addPlayer(wojtek);
//        lions.addPlayer(kk);
//        tigers.addPlayer(kuba);
//
//        lions.showTeamPlayers(lions);
//
//
//        System.out.println(tigers.numPlayers());

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