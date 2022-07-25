package UnitTests;
import week10.Character;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharacterUnitTests {
	Character x = new Character("Akiro", 100, 75, 3, 4, 5);
	

	@Test
	public void getName() {
	String name = x.getName();
	assertEquals("Akiro", name);
	}
	
	@Test
	public void setName() {
	String name = x.setName("Jhon");
	assertEquals("Jhon", name);
	assertNotSame("Jon", name);
	assertNotNull("James", name);
	}
	
	@Test
	public void getMaxHealth() {
	int maxHealth = x.getMaxHealth();
	assertEquals(100, maxHealth);
	assertNotSame(1000, maxHealth);
	assertNotNull("Jay", maxHealth);
	}
	
	@Test
	public void setMaxHealth() {
	int maxHealth = x.setMaxHealth(500);
	assertEquals(500, maxHealth);
	assertNotSame(1000, maxHealth);
	assertNotNull(null, maxHealth);
	}
	
	@Test
	public void getMaxDamage() {
	int maxDamage = x.getMaxDamage(5);
	assertEquals(5, maxDamage);
	assertNotSame(7, maxDamage);
	assertNotNull("123", maxDamage);
	}
	
	@Test
	public void setMaxDamage() {
	int maxDamage = x.setMaxDamage(5000);
	assertEquals(5000, maxDamage);
	assertNotSame(1000, maxDamage);
	}
	
	@Test
	public void getLives() {
	int getLives = x.getLives();
	assertEquals(3, getLives);
	assertNotSame(13, getLives);
	}
	
	@Test
	public void setLives() {
	int setLives = x.setLives(5);
	assertEquals(5, setLives);
	assertNotSame(13, setLives);
	}
	
	
	
}
