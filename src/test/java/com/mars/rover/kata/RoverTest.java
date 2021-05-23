package com.mars.rover.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RoverTest {
	private Rover rover;

	@Test
	public void rotateRight() {
		rover = new Rover();
		assertTrue(rover.execute("R").equals("1:2:E"));
	}
	
}
