package week10;

public class Character {

	private String name;
	private int maxHealth;
	private int maxDamage;
	private int lives;
	private int startX;
	private int startY;
	
	public Character(String name, int maxHealth, int maxDamage, int lives, int startX, int startY) {
		this.name = name;
		this.maxHealth = maxHealth;
		this.maxDamage = maxDamage;
		this.lives = lives;
		this.startX = startX;
		this.startY = startY;
	}
	
	public void printDetails( ) {
		System.out.println(this.name + "has " + this.maxHealth + " max health and " +  "has an attacking power of " + this.maxDamage);  
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public int setMaxHealth(int maxHealth) {
		return this.maxHealth = maxHealth;
	}

	public int getMaxDamage(int maxDamage) {
		return this.maxDamage = maxDamage;
	}

	public int setMaxDamage(int maxDamage) {
		return this.maxDamage = maxDamage;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	public int setStartX(int startX) {
		return this.startX = startX;
	}

	public int getStartX() {
		return startX;
	}

	public int getStartY() {
		return startY;
	}

	public int setStartY(int startY) {
		return this.startY = startY;
	}

}
