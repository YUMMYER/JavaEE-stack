package me.farruhhabibullaev.edu.l2.assignment.o3;

import javax.persistence.*;

@Entity
@Table(name = "book")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "id")),
        @AttributeOverride(name = "name", column = @Column(name = "name")),
        @AttributeOverride(name = "description", column = @Column(name = "description"))
}
)
public class Book extends Product {

    @Column(name = "title")
    private String title;

    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
