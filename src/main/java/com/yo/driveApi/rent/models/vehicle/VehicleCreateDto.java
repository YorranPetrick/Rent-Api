package com.yo.driveApi.rent.models.vehicle;

public record VehicleCreateDto(

        String model,
        TypeVehicle typeVehicle,
        VehicleBrand brand,
        Integer year,
        String licensePlate,
        Double rentalPricePerDay

) {
}
