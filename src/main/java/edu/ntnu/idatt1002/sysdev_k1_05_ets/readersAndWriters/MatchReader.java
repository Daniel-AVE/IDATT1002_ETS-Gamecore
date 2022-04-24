package edu.ntnu.idatt1002.sysdev_k1_05_ets.readersAndWriters;

import edu.ntnu.idatt1002.sysdev_k1_05_ets.tournament.Match;
import edu.ntnu.idatt1002.sysdev_k1_05_ets.tournament.Team;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MatchReader {
    private static final String COMMA_DELIMITER = ",";
    private static final String SCORE_DELIMITER = "-";

    public MatchReader(){}

    public static ArrayList<Match> readMatchesFromArrayList(ArrayList<String> list)
    throws IOException{
        ArrayList<Match> matches = new ArrayList<>();

        for (int i = 13; i < list.size(); i++) {

            String line = list.get(i);
            String[] values = line.split(COMMA_DELIMITER);
            Team team1 = TeamReader.findAndReturnTeamUsingTeamName(values[2]);
            Match match = new Match(team1);
            if (values.length > 1) {
                Team team2 = TeamReader.findAndReturnTeamUsingTeamName(values[3]);
                match.setTeam2(team2);
                if (values.length > 2) {
                    LocalTime time = LocalTime.parse(values[2]);
                    match.setTimeOfMatch(time);
                    if (values.length > 3) {
                        int matchScoreTeam1 = Integer.parseInt(values[3]);
                        int matchScoreTeam2 = Integer.parseInt(values[4]);
                        match.setMatchScoreTeam1(matchScoreTeam1);
                        match.setMatchScoreTeam2(matchScoreTeam2);
                        match.setFinished(true);
                    }
                }
            }
            matches.add(match);
        }

        return matches;
    }
}
