package com.tw.bootcamp.rover;

public class Position {

    private int xCordinate;
    private int yCordinate;
    private Direction direction;

    public Position(int xCordinate, int yCordinate, Direction direction) {
        this.xCordinate = xCordinate;
        this.yCordinate = yCordinate;
        this.direction = direction;
    }

    public int getxCordinate() {
        return xCordinate;
    }

    public void setxCordinate(int xCordinate) {
        this.xCordinate = xCordinate;
    }

    public int getyCordinate() {
        return yCordinate;
    }

    public void setyCordinate(int yCordinate) {
        this.yCordinate = yCordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isAt(int x, int y) {
        if(this.xCordinate == x && this.yCordinate == y)
            return true;
        return false;
    }
}
