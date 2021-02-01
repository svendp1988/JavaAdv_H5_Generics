package be.pxl.ja.oefeningen;

import java.util.ArrayList;
import java.util.List;

public class Team <T> implements Comparable<Team<T>> {
    private final String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private final List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getLost() {
        return lost;
    }

    public int getTied() {
        return tied;
    }

    public List<T> getMembers() {
        return members;
    }

    public void addPlayer(T player) {
        members.add(player);
    }

    public int numberOfPlayers() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        played++;
        opponent.played++;
        if (ourScore > theirScore) {
            won++;
            opponent.lost++;
        } else if (ourScore < theirScore) {
            lost++;
            opponent.won++;
        } else {
            tied++;
            opponent.tied++;
        }
    }
    
    public int ranking() {
        return won * 3 + tied;
    }

    @Override
    public int compareTo(Team o) {
        return o.ranking() - ranking();
    }

    @Override
    public String toString() {
        return name;
    }
}
