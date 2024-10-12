package com.example.GestionEquipaje.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Politicas")
public class ChargePolicy implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chargePolicy_id;
    private String type_policy;

    public ChargePolicy(String type_policy) {
        super();
        this.type_policy = type_policy;
    }

    public int getChargePolicy_id() {
        return chargePolicy_id;
    }

    public void setChargePolicy_id(int chargePolicy_id) {
        this.chargePolicy_id = chargePolicy_id;
    }

    public String getType_policy() {
        return type_policy;
    }

    public void setType_policy(String type_policy) {
        this.type_policy = type_policy;
    }

}
