package com.tsi.sjumbe.animals;

public class Pigeon extends Bird implements Flying {

///////////Attributes/////////////////////
    private String flightStatus;

///////////Methods/////////////////////
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
}
