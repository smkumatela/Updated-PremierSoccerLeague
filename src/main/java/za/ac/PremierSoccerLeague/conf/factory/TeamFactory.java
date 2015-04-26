package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class TeamFactory {
    public static Team createTeam(Map<String, String> values, Broadcaster channel,TechnicalTeam coach,
                                      List<Player> players){
        Team team = new Team
                .Builder(values.get("name"))
                .location(values.get("location"))
                .channel(channel)
                .coach(coach)
                .players(players).build();
        return team;
    }
}
