package ru.tinkoff.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


import ru.tinkoff.hibernate.test.hibernate.models.Animal;

public class ServiceTests {

    @BeforeAll
    public static void beforeAll(){
        BeforeUtils.createData();
    }

    @Test
    public void insertTestHibernate(){
        SessionFactory sessionFactory = HibernateSessionCreator.getSessionFactory();

        Session session = sessionFactory.openSession();
        Animal animal = session.createNativeQuery("select * from animal where \"name\" = 'По'", Animal.class).getResultList().get(0);
        System.out.println(animal.getName());
    }
}
