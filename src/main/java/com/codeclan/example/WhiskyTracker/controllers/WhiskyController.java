package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

//    @GetMapping(value = "/whiskies")
//    public ResponseEntity getAllWhiskies(){
//        return new ResponseEntity(whiskyRepository.findAll(), HttpStatus.OK);
//    }

    @GetMapping(value = "/whiskies")
    public ResponseEntity getWhiskiesByYear(@RequestParam(name = "year", required = false) int year){
        return new ResponseEntity(whiskyRepository.findByYear(year), HttpStatus.OK);
    } //http://localhost:8080/whiskies?year=12

    @GetMapping(value = "/whiskies/distillery")
    public ResponseEntity getWhiskiesByDistillery(@RequestParam(name = "distilleryId", required = false) Long distilleryId){
        return new ResponseEntity(whiskyRepository.findByDistilleryId(distilleryId), HttpStatus.OK);
    } //http://localhost:8080/whiskies/distillery?distilleryId=2

    @GetMapping(value = "/whiskies/distilleries")
    public ResponseEntity getWhiskiesByAgeAndDistillery(
            @RequestParam(name="age", required = false) int age,
            @RequestParam(name="distilleryId", required = false) Long distilleryId){
        return new ResponseEntity(whiskyRepository.findByAgeAndDistilleryId(age, distilleryId), HttpStatus.OK);
    } //http://localhost:8080/whiskies/distilleries?age=2018&distilleryId=1
}
