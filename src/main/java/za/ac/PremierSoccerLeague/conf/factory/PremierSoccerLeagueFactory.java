package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Stadium;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/24.
 */
public class PremierSoccerLeagueFactory {
    public static PremierSoccerLeague createPremierSoccerLeague(Map<String, String> values,
                                                                List<Stadium> stadiums){
        PremierSoccerLeague premierSoccerLeague = new PremierSoccerLeague
                .Builder(values.get("abbreviation"))
                .name(values.get("name"))
                .stadiums(stadiums)
                .build();
        return premierSoccerLeague;
    }
}
