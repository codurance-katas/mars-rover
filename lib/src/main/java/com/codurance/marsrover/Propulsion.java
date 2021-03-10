package com.codurance.marsrover;

public interface Propulsion {


    int[] execute(char command, char curDirection, int[] curLocation);
}
