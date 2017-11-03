package com.tburzynski.exampleboot.db;

import com.tburzynski.exampleboot.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
