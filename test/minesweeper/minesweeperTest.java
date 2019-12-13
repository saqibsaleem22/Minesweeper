package minesweeper;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Minesweeper;
import Square;

public class minesweeperTest {

	 

	@Test
	public void calculateMinesTest() {
		Minesweeper ejemplo = new Minesweeper();
		Square minado1 = new Square(2, 2);
		minado1.setMined(true);
		Square minado2 = new Square(2, 4);
		minado1.setMined(true);
		 
		assertEquals(2, ejemplo.calculateMines(2,3));
	}

	@Test
	public void validOptionTest() {
		Minesweeper ejemplo = new Minesweeper();
		assertEquals(false, ejemplo.validOption(-1, 0));

	}

	@Test
	public void validOptionTest2() {
		Minesweeper ejemplo = new Minesweeper();
		assertEquals(true, ejemplo.validOption(-2, 0));

	}

}
