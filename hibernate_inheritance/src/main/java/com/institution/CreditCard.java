package com.institution;

import javax.persistence.*;

@Entity
@Table(name="CreditCard")
public class CreditCard extends Payment{

    @Column(name="cctype")
    private String ccType;


    public String getCcType() {
        return ccType;
    }

    public void setCcType(String ccType) {
        this.ccType = ccType;
    }

}
