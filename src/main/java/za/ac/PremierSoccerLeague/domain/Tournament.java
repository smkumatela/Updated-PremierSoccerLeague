package za.ac.PremierSoccerLeague.domain;

import com.sun.istack.internal.Builder;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Tournament implements Serializable{
   /* private Long id;
    private String name;
    private int numOfTeams;
    private double prize;

    private Tournament(){

    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getNumOfTeams(){
        return numOfTeams;
    }
    public double getPrize(){
        return prize;
    }

    public Tournament(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.numOfTeams = builder.numOofTeams;
        this.prize = builder.prize;

        public Builder(String name){
            this.name = name;
        }
    }*/
}
