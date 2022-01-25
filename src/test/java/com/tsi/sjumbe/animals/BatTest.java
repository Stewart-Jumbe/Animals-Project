package com.tsi.sjumbe.animals;

import com.tsi.sjumbe.animals.Animal;
import com.tsi.sjumbe.animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatTest {


    @Test
    public void test_bat_Instance(){
        Bat myBat = new Bat();
        assertTrue(myBat instanceof Bat,"Its not an instance of Bat");
    }
    @Test
    public void test_setName(){
        Bat testBat = new Bat();
        testBat.setName("TestName");
        assertEquals("TestName",testBat.getName(),"The name of the animal does not match what you set it as");
    }

    @Test
    public void test_set_age(){
        Bat testBat = new Bat();
        testBat.setAge(1);
        assertEquals(1,testBat.getAge(),"Set age isn't working");
    }

    @Test
    public void test_setSleepState(){
        Bat testBat = new Bat();
        testBat.setSleepState("Asleep");
        assertEquals("Asleep",testBat.getSleepState(),"setSleepState isnt working");
    }

    @Test
    public void test_takeOff(){
        Bat testBat = new Bat();
        testBat.takeOff();
        assertEquals("takenOff",testBat.getFlightStatus(),"Flight status not working");
    }

    @Test
    public void test_fly(){
        Bat testBat = new Bat();
        testBat.fly();
        assertEquals("Flying",testBat.getFlightStatus(),"Flight status not working");

    }

    @Test
    public void test_land(){
        Bat testBat = new Bat();
        testBat.land();
        assertEquals(testBat.getFlightStatus(),"Landing","flightStatus isnt working");

    }

}
