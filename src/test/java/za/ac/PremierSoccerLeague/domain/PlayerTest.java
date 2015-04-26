package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.PremierSoccerLeague.conf.factory.PlayerFactory;
import za.ac.PremierSoccerLeague.conf.factory.PremierSoccerLeagueFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class PlayerTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreatePlayer() throws Exception {
        List<Sponsor> sponsors = new ArrayList<Sponsor>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("lastName", "Musona");
        values.put("position", "Striker");

        Player player = PlayerFactory
                .createPlayer(values, sponsors);

        Assert.assertEquals("Striker", player.getPosition());
        Assert.assertEquals("Musona", player.getLastName());
    }

    @Test
    public void testUpdate() throws Exception {

        List<Sponsor> sponsors = new ArrayList<Sponsor>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("lastName", "Musona");
        values.put("position", "Striker");

        Player player = PlayerFactory
                .createPlayer(values, sponsors);

        Player newPlayer = new Player
                .Builder(player.getPosition())
                .copy(player).lastName("Lebese").build();

        Assert.assertEquals("Striker", newPlayer.getPosition());
        Assert.assertEquals("Lebese", newPlayer.getLastName());
        Assert.assertEquals("Musona", player.getLastName());

    }
}
