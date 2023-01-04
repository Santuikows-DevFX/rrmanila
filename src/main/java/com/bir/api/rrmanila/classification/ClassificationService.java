package com.bir.api.rrmanila.classification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ClassificationService {

    @Autowired
    private ClassificationRepository classificationRepository;

    public Flux<ClassificationValues> getAllClassificationValues() {

           return classificationRepository.findAll(); //get all data

    }

    public Flux<ClassificationValues> getAllByClassCode(String class_code) {

        return classificationRepository.getAllByClassCode(class_code);
    }

}
