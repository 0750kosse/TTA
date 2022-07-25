package UnitTests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import week10.Map;

public class MapUnitTests {
	
	static Map m;
	
	 @Before
	    public void setUpAll() {
		  m = new Map(10,10);
		  
	 }
	 
	
	@Test
	public void getX() {
		int x = m.getX();
		assertEquals(10,x);
		assertNotSame(3,x);
	}
	
	@Test
	public void setX() {
		int x = m.setX(30);
		assertEquals(30,x);
		assertNotSame(50,x);
		assertSame(30,x);
	}
	
	
	@Test
	public void getY() {
		int y = m.getY();
		assertEquals(10,y);
		assertNotSame(3,y);
	}
	
	
	
	@Test
	public void setY() {
		int y = m.setY(30);
		assertEquals(30,y);
		assertNotSame(50,y);
	}
	
	@Test
	public void getCurrentX() {
		int x = m.getCurrentX();
		assertEquals(0,x);
		assertNotSame(50,x);
	}
	
	@Test
	public void getCurrentY() {
		int y = m.getCurrentY();
		assertEquals(0,y);
		assertNotSame(2,y);
	}
	
	@Test
	public void setCurrentX() {
		int x = m.setCurrentX(0);
		assertEquals(0,x);
		assertNotSame(2,x);
	}
	
	@Test
	public void setCurrentY() {
		int y = m.setCurrentY(3);
		assertEquals(3,y);
		assertNotSame(42,y);
	}
	
	@Test
	public void moveNorth() {
		m.move("N");
		m.move("N");
		m.move("N");
		m.move("N");
		int y = m.getCurrentY();
		assertSame(4,y);
		assertNotSame(2,y);
		assertNotNull(y);
	}
	
	@Test
	public void moveSouth() {
		m.move("S");
		m.move("S");
		int y = m.getCurrentY();
		assertSame(0,y);
		assertFalse(2 == y);
		
	}
	
	@Test
	public void moveWest() {
		m.move("W");
		m.move("W");
		int x = m.getCurrentX();
		assertNotSame(7,x);
		assertFalse(2 == x);
		assertSame(0,x);
	}
	
	@Test
	public void moveEast() {
		System.out.println(" move4" + m.getCurrentX());
		m.move("E");
		m.move("E");
		m.move("E");
		m.move("E");
		int x = m.getCurrentX();
		assertSame(4,x);
		assertNotSame(6,x);
		assertFalse(1 == x);
		
	}
}



