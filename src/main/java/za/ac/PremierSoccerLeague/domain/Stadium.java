package za.ac.PremierSoccerLeague.domain;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Stadium implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String location;

    private Stadium(){

    }

    public Stadium(Builder builder){
        id = builder.id;
        name = builder.name;
        location = builder.location;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public String getLocation(){
        return location;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String location;

        public Builder(String name){
            this.name = name;
        }
        public Builder location(String value){
            this.location = value;
            return this;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Stadium value){
            this.id = value.id;
            this.name = value.name;
            this.location = value.location;
            return this;
        }

        public Stadium build(){
            return new Stadium(this);
        }
    }
=======
/**
 * Created by student on 2015/04/18.
 */
public class Stadium {
>>>>>>> 41ce4fd178fc8f49784338e6b728ca070b246a0f
}
