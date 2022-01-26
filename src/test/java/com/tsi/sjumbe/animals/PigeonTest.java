package com.tsi.sjumbe.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PigeonTest {


    //Initialising Pigeon for all tests
    Pigeon testPigeon = new Pigeon();

    @Test
    public void test_Pigeon_instance(){
        assertTrue( testPigeon instanceof Pigeon, "Its not an instance of Pigeon");
    }

    @Test
    public void test_Pigeon_setAge(){
        testPigeon.setAge(5);
        assertEquals(5,testPigeon.getAge(), "SetAge Meth is not working");
    }

    @Test
    public void test_TakeOff(){
        assertEquals("takenOff",testPigeon.takeOff(), "takeOff Meth is not working");
    }

    @Test
    public void test_Fly(){
        assertEquals("Flying",testPigeon.fly(),"Fly Meth is not working");
    }

    @Test
    public void test_Land(){
        assertEquals("Landing",testPigeon.land(),"Land Meth is not working");
    }


}
