package com.codework.tp_graphql.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//Phone (id_Phone, model, color, IMEI, price).
public class Phone {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String  color;
    private String  IMEI;
    private double price;

    public Phone(String mod, String col, String IMEI, double PR) {
        this.model=mod;
        this.color=col;
        this.IMEI=IMEI;
        this.price=PR;
    }
}
