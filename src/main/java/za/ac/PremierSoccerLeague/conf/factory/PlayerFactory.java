package za.ac.PremierSoccerLeague.conf.factory;

import za.ac.PremierSoccerLeague.domain.Player;
import za.ac.PremierSoccerLeague.domain.PremierSoccerLeague;
import za.ac.PremierSoccerLeague.domain.Sponsor;
import za.ac.PremierSoccerLeague.domain.Stadium;

import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class PlayerFactory {
    public static Player createPlayer(Map<String, String> values,
                                      List<Sponsor> sponsors){
        Player player = new Player
                .Builder(values.get("position"))
                .lastName(values.get("lastName"))
                .sponsors(sponsors)
                .build();
        return player;
    }
}
