package com.tsi.sjumbe.animals.testing;

import com.tsi.sjumbe.animals.Animal;
import com.tsi.sjumbe.animals.Bat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BatTest {


    @Test
    void test_set_name(){
        Bat testBat = new Bat();
        testBat.setName("TestName");
        assertEquals(testBat.getName(),"TestName","The name of the animal does not match what you set it as");
    }

//    @Test
//    void test_set_age(){
//        Bat testBat = new Bat();
//        assertEquals(testBat.);
//
//    }
}
