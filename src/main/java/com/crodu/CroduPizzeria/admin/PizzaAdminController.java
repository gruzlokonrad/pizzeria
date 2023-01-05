package com.crodu.CroduPizzeria.admin;

import com.crodu.CroduPizzeria.pizza.dto.PizzaDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PizzaAdminController {


    @PostMapping
    @(ADMIN)
    void addPizza(@RequestBody PizzaDto pizzaDto){
        //pizzaService.addPizza(pizzaDto);
    }
}
