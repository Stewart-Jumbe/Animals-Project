package com.tsi.sjumbe.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatTest {

    //Initialising cat for all tests
    Cat testCat = new Cat();

    @Test
    public void test_Cat_Instance(){

        assertTrue( testCat instanceof Cat,"Its not an instance of Cat");

    }

    @Test
    public void test_Cat_Instance_Inputs(){
        Cat testCatWithInputs = new Cat(1,"lion","Lion colour");
        assertTrue(testCatWithInputs instanceof Cat, "its not an instance of cat");
    }

    @Test
    public void test_Cat_GetAge(){
        testCat.setAge(1);
        assertEquals(1,testCat.getAge(),"Get Age isn't working");
    }

    @Test
    public void test_setName(){
        testCat.setName("Breygon");
        assertEquals("Breygon",testCat.getName(),"setName method not working");
    }

    @Test
    public void test_setSleepState(){
        testCat.setSleepState("awake");
        assertEquals("awake",testCat.getSleepState(),"setSleep state isn't working");
    }



}

