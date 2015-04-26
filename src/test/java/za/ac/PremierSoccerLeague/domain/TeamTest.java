package za.ac.PremierSoccerLeague.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.security.provider.certpath.Builder;
import za.ac.PremierSoccerLeague.conf.factory.PlayerFactory;
import za.ac.PremierSoccerLeague.conf.factory.TeamFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/04/25.
 */
public class TeamTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreateTeam() throws Exception {
        List<Player> players = new ArrayList<Player>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("name", "Chelsea");
        values.put("location", "London");

        String broadcast = "SS3";
        String technical = "Physical";

        Broadcaster brdcst = new Broadcaster.Builder(broadcast).build();
        TechnicalTeam tchtm = new TechnicalTeam.Builder(technical).build();


        Team team = TeamFactory.createTeam(values, brdcst, tchtm, players);

        Assert.assertEquals("Physical", technical);

    }

    @Test
    public void testUpdate() throws Exception {
        List<Player> players = new ArrayList<Player>();
        Map<String, String> values = new HashMap<String, String>();

        values.put("name", "Chelsea");
        values.put("location", "London");

        String broadcast = "SS3";
        String technical = "Physical";

        Broadcaster brdcst = new Broadcaster.Builder(broadcast).build();
        TechnicalTeam tchtm = new TechnicalTeam.Builder(technical).build();

        Team team = TeamFactory.createTeam(values, brdcst, tchtm, players);

        Team newTeam = new Team.Builder(team.getName()).copy(team).location("Stanford Bridge").build();

        Assert.assertEquals("Chelsea", newTeam.getName());
        Assert.assertEquals("Stanford Bridge", newTeam.getLocation());
        Assert.assertEquals("London", team.getLocation());


    }
}
