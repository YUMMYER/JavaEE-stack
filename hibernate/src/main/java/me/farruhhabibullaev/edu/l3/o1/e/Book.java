package me.farruhhabibullaev.edu.l3.o1.e;

import javax.persistence.*;

@Entity
@Table(name = "_book")
public class Book {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_ibsn")
    private String ibsn;
    @Column(name = "_title")
    private String title;
    @Column(name = "_author")
    private String author;
    @ManyToOne
    @JoinColumn(name = "reservation")
    private Reservation reservation;
    public Book(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
