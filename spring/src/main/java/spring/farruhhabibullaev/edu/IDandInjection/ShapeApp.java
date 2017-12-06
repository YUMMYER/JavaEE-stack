package spring.farruhhabibullaev.edu.IDandInjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
