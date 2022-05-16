package com.tw.bootcamp.rover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.tw.bootcamp.rover.Position;

import static org.junit.jupiter.api.Assertions.*;

public class RoverTest {
    @Test
    public void shouldMoveToZero_One_North_WhenInstructionIs_Zero_Zero_North_Move(){
        Direction direction = Direction.NORTH;
        Rover rover = new Rover(new Position(0,0,direction));

        Position position = rover.move();

        assertTrue(position.isAt(0, 1));
    }

    @Test
    public void shouldMoveToZero_One_South_WhenInstructionIs_Zero_Zero_North_Move(){
        Direction direction = Direction.SOUTH;
        Rover rover = new Rover(new Position(2,3, direction));

        Position position = rover.move();

        assertTrue(position.isAt(2, 2));
    }
}
