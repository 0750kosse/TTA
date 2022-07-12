package week10;

public class Map {
	
	private int x;
	private int y;
	private int currentX;
	private int currentY;
	
	public int getX() {
		return this.x;
	}
	
	public int setX(int x) {
		return this.x = x;
	}
	
	public int getY() {
		return this.y;
	}

	public int setY(int y) {
		return this.y = y;
	}

	public Map(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	  
	public int setCurrentX(int currentX) {
		return this.currentX = currentX;
	}

	public int setCurrentY(int currentY) {
		return this.currentY = currentY;
	}

	public void move(String direction) {
		if (direction.equals("N")) {
			if (this.currentY == this.y) {
				this.currentY = 0;
			} else {
				this.currentY = this.currentY + 1;
				
				System.out.println("Your current location is X:" + currentX  + " Y: " + currentY);
			}
		} else if (direction.equals("S")) {
			if (this.currentY == this.y) {
				this.currentY = 0;
			} else {
				this.currentY = this.currentY - 1;
				System.out.println("Your current location is X:" + currentX  + " Y: " + currentY);
			}
		} else if (direction.equals("E")) {
			if (this.currentX == this.x) {
				this.currentX = 0;
			} else {
				this.currentX = this.currentX + 1;
				System.out.println("Your current location is X:" + currentX  + " Y: " + currentY);
			}
		} else if (direction.equals("W")) {
			if (this.currentX == this.x) {
				this.currentX = 0;
			} else {
				this.currentX = this.currentX - 1;
				System.out.println("Your current location is X:" + currentX + " Y: " + currentY);
			}
		} 
		
		
		if (this.currentX >10 || this.currentY > 10) {
			System.out.println("you are running out of map!");
			this.currentX = 0;
			this.currentY = 0;
		} else if (this.currentX < 0 || this.currentY < 0) {
			this.currentX = this.x;
			this.currentY = this.y;
		}
		
		if(this.currentX == 3 && this.currentY == 5) {
			System.out.println("t > ## A baddie will appear");
		}
		if (this.currentX == 5 && this.currentY == 5) {
			System.out.println("\t > ## Congratulations!! You found the exit!");
			
		} 
		
	}
	
}

