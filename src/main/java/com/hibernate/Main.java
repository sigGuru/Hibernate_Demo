package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hosteller hosteller = new Hosteller();

        hosteller.setAge(20);
        hosteller.setId(23);
        hosteller.setName("Guru");

        Configuration config = new Configuration();

        config.configure();

        SessionFactory factory = config.buildSessionFactory();

        Session session = factory.openSession();

        session.persist(hosteller);


    }
}