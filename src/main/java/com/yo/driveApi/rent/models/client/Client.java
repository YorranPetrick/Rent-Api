package com.yo.driveApi.rent.models.client;

import com.yo.driveApi.rent.models.operator.Operator;
import com.yo.driveApi.rent.models.vehiclerent.VehicleRent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {

    @Id
    @Column(name = "id_client", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    private Integer cpf;
    private Date birthDate;

    @ManyToOne
    private Operator operator;

    @OneToMany(mappedBy = "client")
    private List<VehicleRent> vehicleRents;
}
