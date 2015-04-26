package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.*;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/26.
 */
public class LeagueFactory {
    public static League createLeague(Map<String, String> values, Broadcaster channel,
                                      List<Team> teams){
        League leaguee = new League
                .Builder(values.get("name"))
                .country(values.get("country"))
                .channel(channel)
                .team(teams)
                .build();

        return leaguee;
    }
}
