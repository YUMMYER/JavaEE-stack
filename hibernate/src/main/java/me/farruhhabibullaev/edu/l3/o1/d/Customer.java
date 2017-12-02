package me.farruhhabibullaev.edu.l3.o1.d;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "_customer")
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_name")
    private String name;
    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Reservation> reservations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
