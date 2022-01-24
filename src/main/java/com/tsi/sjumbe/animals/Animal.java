package com.tsi.sjumbe.animals;

public class Animal {

    ////////Attributes/////////
    private int age;
    private String name;
    private int Speed ;

    ////////Constructors/////////
    public Animal(){
       age = 0;
       name = "Bingo";
    }

    ////////Methods/////////
    public void animalSleeps(){

        System.out.println("Sleeping");
        System.out.println("I'm upgain");
    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        name = newName;
        return name;
    }


    ///To String /////
    @Override
    public String toString(){

        return "You should create an animal, give it a name like " +name +" and give it an age "+age;
    }
}
