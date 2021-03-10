package com.codurance.marsrover;

public class SatNav implements Navigation {
    public char execute(char command, char curDirection, int[] curLocation){
        if(curDirection == 'N' && command == 'L') return 'W';
        if(curDirection == 'N' && command == 'R') return 'E';
        if(curDirection == 'W' && command == 'L') return 'S';
        return 'N';
    }
}