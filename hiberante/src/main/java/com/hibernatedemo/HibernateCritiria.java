package com.hibernatedemo;

import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;


class HibernateCritiria {

    public static void main( String[] args )
    {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        Transaction tr = se.beginTransaction();
        Criteria criteria=se.createCriteria(Student.class);
        Criterion criterion= Restrictions.le("id",2);
        criteria.add(criterion);

        List li=criteria.list();
        Iterator i=li.iterator();
        while (i.hasNext()){
            Student student=(Student) i.next();
            System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getId());
        }

    }
}

