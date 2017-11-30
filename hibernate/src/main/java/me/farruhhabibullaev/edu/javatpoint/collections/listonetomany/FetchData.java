package me.farruhhabibullaev.edu.javatpoint.collections.listonetomany;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

public class FetchData {
public static void main(String[] args) {  
      
    Session session=new Configuration().configure("hibernate.cfg.xml")
                          .buildSessionFactory().openSession();  
      
    Query query=session.createQuery("from Question");
    List<Question> list=query.list();
      
    Iterator<Question> itr=list.iterator();
    while(itr.hasNext()){  
        Question q=itr.next();  
        System.out.println("Question Name: "+q.getQname());  
          
        //printing answers  
        List<Answer> list2=q.getAnswers();  
        Iterator<Answer> itr2=list2.iterator();  
        while(itr2.hasNext()){  
            System.out.println(itr2.next());  
        }  
          
    }  
    session.close();  
    System.out.println("success");  
}  
}  