package edu.ntnu.idatt1002.sysdev_k1_05_ets.ReadersAndWriters;

import edu.ntnu.idatt1002.sysdev_k1_05_ets.tournament.Team;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TeamWriterTest {


    @Test
    public void writeFileRun() throws IOException {
        ArrayList<String> members;
        members = new ArrayList<String>(Arrays.asList("a","a","a"));
        Team team1 = new Team(members, "team1","t1");
        Team team2 = new Team(members, "team2","t1");
        ArrayList<Team> listOfTeams = new ArrayList<>();
        listOfTeams.add(team1);
        listOfTeams.add(team2);
        TeamWriter.writeFile(listOfTeams,"8_team_file");
    }
}
