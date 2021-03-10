package com.codurance.marsrover;

public class SatNav implements Navigation {
    public char execute(char command, char curDirection, int[] curLocation){
        char turning = curDirection;
        for (Directions direction : Directions.values() ) {
            if (direction.actual == curDirection && command == 'L')
                turning = direction.left;

            if (direction.actual == curDirection && command == 'R')
                turning = direction.right;
        }

        return turning;
    }
}