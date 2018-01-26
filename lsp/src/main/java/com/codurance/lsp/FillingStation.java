package com.codurance.lsp;

public class FillingStation {

    public void refuel(Vehicle vehicle) {
        if (vehicle instanceof PetrolCar) {
            vehicle.fillUpWithFuel();
        }
    }
}