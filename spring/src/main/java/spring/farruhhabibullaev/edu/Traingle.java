package main.java.spring.farruhhabibullaev.edu;

public class Traingle {

    private String type;
    private int height;

    public Traingle(String type){
        this.type = type;
    }

    public Traingle(String type, int height){
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw(){
        System.out.println(getType()+" Traingle Drawing " + getHeight());
    }
}