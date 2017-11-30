package me.farruhhabibullaev.edu.l2.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies", schema = "movie")
public class Movies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Enumerated(EnumType.STRING)
    public Category category;

    @Column(name = "name")
    public String name;

    public List<String> comments;

    public List<Actor> actors;

    @Lob
    @Column(name = "image")
    public byte [] image;


    public Movies(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
