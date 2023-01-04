package com.bir.api.rrmanila;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ZonalService {

    @Autowired //framework na bahala yung mag create ng instance of class
    private ZonalRepository zonalRepository;
    private  ZonalValueController zonalValueController;

    public Flux<ZonalValues> getAllZonalValues() { //fetch all data from db

            //business logic
            return zonalRepository.findAll(); //framework query katumbas ng SELECT * FROM

    }

    public Flux<ZonalValues> getByZonalID(Integer zonal_id) {

        return zonalRepository.getByZonalID(zonal_id);
    }

    public ZonalValues insertZonalValues(ZonalValues zonalValues) {
        zonalRepository.save(zonalValues); //save the inserted date into the db

        return zonalValues;
    }

}
