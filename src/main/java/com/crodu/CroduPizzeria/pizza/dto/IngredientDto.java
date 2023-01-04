package com.crodu.CroduPizzeria.pizza.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class IngredientDto {

    private final String id;
    private final String name;
    private final double price;
    private final int amount;

    public IngredientDto(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = 1;
    }
}
