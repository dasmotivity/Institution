package com.institution.jpa;

import javax.persistence.*;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @Column(name = "id_number")
    private int id_number;

    @Column(name = "name")
    private String   name;

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Bank> getBanks_list() {
        return banks_list;
    }

    public void setBanks_list(List<Bank> banks_list) {
        this.banks_list = banks_list;
    }

    @ManyToMany(targetEntity = Bank.class)
    private List<Bank> banks_list;

}
