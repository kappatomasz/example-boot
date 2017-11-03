package com.tburzynski.exampleboot.db;

import com.tburzynski.exampleboot.model.Bicycle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BicycleRepository extends JpaRepository<Bicycle, Integer>{
}
