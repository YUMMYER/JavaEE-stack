package main.java.edu.farruh.spring.Ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {

    public static void main(String[] args) {
        BeanFactory beanFactory
                = new XmlBeanFactory(new ClassPathResource("main/resource/appContext.xml"));
        Employee employee = beanFactory.getBean("e", Employee.class);
       // employee.show();

        Questions questions = beanFactory.getBean("questions",Questions.class);
       // questions.displayInfo();

        Question question = beanFactory.getBean("quest2",Question.class);
        //question.displayInfo();

        MapQuestion mapQuestion = beanFactory.getBean("keymapbean",MapQuestion.class);
        //mapQuestion.displayInfo();

        InheritBean inheritBean = beanFactory.getBean("inherit2",InheritBean.class);
        inheritBean.show();
    }
}
