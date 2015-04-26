package za.ac.PremierSoccerLeague.domain;



import javax.persistence.Embeddable;
import java.io.Serializable;

/**c
 * Created by student on 2015/04/18.
 */
@Embeddable
public class Broadcaster implements Serializable {
    private Long id;
    private String channel;
    private String offers;

    public Broadcaster (Builder builder){
        id = builder.id;
        channel = builder.channel;
        offers = builder.offers;
    }

    public String getchannel(){
        return channel;
    }
    public String getOffers(){
        return offers;
    }
    public Long getId(){
        return id;
    }

    public static class Builder{
        private String channel;
        private String offers;
        private Long id;

        public Builder (String channel){
            this.channel = channel;
        }
        public Builder offers (String value){
            this.offers = value;
            return this;
        }
        public Builder id(Long value){
            this.id = value;
            return this;
        }

        public Builder copy(Broadcaster value){
            this.offers = value.offers;
            this.channel = value.channel;
            return this;
        }

        public Broadcaster build(){
            return new Broadcaster(this);
        }
    }
}
