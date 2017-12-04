package main.java.spring.farruhhabibullaev.edu;

import java.util.List;

public class Traingle2 {

    private List<Point> points;


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void draw(){
        System.out.println(points);
    }
}
