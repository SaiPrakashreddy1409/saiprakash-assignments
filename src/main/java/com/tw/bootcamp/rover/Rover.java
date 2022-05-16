package com.tw.bootcamp.rover;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Rover {
    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    private HashMap rotationMap = new HashMap<>();

//    West,North,East,South


    public Position move() {
        if (position.getDirection()==Direction.SOUTH) {
            this.position.setyCordinate(position.getyCordinate()-1);
        }
        if (position.getDirection()==Direction.NORTH) {
            this.position.setyCordinate(position.getyCordinate()+1);
        }
        if (position.getDirection()==Direction.EAST) {
            this.position.setxCordinate(position.getxCordinate()+1);
        }
        if (position.getDirection()==Direction.WEST) {
            this.position.setxCordinate(position.getxCordinate()-1);
        }
        return this.position;
    }

    public Position rotate(String dir) {
        Direction currentDirection = position.getDirection();
        if(dir=="L"){
            if(currentDirection.equals(Direction.SOUTH)){
                this.position.setDirection(Direction.EAST);
            }
            if(currentDirection.equals(Direction.WEST)){
                this.position.setDirection(Direction.SOUTH);
            }
            if(currentDirection.equals(Direction.NORTH)){
                this.position.setDirection(Direction.WEST);
            }
            if(currentDirection.equals(Direction.EAST)){
                this.position.setDirection(Direction.NORTH);
            }
        }
        else {
            if(currentDirection.equals(Direction.SOUTH)){
                this.position.setDirection(Direction.WEST);
            }
            if(currentDirection.equals(Direction.WEST)){
                this.position.setDirection(Direction.NORTH);
            }
            if(currentDirection.equals(Direction.NORTH)){
                this.position.setDirection(Direction.EAST);
            }
            if(currentDirection.equals(Direction.EAST)){
                this.position.setDirection(Direction.SOUTH);
            }

        }

        return this.position;
    }

    public Position performCommand(String command) {
        for(int i = 0 ; i<command.length();i++){
            Character cmd = command.charAt(i);
            if(cmd.equals('M')){
                this.move();
            }
            else this.rotate(String.valueOf(cmd));
        }
        return this.position;
    }
}
