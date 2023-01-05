package com.crodu.CroduPizzeria.pizza;

import com.crodu.CroduPizzeria.admin.PizzaAdminController;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizza")
@AllArgsConstructor
public class PizzaController {

    private PizzaService pizzaService;

    @GetMapping
    public List<PizzaDto> getAllPizzas() {
        return pizzaService.getAllPizzas();
    }


    @PostMapping
    @(ADMIN)
    public void addPizza(@RequestBody PizzaDto pizzaDto){
        //pizzaService.addPizza(pizzaDto);\

    }


}
