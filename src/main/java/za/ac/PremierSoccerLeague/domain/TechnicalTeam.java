package za.ac.PremierSoccerLeague.domain;

<<<<<<< HEAD
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Embeddable
public class TechnicalTeam implements Serializable{
    private String name;
    private String coaching;

    public TechnicalTeam (Builder builder){
        name = builder.name;
        coaching = builder.coaching;
    }

    public String getName(){
        return name;
    }
    public String getCoaching(){
        return coaching;
    }

    public static class Builder{
        private String name;
        private String coaching;

        public Builder (String name){
            this.name = name;
        }
        public Builder coaching (String value){
            this.coaching = value;
            return this;
        }

        public Builder copy(TechnicalTeam value){
            this.coaching = value.coaching;
            this.name = value.name;
            return this;
        }

        public TechnicalTeam build(){
            return new TechnicalTeam(this);
        }
    }
=======
/**
 * Created by student on 2015/04/18.
 */
public class TechnicalTeam {
>>>>>>> 41ce4fd178fc8f49784338e6b728ca070b246a0f
}
