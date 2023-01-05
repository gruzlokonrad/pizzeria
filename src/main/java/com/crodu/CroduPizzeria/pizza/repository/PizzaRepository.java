package com.crodu.CroduPizzeria.pizza.repository;

import com.crodu.CroduPizzeria.pizza.entity.PizzaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {

}
