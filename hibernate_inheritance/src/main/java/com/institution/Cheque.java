package com.institution;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Cheque")
public class Cheque extends Payment{
    @Column(name="cqtype")
    private String cqType;


    public String getCqType() {
        return cqType;
    }

    public void setCqType(String cqType) {
        this.cqType = cqType;
    }
}

