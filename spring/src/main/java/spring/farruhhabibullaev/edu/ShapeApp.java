package main.java.spring.farruhhabibullaev.edu;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ShapeApp {
    public static void main(String[] args) {
        BeanFactory beanFactory  =  new XmlBeanFactory(new FileSystemResource("spring/src/main/resources/spring.xml"));
        Traingle traingle = (Traingle) beanFactory.getBean("traingle");
        traingle.draw();

    }
}
