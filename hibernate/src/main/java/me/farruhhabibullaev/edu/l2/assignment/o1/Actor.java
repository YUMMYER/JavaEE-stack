package me.farruhhabibullaev.edu.l2.assignment.o1;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Actor {

    @Column(name = "charster")
    private String character;
    @Enumerated(EnumType.STRING)
    private Rating rating;
    @Column(name = "actorname")
    private String actorName;

    public Actor(){

    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "character='" + character + '\'' +
                ", rating=" + rating +
                ", actorName='" + actorName + '\'' +
                '}';
    }
}
