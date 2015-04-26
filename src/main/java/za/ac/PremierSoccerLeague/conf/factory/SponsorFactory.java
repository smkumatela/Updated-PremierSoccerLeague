package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.Sponsor;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class SponsorFactory {
    public static Sponsor createSponsor(Map<String, String> values, List<Player> players){

        Sponsor sponsor = new Sponsor
                .Builder()
                .sponsors(values.get("sponsors"))
                .name(values.get("name"))
                .players(players)
                .build();

        return sponsor;
    }
}
