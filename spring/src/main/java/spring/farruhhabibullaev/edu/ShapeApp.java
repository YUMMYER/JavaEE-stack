package main.java.spring.farruhhabibullaev.edu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class ShapeApp {
    public static void main(String[] args) {
        //Bean Factory method

//        BeanFactory beanFactory  =  new XmlBeanFactory(new FileSystemResource("spring/src/main/resources/spring.xml"));
//        Traingle traingle = (Traingle) beanFactory.getBean("traingle");
//        traingle.draw();

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Traingle2 traingle = (Traingle2) context.getBean("traingle");
        traingle.draw();

    }
}
