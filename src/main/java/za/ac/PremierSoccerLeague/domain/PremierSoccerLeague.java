package za.ac.PremierSoccerLeague.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class PremierSoccerLeague implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(unique = true)
    private String abbreviation;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PremierSoccerLeague")
    private List<Stadium> stadiums;

    private PremierSoccerLeague(){

    }

    public PremierSoccerLeague(Builder builder){
        id = builder.id;
        name = builder.name;
        abbreviation = builder.abbreviation;
        stadiums = builder.stadiums;
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    public List<Stadium> getStadiums(){
        return stadiums;
    }

    public static class Builder{
        private String name;
        private String abbreviation;
        private Long id;
        private List<Stadium> stadiums;

        public Builder(String abbreviation){
            this.abbreviation = abbreviation;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder stadiums(List<Stadium> value){
            this.stadiums = value;
            return this;
        }

        public Builder copy(PremierSoccerLeague value){
            this.name = value.getName();
            this.abbreviation = value.getAbbreviation();
            this.id = value.getId();
            this.stadiums = value.getStadiums();
            return this;
        }

        public PremierSoccerLeague build(){
            return new PremierSoccerLeague(this);
        }


    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof PremierSoccerLeague)) return false;

        PremierSoccerLeague premierSoccerLeague = (PremierSoccerLeague) o;

        return !(id != null ? !id.equals(premierSoccerLeague.id) : premierSoccerLeague.id != null);
    }


    public int hashcode(){
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString(){
        return "Premier Soccer League{" +
                "id =" + id +
                ", name ='" + name + '\'' +
                '}';
    }
}
