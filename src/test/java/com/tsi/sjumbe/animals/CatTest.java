package com.tsi.sjumbe.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CatTest {

    @Test
    public void test_Cat_Instance(){
        Cat testCat = new Cat();
        assertTrue( testCat instanceof Cat,"Its not an instance of Cat");

    }

    @Test
    public void test_Cat_Instance_Inputs(){
        Cat testCatWithInputs = new Cat(1,"lion","Lion colour");
        assertTrue(testCatWithInputs instanceof Cat, "its not an instance of cat");
    }

    @Test
    public void test_Cat_GetAge(){
        Cat testCat = new Cat();
        testCat.setAge(1);
        assertEquals(testCat.getAge(),1,"Get Age isn't working");

    }

}

