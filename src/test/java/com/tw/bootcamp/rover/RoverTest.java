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

    @Test
    public void ShouldFaceWestAfterRotatedLeftWhileFacingNorth(){
        Direction direction = Direction.NORTH;
        Rover rover = new Rover(new Position(2,3, direction));

        Position position = rover.rotate("L");

        assertTrue(position.isFacing(Direction.WEST));
    }

    @Test
    public void ShouldFaceNorthAfterRotatedRightWhileFacingWest(){
        Direction direction = Direction.WEST;
        Rover rover = new Rover(new Position(2,3, direction));

        Position position = rover.rotate("R");

        assertTrue(position.isFacing(Direction.NORTH));
    }

//    1 2 N LMLMLMLMM - Expected Input
//    1 3 N - Expected Output
    @Test
    public void ShouldReachTheDesiredOutput(){
        Position initialPosition = new Position(1,2,Direction.NORTH);
        Rover rover = new Rover(initialPosition);

        Position finalPosition = rover.performCommand("LMLMLMLMM");

        assertTrue(finalPosition.isAt(1,3));
        assertTrue(finalPosition.isFacing(Direction.NORTH));
    }

}
