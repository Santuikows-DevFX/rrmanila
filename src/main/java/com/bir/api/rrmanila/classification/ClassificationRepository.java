package com.bir.api.rrmanila.classification;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface ClassificationRepository extends ReactiveCrudRepository<ClassificationValues, String>{

    @Query("SELECT * FROM classification WHERE class_code = :class_code")
    Flux<ClassificationValues> getAllByClassCode(String class_code);
}
