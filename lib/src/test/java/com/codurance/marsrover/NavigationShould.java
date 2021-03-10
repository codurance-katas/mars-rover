package com.codurance.marsrover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationShould {

  @Test
  public void test() {
    assertEquals(true, true);
  }

  @Test
  public void face_west_after_receiving_left(){
    Navigation navigation = new SatNav();
    char newDirection = navigation.execute('L', 'N', new int[]{5,5});
    assertEquals('W', newDirection);

  }

  @Test
  public void face_east_after_receiving_right(){
    Navigation navigation = new SatNav();
    char newDirection = navigation.execute('R', 'N', new int[]{5,5});
    assertEquals('E', newDirection);
  }

  @Test
  public void face_south_after_receiving_left_from_position_west(){
    Navigation navigation = new SatNav();
    char newDirection = navigation.execute('L', 'W', new int[]{5,5});
    assertEquals('S', newDirection);
  }

}
