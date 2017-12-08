package main.java.edu.farruh.spring.Ioc;

public class InheritBean {

    private int id;
    private String name;
    private Address address;

    public InheritBean() {
    }

    public InheritBean(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public InheritBean(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show() {
        System.out.println(id + " " + name);
        System.out.println(address);
    }

}
