package com.institution.jpa;

import javax.persistence.*;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {
    @Column(name = "bank_name")
    private String bank_name;

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Id
    @Column(name = "bank_code")
    private int code;

    @ManyToMany(targetEntity = Person.class)
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
