package com.bir.api.rrmanila.classification;

import com.bir.api.rrmanila.ZonalValues;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequestMapping("/classification")
@RestController
public class ClassificationController {

    @Autowired
    private ClassificationService classificationService;

    @GetMapping
    public Flux<ClassificationValues> getAllClassificationValues() {

        return classificationService.getAllClassificationValues();
    }

    @GetMapping("/{class_code}") //get by zonal_id/PK of the zonal value class
    public Flux<ClassificationValues> getByZonalID(@PathVariable String class_code) {

        return classificationService.getAllByClassCode(class_code);

    }


}
