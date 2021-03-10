package com.codurance.marsrover;

public class SatNav implements Navigation {
    public char execute(char command, char curDirection, int[] curLocation){
        if(curDirection == 'N' && command == 'L') return 'W';
        if(curDirection == 'N' && command == 'R') return 'E';

        if(curDirection == 'W' && command == 'L') return 'S';
        if(curDirection == 'W' && command == 'R') return 'N';

        if(curDirection == 'S' && command == 'L') return 'E';
        if(curDirection == 'S' && command == 'R') return 'W';

        if(curDirection == 'E' && command == 'L') return 'S';
        if(curDirection == 'E' && command == 'R') return 'N';

        return curDirection;
    }
}