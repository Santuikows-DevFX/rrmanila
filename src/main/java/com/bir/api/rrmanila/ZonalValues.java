package com.bir.api.rrmanila;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "zone")
public class ZonalValues {

    @Id
    @Column("zonal_id")
    private Integer zonalID;

    @Column("zonal_barangay")
    private String zonalBarangay;

    @Column("zone")
    private String zone;

    @Column("zonal_street_subdivision")
    private String zonalStreetSubdivision;

    @Column("zonal_vicinity")
    private String zonalVicinity;

    @Column("class_code")
    private String classCode;

    @Column("zonal_price_per_sqm")
    private Integer zonalPricePerSqm;

}

