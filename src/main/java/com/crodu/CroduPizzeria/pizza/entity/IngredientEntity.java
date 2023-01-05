package com.crodu.CroduPizzeria.pizza.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class IngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frontendId;
    private String name;
    private double price;
    private int amount;

    @ManyToMany(mappedBy = "ingredients")
    private Set<PizzaEntity> pizzas;


    public IngredientEntity(String frontendId, String name, double price, int amount) {
        this.frontendId = frontendId;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
