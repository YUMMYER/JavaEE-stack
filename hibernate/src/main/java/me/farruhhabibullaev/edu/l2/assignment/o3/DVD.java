package me.farruhhabibullaev.edu.l2.assignment.o3;

import javax.persistence.*;

@Entity
@Table(name = "dvd")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name")),
        @AttributeOverride(name = "description", column = @Column(name = "description"))
}
)
public class DVD extends Product{

    @Column(name = "gentre")
    private String gentre;

    public DVD(){

    }

    public String getGentre() {
        return gentre;
    }

    public void setGentre(String gentre) {
        this.gentre = gentre;
    }
}
