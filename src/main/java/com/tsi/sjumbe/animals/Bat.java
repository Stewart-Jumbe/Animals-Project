package com.tsi.sjumbe.animals;

public class Bat extends Animal implements Flying {

    //////////Attributes/////////
    private String flightStatus;

    ////////Constructors/////////
    public Bat(){
    }

    public Bat(int age, String name){

    }

    ////////Methods/////////////////
    @Override
    public String takeOff(){
        flightStatus = "takenOff";
        return flightStatus;
    }

    @Override
    public String fly(){
        flightStatus = "Flying";
        return flightStatus;
    }

    @Override
    public String land(){
        flightStatus = "Landing";
        return flightStatus;
    }

    //////////Getters and Setters/////////
    public String getFlightStatus(){
        return flightStatus;
    }

}
