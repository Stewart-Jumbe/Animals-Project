package com.tsi.sjumbe.animals;

public abstract class Animal {

    ////////Attributes/////////
    private int age;
    private String name;
    private String sleepState;

    ////////Constructors/////////
    public Animal(){
       age = 0;
       name = "Bingo";
    }

    ////////Methods/////////
    public String animalSleeps(){

        return sleepState = "Asleep";
    }

    public String animalWakes(){

        return sleepState = "Awake";
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getSleepState(){
        return sleepState;
    }

    public void setSleepState(String awakeOrAsleep){
        sleepState = awakeOrAsleep;

    }



    ///To String /////
    @Override
    public String toString(){

        return "You should create an animal, give it a name like " +name +" and give it an age "+age;
    }
}
