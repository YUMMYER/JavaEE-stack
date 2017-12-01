package me.farruhhabibullaev.edu.l2.assignment.o3;

import javax.persistence.*;

@Entity
@Table(name = "cd")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name")),
        @AttributeOverride(name = "description", column = @Column(name = "description"))
}
)
public class CD extends Product {

    @Column(name = "artist")
    private String artist;

    public CD(){

    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
