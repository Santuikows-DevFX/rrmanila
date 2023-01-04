package com.bir.api.rrmanila.classification;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "classification")
public class ClassificationValues {

    @Id
    @Column("class_code")
    private String classCode;

    @Column("class_name")
    private String className;
}
