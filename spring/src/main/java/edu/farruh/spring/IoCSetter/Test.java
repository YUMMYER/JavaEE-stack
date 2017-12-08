package main.java.edu.farruh.spring.IoCSetter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("main/resource/setterAppContext.xml"));
        Employee e = (Employee) factory.getBean("first");
        e.display();

    }
}  