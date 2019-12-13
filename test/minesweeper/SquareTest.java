package minesweeper;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Square;

public class SquareTest {

	@Test
	public void test0_1_Constructor() {
		System.out.println("Probando constructor  ");
		Square prueba = new Square(2, 3);
		assertTrue(prueba instanceof Square);
	}

	@Test
	public void test0_2_Constructor() {
		System.out.println("Probando constructor  ");
		Square prueba = new Square(5, 3);
		assertTrue(prueba instanceof Square);
	}

	@Test
	public void testState() {

		Square prueba = new Square(4, 2);
		// inicialmente state debe estar a 0.
		assertEquals(0, prueba.state());

	}

	@Test
	public void testState2() {

		Square prueba = new Square(4, 2);
		prueba.setState(2);
		assertEquals(2, prueba.state());

	}

	@Test
	public void testMined() {
		Square prueba = new Square(4, 2);
		prueba.setMined(true);
		assertEquals(true, prueba.mined());

	}

	@Test
	public void testMined2() {
		Square prueba = new Square(1, 2);
		
		assertEquals(false, prueba.mined());

	}

	@Test
	public void testGetRow() {
		Square prueba = new Square(1, 2);
		// aunque podemos usar los valor que toma el constructor vamos a usar setRow
		// para comprobarlo también.
		prueba.setRow(2);
		assertEquals(2, prueba.getRow());

	}

	@Test
	public void testGetCol() {
		Square prueba = new Square(1, 2);

		assertEquals(2, prueba.getCol());

	}

}
