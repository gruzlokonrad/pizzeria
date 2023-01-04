package com.crodu.CroduPizzeria.pizza;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.crodu.CroduPizzeria.pizza.dto.PizzaDto;

@Service
@AllArgsConstructor
public class PizzaService {

    private PizzaRepository pizzaRepository;

    public List<PizzaDto> getAllPizzas() {
        List<PizzaEntity> pizzasList = pizzaRepository.findAll();

       return pizzasList.stream()
            .map(pizzaEntity -> new PizzaDto(pizzaEntity.getFrontendId(), pizzaEntity.getName(), pizzaEntity.getPrice(),
                Set.of()))
            .collect(Collectors.toList());


    }

//    return List.of(new PizzaDto(UUID.randomUUID().toString(), "Margaritta", 23.30,
//        Set.of(new IngredientDto(UUID.randomUUID().toString(), "Mozarella", 3))));
}

