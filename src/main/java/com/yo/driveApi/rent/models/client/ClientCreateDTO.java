package com.yo.driveApi.rent.models.client;

public record ClientCreateDTO(

        String name,
        String email,
        String phoneNumber,
        Integer cpf,
        String birthDate

) {
}
