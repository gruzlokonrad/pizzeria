package com.crodu.CroduPizzeria.pizza.entity;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frontendId;
    private String name;
    private double price;

    @ManyToMany
    @JoinTable(
        name = "pizza_ingredient",
        joinColumns = @JoinColumn(name = "pizza_id"),
        inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    private Set<IngredientEntity> ingredients;

    public PizzaEntity(String frontendId, String name, double price,
                       Set<IngredientEntity> ingredients) {
        this.frontendId = frontendId;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }
}
