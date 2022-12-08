package org.example;

import org.example.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

            Person person1 = new Person("test1", 10);
            Person person2 = new Person("test2", 20);
            Person person3 = new Person("test3", 30);
            Person person4 = new Person("test4", 40);
            Person person5 = new Person("test5", 10);
            Person person6 = new Person("test6", 20);
            Person person7 = new Person("test7", 30);
            Person person8 = new Person("test8", 40);
            Person person9 = new Person("test9", 10);
            Person person10 = new Person("test10", 20);
            Person person11 = new Person("test11", 30);
            Person person12 = new Person("test12", 40);

            session.save(person1);
            session.save(person2);
            session.save(person3);
            session.save(person4);

            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }


    }
}
