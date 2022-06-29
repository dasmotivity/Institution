package com.hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


class Main {

    public static void main( String[] args )
    {
        SessionFactory sf =HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        Transaction tr = se.beginTransaction();
        Transaction tx=se.beginTransaction();
        Student das=new Student();
        das.setFirstName("hari");
        das.setId(4);
        das.setLastName("kanth");

        se.save(das);

        tx.commit();
        se.close();
    }
}

