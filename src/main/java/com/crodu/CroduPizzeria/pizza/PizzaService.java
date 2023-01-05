package com.crodu.CroduPizzeria.pizza;

import com.crodu.CroduPizzeria.pizza.dto.IngredientDto;
import com.crodu.CroduPizzeria.pizza.dto.PizzaDto;
import com.crodu.CroduPizzeria.pizza.entity.PizzaEntity;
import com.crodu.CroduPizzeria.pizza.repository.PizzaRepository;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PizzaService {

    private PizzaRepository pizzaRepository;

    public List<PizzaDto> getAllPizzas() {
        List<PizzaEntity> pizzasList = pizzaRepository.findAll();

        return pizzasList.stream()
            .map(pizzaEntity -> {

                Set<IngredientDto> ingredientDtos =
                    pizzaEntity.getIngredients()
                        .stream()
                        .map(i ->
                            new IngredientDto(i.getFrontendId(), i.getName(),
                                i.getPrice(), i.getAmount())).collect(Collectors.toSet());

                return new PizzaDto(pizzaEntity.getFrontendId(), pizzaEntity.getName(), pizzaEntity.getPrice(),
                    ingredientDtos);
            })
            .collect(Collectors.toList());

    }

//    return List.of(new PizzaDto(UUID.randomUUID().toString(), "Margaritta", 23.30,
//        Set.of(new IngredientDto(UUID.randomUUID().toString(), "Mozarella", 3))));
}

