package spring.farruhhabibullaev.edu.spring_aop.tuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspects {

    @Before("execution(public String spring.farruhhabibullaev.edu.spring_aop.tuts.module.Circle.getName())")
    public void LoggingAdvice() {
        System.out.println("Advice run. Get method called");
    }

}
