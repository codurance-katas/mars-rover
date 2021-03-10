package com.codurance.marsrover;

public class SatNav implements Navigation {
    public char execute(char command, char curDirection, int[] curLocation){
        for (Directions direction : Directions.values() ) {
            if (direction.actual == curDirection && command == 'L') // To be cleaned up. Breaks one indentation/method rule
                return direction.left;

            if (direction.actual == curDirection && command == 'R')
                return direction.right;
        }

        return curDirection;
    }
}