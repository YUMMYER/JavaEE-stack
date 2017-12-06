package spring.farruhhabibullaev.edu.spring_aop.tuts.service;

import spring.farruhhabibullaev.edu.spring_aop.tuts.module.Circle;
import spring.farruhhabibullaev.edu.spring_aop.tuts.module.Traingle;

public class ShapeService {

    private Circle circle;
    private Traingle traingle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Traingle getTraingle() {
        return traingle;
    }

    public void setTraingle(Traingle traingle) {
        this.traingle = traingle;
    }
}
