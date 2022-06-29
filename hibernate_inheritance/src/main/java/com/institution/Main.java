package com.institution;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Main {
    public static void main(String[] args) {
        try {

    SessionFactory sf = Hibernate_mapping.getSessionFactory();
    Session se = sf.openSession();
    Transaction tr = se.beginTransaction();

    CreditCard cc = new CreditCard();
    cc.setCcType("MASTER CARD");
    cc.setAmount(19000);
    cc.setPid(105);

    Cheque cq = new Cheque();
    cq.setPid(106);
    cq.setAmount(15000);
    cq.setCqType("AXIS");

    se.save(cc);
    se.save(cq);
    tr.commit();
    se.close();
}catch (Exception e){
            System.out.println(e);
        }
    }
}
