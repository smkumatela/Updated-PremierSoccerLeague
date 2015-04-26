package za.ac.PremierSoccerLeague.domain;

import org.hibernate.annotations.Entity;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * Created by student on 2015/04/18.
 */
@Entity
public class Player implements Serializable{
    @Id
    private Long id;

    private String lastName;
    private String position;
    private int age;
    private List<Sponsor> sponsors;


    private Player(){

    }

    public String getLastName(){
        return lastName;
    }
    public String getPosition(){
        return position;
    }
    public int getAge(){
        return age;
    }
    public List<Sponsor> getSponsors(){
        return sponsors;
    }

    public Player(Builder builder) {
        lastName = builder.lastName;
        position = builder.position;
        age = builder.age;
        sponsors = builder.sponsors;
    }

     public static class Builder{
         private String lastName;
         private String position;
         private int age;
         private List<Sponsor> sponsors;

        public Builder(String position){
              this.position = position;
        }
        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }
         public Builder age(int value){
             this.age = value;
             return this;
         }
         public Builder sponsors(List<Sponsor> value){
             this.sponsors = value;
             return this;
         }

         public Builder copy(Player value){
             this.sponsors = value.sponsors;
             this.lastName = value.lastName;
             this.position = value.position;
             this.age = value.age;
             return this;
         }

         public Player build(){
             return new Player(this);
         }
     }
}
