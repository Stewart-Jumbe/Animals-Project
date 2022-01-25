package com.tsi.sjumbe.animals.testing;

import com.tsi.sjumbe.animals.Animal;
import com.tsi.sjumbe.animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BatTest {


    @Test
    void bat_Instance_Test(){
        Bat myBat = new Bat();
        assertTrue(myBat instanceof Bat,"Its not an instance of Bat");
    }
    @Test
    void test_setName(){
        Bat testBat = new Bat();
        testBat.setName("TestName");
        assertEquals(testBat.getName(),"TestName","The name of the animal does not match what you set it as");
    }
//    @Test
//    void test_getName(){
//        Bat testBat = new Bat();
//        assertEquals(testBat.setName("Magic John"),"Magic John","setName isnt working");
//    }
    @Test
    void test_set_age(){
        Bat testBat = new Bat();
        testBat.setAge(1);
        assertEquals(testBat.getAge(),1,"Set age isn't working");
    }

    @Test
    void test_setSleepState(){
        Bat testBat = new Bat();
        testBat.setSleepState("Asleep");
        assertEquals(testBat.getSleepState(),"Asleep","setSleepState isnt working");
    }


}
