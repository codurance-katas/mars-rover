package com.codurance.marsrover;

public enum Directions {
    NORTH('N', 'W', 'E'),
    EAST('E', 'N', 'S'),
    SOUTH('S', 'E', 'W'),
    WEST('W', 'S', 'N');

    char actual;
    char left;
    char right;

    Directions(char actual, char left, char right) {
        this.actual = actual;
        this.left = left;
        this.right = right;
    }
}
