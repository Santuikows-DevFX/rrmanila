package com.bir.api.rrmanila;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ZonalRepository extends ReactiveCrudRepository<ZonalValues, Integer> {

    @Query("SELECT * FROM zone WHERE zonal_id = :zonal_id")
    Flux<ZonalValues> getByZonalID(Integer zonal_id);

}
