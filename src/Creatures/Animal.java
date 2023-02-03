package Creatures;

import device.Salleable;

public abstract class Animal implements  Feedable {
    private double weight;
    final String species;
    String name;
    int age;
    boolean isLive;
    public Animal(String species) {
        this.species = species ;
        isLive = true;
        switch (species) {
            case "wolf":
                weight = 20;
                break;
            case "elephant":
                weight = 500;
                break;
            case "cat": weight = 4;
        }












}  }
