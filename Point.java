public class Point {
	
	private int x,y;
	
	public void move(int x, int y) {
			this.x = x;
			this.y = y;
	}
	
	public String toString() {
		return "Point:" + x + "," + y;
	}
	
}
