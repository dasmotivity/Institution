package com.hibernatedemo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import java.util.Iterator;
import java.util.List;


public class HibernateSelect {

    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        Transaction tr = se.beginTransaction();


        Query query=se.createQuery("from Student s");
        List li=query.list();
        Iterator i=li.iterator();
        while (i.hasNext()){
            Student student=(Student) i.next();
            System.out.println("sid is:"+student.getId()+"  first name is:"+student.getFirstName()+"  last name is:"+student.getLastName());
        }

    }
}

