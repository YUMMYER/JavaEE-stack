package me.farruhhabibullaev.edu.l2.assignment.o2;

import me.farruhhabibullaev.edu.l2.assignment.o1.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreData {

    public static void main(String[] args) throws IOException {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

        Product product = new Product();
        product.setName("Apple");
        product.setDescription("Apple is the best product");

        Product product1 = new Product();
        product1.setName("Hiberate");
        product1.setDescription("Hibernate is the best");


        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product1);

        OrderLine orderLine = new OrderLine();
        orderLine.setProducts(products);
        orderLine.setQuantity(12);

        List<OrderLine> orderLines = new ArrayList<>();
        orderLines.add(orderLine);

        Order order = new Order();
        order.setDate(new Date());
        order.setOrderLineList(orderLines);

        session.saveOrUpdate(order);
        t.commit();
        session.close();

        System.out.println("success");
    }
}
