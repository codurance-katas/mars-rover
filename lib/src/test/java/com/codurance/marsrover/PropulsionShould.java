package com.codurance.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PropulsionShould {

  public void move_north_once() {
    TestPropulsion testProp = new TestPropulsion();
    

    assertEquals(true, true);
  }

}


class TestPropulsion implements Propulsion {


  @Override
  public int[] execute(char command, char curDirection, int[] curLocation) {
    int[] returnTest = new int[]{5,5};
    return returnTest;
  }
}