package com.yo.driveApi.rent.models.vehicle;


import com.yo.driveApi.rent.models.operator.Operator;
import com.yo.driveApi.rent.models.vehiclerent.VehicleRent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

    @Id
    @Column(name = "id_vehicle", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TypeVehicle typeVehicle;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleBrand brand;
    private Integer year;
    @Column(nullable = false, unique = true)
    private String licensePlate;
    @Column(nullable = false)
    private Double rentalPricePerDay;

    @OneToMany(mappedBy = "vehicle")
    private List<VehicleRent> vehicleRent;

    @ManyToOne
    private Operator operator;
}
