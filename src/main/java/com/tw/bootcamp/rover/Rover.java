package com.tw.bootcamp.rover;

public class Rover {
    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position move() {
        if (position.getDirection()==Direction.SOUTH) {
            position.setyCordinate(position.getyCordinate()-1);
        }
        return position;
    }
}
