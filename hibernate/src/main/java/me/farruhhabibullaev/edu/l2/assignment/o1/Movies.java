package me.farruhhabibullaev.edu.l2.assignment.o1;

import javax.persistence.*;
import java.util.List;

@Entity
@Access(AccessType.FIELD)
@Table(name = "movies")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "moviename")
    private String movieName;
    @Enumerated(EnumType.STRING)
    @Column(name = "moviecategory")
    private Category category;
    @Enumerated(EnumType.STRING)
    private Rating rating;
    @ElementCollection
    @OrderColumn(name = "_index")
    @Column(name = "comment_list")
    private List<Comment> commentList;
    @ElementCollection
    @OrderColumn(name = "_index")
    @Column(name = "actor_list")
    private List<Actor> actorList;
    @Lob
    @Column(name = "cover")
    private byte [] cover;

    public Movies(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }
}
