package be.pxl.ja.oefeningen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
    Team<BaseballPlayer> team;
    Team<BaseballPlayer> otherTeam;
    int teamMatchesPlayed;
    int otherTeamMatchesPlayed;

    @BeforeEach
    void setUp() {
        team = new Team<>("team");
        otherTeam = new Team<>("otherTeam");
        teamMatchesPlayed = 0;
        otherTeamMatchesPlayed = 0;
    }

    @Test
    void matchResultWhenGameWon() {
        team.matchResult(otherTeam, 5, 4);
        assertPlayedWonLostTied();
    }

    private void assertPlayedWonLostTied() {
        assertEquals(team.getPlayed(), teamMatchesPlayed + 1);
        assertEquals(otherTeam.getPlayed(), otherTeamMatchesPlayed + 1);
        assertEquals(team.getWon(), 1);
        assertEquals(otherTeam.getWon(), 0);
        assertEquals(team.getLost(), 0);
        assertEquals(otherTeam.getLost(), 1);
        assertEquals(team.getTied(), 0);
        assertEquals(otherTeam.getTied(), 0);
    }
}
