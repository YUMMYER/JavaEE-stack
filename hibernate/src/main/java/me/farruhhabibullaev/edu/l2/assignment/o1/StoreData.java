package me.farruhhabibullaev.edu.l2.assignment.o1;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreData {

    public static void main(String[] args) throws IOException {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

        Actor farruh = new Actor();
        farruh.setActorName("Farruh");
        farruh.setCharacter("Batman");
        farruh.setRating(Rating.A);

        Actor guli = new Actor();
        guli.setActorName("Guli");
        guli.setCharacter("Nagiz");
        guli.setRating(Rating.C);

        List<Actor> actors = new ArrayList<>();
        actors.add(guli);
        actors.add(farruh);

        Comment comment = new Comment();
        comment.setAuthor("Salim");
        comment.setDate(new Date());
        comment.setText("Very Good Movie");

        Comment comment1 = new Comment();
        comment1.setAuthor("Alijon");
        comment1.setDate(new Date());
        comment1.setText("Sad Movie");

        List<Comment> commentList = new ArrayList<>();
        commentList.add(comment);
        commentList.add(comment1);

        Movies movies = new Movies();
        movies.setMovieName("Shaytanat");
        movies.setCategory(Category.drame);
        movies.setRating(Rating.A);
        movies.setCommentList(commentList);
        movies.setActorList(actors);

        session.saveOrUpdate(movies);

        Movies movies1 = session.get(Movies.class,1);
        System.out.println("----------Actor list----------");
        for (int i = 0; i <movies1.getActorList().size() ; i++) {

            System.out.println(movies1.getActorList().get(i).toString());
        }
        System.out.println("----------Comment list----------");
        for (int i = 0; i <movies1.getCommentList().size() ; i++) {
            System.out.println(movies1.getCommentList().get(i).toString());
        }

//        File file = new File("Receipt.pdf");
//        FileInputStream fileInputStream = new FileInputStream(file);
//        fileInputStream.read();
//        movies.setCover();

        t.commit();
        session.close();
        System.out.println("success");
    }
}
