package me.farruhhabibullaev.edu.javatpoint.collections.listonetomany;

import java.util.List;

public class Question {
    private int id;
    private String qname;
    private List<Answer> answers;
//getters and setters

    public Question() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}