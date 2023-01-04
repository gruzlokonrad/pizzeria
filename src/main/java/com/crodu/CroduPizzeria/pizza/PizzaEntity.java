package com.crodu.CroduPizzeria.pizza;

//import javax.persistence;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

@Entity
@NoArgsConstructor
@Getter
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String frontendId;
    private String name;
    private double price;

//    @OneToMany
//    @ManyToOne()

    public PizzaEntity(String frontendId, String name, double price) {
        this.frontendId = frontendId;
        this.name = name;
        this.price = price;
    }
}
