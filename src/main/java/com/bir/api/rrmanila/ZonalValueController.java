package com.bir.api.rrmanila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RequestMapping("/zonal") //URL
@RestController //for get and post mapping
public class ZonalValueController { //para maaccess ni user, mag rereturn ng DATA

    @Autowired private ZonalService zonalService;

    @GetMapping //get all zonal values
    public Flux<ZonalValues> getAllZonalValues() {

        return zonalService.getAllZonalValues();
    }

    @GetMapping("/{zonal_id}") //get by zonal_id/PK of the zonal value class
    public Flux<ZonalValues> getByZonalID(@PathVariable Integer zonal_id) {

        return zonalService.getByZonalID(zonal_id);

    }

    @PostMapping
    public ResponseEntity<ZonalValues> insertZonalValues(@RequestBody ZonalValues zonalValues) {

        return new ResponseEntity<>(zonalService.insertZonalValues(zonalValues), HttpStatus.CREATED);
    }

}
