package com.institution.jpa;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;


public class ManyToMany {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "pu" );
        EntityManager em = emf.createEntityManager( );
        em.getTransaction().begin();
            Bank b1=new Bank();
            b1.setBank_name("boi");
            b1.setCode(13);

            Bank b2=new Bank();
            b2.setBank_name("idfc");
            b2.setCode(14);

            em.persist(b1);
            em.persist(b2);

            List<Bank> bankList=new ArrayList<Bank>();
        List<Bank> bankList1=new ArrayList<Bank>();
        List<Person>personList=new ArrayList<Person>();
            bankList.add(b1);
            bankList.add(b2);
            bankList1.add(b1);
            Person p=new Person();
            p.setName("ramana");
            p.setId_number(102);
            p.setBanks_list(bankList);
            Person p2=new Person();
            p2.setName("kiran");
            p2.setId_number(104);
            personList.add(p);
            personList.add(p2);
            p2.setBanks_list(bankList1);
            b1.setPersonList(personList);

            em.persist(b1);
            em.persist(b2);
            em.persist(p);
            em.persist(p2);

            em.getTransaction().commit();
            em.close();


    }
}
