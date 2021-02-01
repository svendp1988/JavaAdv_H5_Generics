package be.pxl.ja.oefeningen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Team<VolleybalPlayer> team = new Team<>("My Team");
        team.addPlayer(new VolleybalPlayer("Volley Jumper"));
//        team.addPlayer(new BaseballPlayer("Basement Jaxx"));
//        team.addPlayer(new SoccerPlayer("Cristiano Rooney"));

        System.out.println(team.numberOfPlayers());

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("My soccer Team");
//        team.matchResult(soccerPlayerTeam, 4, 0);

        Team<VolleybalPlayer> otherVolleybalTeam = new Team<>("My Other Team");
        team.matchResult(otherVolleybalTeam, 4, 2);

        System.out.println("Team lost: " + team.getLost());
        System.out.println("Other team lost: " +otherVolleybalTeam.getLost());
        System.out.println("Team won: " + team.getWon());
        System.out.println("Other team won: " + otherVolleybalTeam.getWon());
        System.out.println("Team tied: " + team.getTied());
        System.out.println("Other team tied: " + otherVolleybalTeam.getTied());

        System.out.println(team.compareTo(otherVolleybalTeam));

        List<Team<VolleybalPlayer>> teamList = new ArrayList<>();
        teamList.add(team);
        teamList.add(otherVolleybalTeam);
        System.out.println(teamList);
        Collections.sort(teamList);
        System.out.println(teamList);

    }
}
