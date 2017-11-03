package com.tburzynski.exampleboot.web;

import com.tburzynski.exampleboot.db.CarRepository;
import com.tburzynski.exampleboot.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addNewBicycle(@RequestBody Car car) {
        carRepository.save(car);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Car>> getAllBicycles() {
        return new ResponseEntity<List<Car>>(carRepository.findAll(), HttpStatus.OK);
    }
}
