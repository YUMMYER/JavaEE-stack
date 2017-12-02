package me.farruhhabibullaev.edu.l3.o1.b;

import javax.persistence.*;

@Entity
@Table(name = "_publisher")
public class Publisher {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_name")
    private String name;
    @ManyToOne
    @JoinTable( name = "_publisher_book")
    private Publisher publisher;
}
