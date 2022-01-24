package com.tsi.sjumbe.animals.testing;

import com.tsi.sjumbe.animals.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest

{
  @Test
    public void test_set_name(){
        Animal testAnimal = new Animal();
        assertEquals(testAnimal.setName("TestName"),"TestName","The name of the animal does not match what you set it as");
    }
}
