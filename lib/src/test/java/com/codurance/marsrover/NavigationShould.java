package com.codurance.marsrover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavigationShould {

    private Navigation navigation;

    @BeforeEach
    public void setUp() {
        navigation = new SatNav();
    }

    @Test
    public void face_west_after_receiving_left_from_north() {
        char newDirection = navigation.execute('L', 'N', new int[]{5, 5});
        assertEquals('W', newDirection);
    }

    @Test
    public void face_east_after_receiving_right_from_north() {
        char newDirection = navigation.execute('R', 'N', new int[]{5, 5});
        assertEquals('E', newDirection);
    }

    @Test
    public void face_south_after_receiving_left_from_west() {
        char newDirection = navigation.execute('L', 'W', new int[]{5, 5});
        assertEquals('S', newDirection);
    }

    @Test
    public void face_north_after_receiving_right_from_west() {
        char newDirection = navigation.execute('R', 'W', new int[]{5, 5});
        assertEquals('N', newDirection);
    }

    @Test
    public void face_east_after_receiving_left_from_south() {
        char newDirection = navigation.execute('L', 'S', new int[]{5, 5});
        assertEquals('E', newDirection);
    }

    @Test
    public void face_west_after_receiving_right_from_south() {
        char newDirection = navigation.execute('R', 'S', new int[]{5, 5});
        assertEquals('W', newDirection);
    }

    @Test
    public void face_north_after_receiving_left_from_east() {
        char newDirection = navigation.execute('L', 'E', new int[]{5, 5});
        assertEquals('N', newDirection);
    }

    @Test
    public void face_south_after_receiving_right_from_east() {
        char newDirection = navigation.execute('R', 'E', new int[]{5, 5});
        assertEquals('S', newDirection);
    }

}
