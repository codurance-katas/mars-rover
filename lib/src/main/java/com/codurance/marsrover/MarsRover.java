package com.codurance.marsrover;

public class MarsRover {
    Navigation navigation;
    Propulsion propulsion;
    int[] curLocation;
    char curDirection;

    public MarsRover(Navigation navigation, Propulsion propulsion) {
        this.navigation = navigation;
        this.propulsion = propulsion;
        this.curLocation = new int[]{5,5};
        this.curDirection = 'N';
    }

    public void execute(String inputCommand) {
        for (char command : inputCommand.toCharArray()){
            if (command  == 'M') {
                this.curLocation = propulsion.execute(command, curDirection, curLocation);
            }
            if (command == 'L' || command == 'R') {
                this.curDirection = navigation.execute(command, curDirection, curLocation);
            }
        }
    }



}
