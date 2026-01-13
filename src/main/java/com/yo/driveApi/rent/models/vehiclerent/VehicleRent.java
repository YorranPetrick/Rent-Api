package com.yo.driveApi.rent.models.vehiclerent;

import com.yo.driveApi.rent.models.client.Client;
import com.yo.driveApi.rent.models.operator.Operator;
import com.yo.driveApi.rent.models.vehicle.Vehicle;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VehicleRent {

    @Id
    @Column(name = "id_vehicle_rent", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
    private Double priceForDayRent;

    @ManyToOne
    private Vehicle vehicle;
    @ManyToOne
    private Client client;
    @ManyToOne
    private Operator operator;
}
