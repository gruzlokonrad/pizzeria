package com.crodu.CroduPizzeria.pizza.dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PizzaDto {

    private String id;
    private String name;
    private double price;
    private Set<IngredientDto> ingredients;

}
