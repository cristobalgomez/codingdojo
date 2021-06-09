package com.zoo;

public class Mammal {
    private int energy = 100;

    public void displayEnergy() {
        System.out.println("Total energy: " + this.energy + " points");
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void incrementEnergy(int energy) {
        this.energy += energy;
    }

    public void decrementEnergy(int energy) {
        this.energy -= energy;
    }
}