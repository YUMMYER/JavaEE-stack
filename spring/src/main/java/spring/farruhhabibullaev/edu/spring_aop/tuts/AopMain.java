package spring.farruhhabibullaev.edu.spring_aop.tuts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.farruhhabibullaev.edu.spring_aop.tuts.service.ShapeService;

public class AopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("tuts.xml");
        ShapeService shapeService = applicationContext.getBean("shapeService",ShapeService.class);
        System.out.println(shapeService.getCircle().getName());

    }
}
