package com.yo.driveApi.rent.models.operator;

import com.yo.driveApi.rent.models.client.Client;
import com.yo.driveApi.rent.models.vehicle.Vehicle;
import com.yo.driveApi.rent.models.vehiclerent.VehicleRent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Operator {

    @Id
    @Column(name = "id_operator", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String login;
    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "operator")
    private List<Client> clientId;

    @OneToMany(mappedBy = "operator")
    private List<VehicleRent> vehicleRents;

    @OneToMany(mappedBy = "operator")
    private List<Vehicle> vehicles;

}
