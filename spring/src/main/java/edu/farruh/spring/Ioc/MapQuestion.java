package main.java.edu.farruh.spring.Ioc;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapQuestion {

    private int id;
    private String name;
    private Map<String, String> answers;

    public MapQuestion() {
    }

    public MapQuestion(int id, String name, Map<String, String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayInfo() {
        System.out.println("question id:" + id);
        System.out.println("question name:" + name);
        System.out.println("Answers....");
        Set<Map.Entry<String, String>> set = answers.entrySet();
        Iterator<Map.Entry<String, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
        }
    }
}
