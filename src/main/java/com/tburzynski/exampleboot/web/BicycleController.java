package com.tburzynski.exampleboot.web;

import com.tburzynski.exampleboot.db.BicycleRepository;
import com.tburzynski.exampleboot.model.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@Transactional
@RequestMapping("/bicycle")
public class BicycleController {

    @Autowired
    private BicycleRepository bicycleRepository;

    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addNewBicycle(@RequestBody Bicycle bicycle) {
        bicycleRepository.save(bicycle);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Bicycle>> getAllBicycles() {
        return new ResponseEntity<List<Bicycle>>(bicycleRepository.findAll(), HttpStatus.OK);
    }
}
