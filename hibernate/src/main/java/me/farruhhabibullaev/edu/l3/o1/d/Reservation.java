package me.farruhhabibullaev.edu.l3.o1.d;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.util.Date;

@Entity
@Table(name = "_reservation")
public class Reservation {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_date")
    private Date date;
    public Reservation(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
