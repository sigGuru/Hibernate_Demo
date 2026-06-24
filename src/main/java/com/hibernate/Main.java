package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hosteller hosteller = new Hosteller();
        hosteller.setAge(16);
        hosteller.setHid(25);
        hosteller.setName("Guna");

//
//        Configuration config = new Configuration();
//        config.configure();
//        config.addAnnotatedClass(com.hibernate.Hosteller.class);

        SessionFactory factory = new Configuration()
                                .configure()
                                .addAnnotatedClass(com.hibernate.Hosteller.class)
                                .buildSessionFactory();

        Session session = factory.openSession();

        //Storing in Db

        Transaction transaction = session.beginTransaction();

//        session.persist(hosteller);
//        transaction.commit();

        // Fetching Data From Db

        // Eager Fetching
//        Hosteller obj1 = session.find(Hosteller.class, 23);
//        System.out.println(obj1);
//
//        // Lazy Fetching
//        Hosteller obj2 = session.byId(Hosteller.class).load(25);
//        System.out.println(obj2);

        // Update in Db
        // merge() do 2 things -> 1. Update if the Obj is already in the Db  2. Else, Create a New One

//        session.merge(hosteller);
//        transaction.commit();

//        obj1 = session.find(Hosteller.class, 25);
//        System.out.println(obj1);

        // Delete in Db

        Hosteller del = session.find(Hosteller.class, null);
        session.remove(del);
        transaction.commit();

        session.close();
        factory.close();

    }
}