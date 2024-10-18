/*
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: Tests the GradeBook class
 * Due: 10/19/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Schuknecht
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook bookOne;
	private GradeBook bookTwo;
	
	@BeforeEach
	void setUp() throws Exception {
		
		bookOne = new GradeBook(5);
		bookTwo = new GradeBook(5);
		
		bookOne.addScore(100);
		bookOne.addScore(95);
		bookTwo.addScore(77);
		bookTwo.addScore(88);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		bookOne = null;
		bookTwo = null;
	}

	@Test
	void testAddScore() {
		
		assertTrue(bookOne.toString().equals("100.0 95.0 "));
		assertTrue(bookTwo.toString().equals("77.0 88.0 "));
		
		assertEquals(2, bookOne.getScoreSize());
		assertEquals(2, bookTwo.getScoreSize());
	}

	@Test
	void testSum() {
		
		assertEquals(195, bookOne.sum());
		assertEquals(165 , bookTwo.sum());
	}

	@Test
	void testMinimum() {
		
		assertEquals(95.0, bookOne.minimum());
		assertEquals(77.0, bookTwo.minimum());
	}

	@Test
	void testFinalScore() {
	
		assertEquals(100, bookOne.finalScore());
		assertEquals(88, bookTwo.finalScore());
	}
}
