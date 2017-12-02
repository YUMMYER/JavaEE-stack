package me.farruhhabibullaev.edu.l3.o1.b;

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


}
