package com.crodu.CroduPizzeria;

import com.crodu.CroduPizzeria.pizza.repository.IngredientRepository;
import com.crodu.CroduPizzeria.pizza.entity.IngredientEntity;
import com.crodu.CroduPizzeria.pizza.entity.PizzaEntity;
import com.crodu.CroduPizzeria.pizza.repository.PizzaRepository;
import java.util.Set;
import java.util.UUID;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CroduPizzeriaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CroduPizzeriaApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(PizzaRepository repository, IngredientRepository ingredientRepository) {
        return (args) -> {

            IngredientEntity ser = new IngredientEntity(UUID.randomUUID().toString(), "ser", 4.0, 1);
            IngredientEntity szynka = new IngredientEntity(UUID.randomUUID().toString(), "szynka", 4.0, 1);
            IngredientEntity salami = new IngredientEntity(UUID.randomUUID().toString(), "salami", 4.0, 1);

            ingredientRepository.saveAndFlush(ser);
            ingredientRepository.saveAndFlush(szynka);
            ingredientRepository.saveAndFlush(salami);

            repository.save(new PizzaEntity(UUID.randomUUID().toString(),"Margarita",123, Set.of(ser)));
            repository.save(new PizzaEntity(UUID.randomUUID().toString(),"Simplica",123, Set.of(ser,szynka)));
            repository.save(new PizzaEntity(UUID.randomUUID().toString(),"Pepperoni",123, Set.of(ser,salami)));
        };
    }
}
