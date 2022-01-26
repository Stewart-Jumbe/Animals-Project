package com.tsi.sjumbe.animals;

import java.util.ArrayList;

public class PetShop {

    private ArrayList<Animal> inventory = new ArrayList<>();
    private String nameOfShop;

    ///Constructor
    public PetShop(String name){
        nameOfShop = name;
        inventory = new ArrayList<>();
    }

    ///Methods

    public String sellAnimal(Animal animalBeingSold){
       if(inventory.indexOf(animalBeingSold)>=0){
           inventory.remove(animalBeingSold);
           return "You owe £" + animalBeingSold.getPrice();
       }
        return "Please come again";
    }

    public void addAnimalToInventory(Animal newAnimal){

    }



}
