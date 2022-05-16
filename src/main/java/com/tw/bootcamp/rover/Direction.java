package com.tw.bootcamp.rover;

public enum Direction {
    NORTH("N"), EAST("E"), WEST("W"), SOUTH("S");

    private String value;

    Direction(String value) {
        this.value = value;
    }
}
