package me.farruhhabibullaev.edu.l2.assignment.o1;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;
import java.util.Date;

@Embeddable
public class Comment {

    @Column(name = "_comment_date")
    private Date date;
    @Column(name = "_comment_text")
    private String text;
    @Column(name = "_comment_author")
    private String author;

    public Comment(){

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "date=" + date +
                ", text='" + text + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
