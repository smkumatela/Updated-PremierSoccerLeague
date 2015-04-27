package za.ac.PremierSoccerLeague.domain;

<<<<<<< HEAD
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Team implements Serializable{
    @Id
    private Long id;
    private String name;
    private String location;
    @Embedded
    private Broadcaster channel;
    private TechnicalTeam coach;
    @OneToMany
    @JoinColumn(name = "team_Id")
    private List<Player> players;

    private Team(){

    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public Broadcaster getChannel(){
        return channel;
    }
    public TechnicalTeam getCoach(){return coach;}
    public List<Player> getPlayers(){
        return players;
    }

    public Team(Builder builder){
        this.channel = builder.channel;
        this.id = builder.id;
        this.players = builder.players;
        this.name = builder.name;
        this.location = builder.location;
        this.coach = builder.coach;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String location;
        private Broadcaster channel;
        private TechnicalTeam coach;
        private List<Player> players;

        public Builder(String name){
            this.name = name;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }
        public Builder channel(Broadcaster value){
            this.channel = value;
            return this;
        }
        public Builder coach(TechnicalTeam value){
            this.coach = value;
            return this;
        }
        public Builder players(List<Player> value){
            this.players = value;
            return this;
        }
        public Builder location(String value){
            this.location = value;
            return this;
        }

        public Builder copy(Team value){
            this.channel = value.channel;
            this.players = value.players;
            this.id = value.id;
            this.name = value.name;
            this.coach = value.coach;
            this.location = value.location;
            return this;
        }

        public Team build() {
            return new Team(this);
        }
    }

=======
/**
 * Created by student on 2015/04/18.
 */
public class Team {
>>>>>>> 41ce4fd178fc8f49784338e6b728ca070b246a0f
}
