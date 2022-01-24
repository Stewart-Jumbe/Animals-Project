package com.tsi.sjumbe.animals;

public class Pigeon extends Bird implements Flying {

    @Override
    public void takeOff() {
        System.out.println("Increaing speed");
    }

    @Override
    public void fly(){
        System.out.println("I'm flying");
    }

    @Override
    public void land(){
        System.out.println("Move out the way i need space to land");
    }
}
