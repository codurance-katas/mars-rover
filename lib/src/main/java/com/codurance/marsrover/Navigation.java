package com.codurance.marsrover;

public interface Navigation {


    char execute(char command, char curDirection, int[] curLocation);
}
