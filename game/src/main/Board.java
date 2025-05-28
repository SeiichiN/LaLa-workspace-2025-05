package main;

public class Board {

	public static void main(String[] args) {
		String[][] map = {
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."},
				{".", ".", ".", ".", "."},
		};
		setObject("g", map);  // goblin
		setObject("s", map);  // slime
		setObject("p", map);  // potion
		setObject("e", map);  // ether
		setObject("@", map);  // player
		printMap(map);
	} // main() end
	
	public static void printMap(String[][] map) {
		
	}
		
    public static void setObject(String obj, String[][] map) {
		int y = 0;
		int x = 0;
		do {
			y = new java.util.Random().nextInt(5);
			x = new java.util.Random().nextInt(5);
		} while (! map[y][x].equals("."));
				
		map[y][x] = obj;
		
	}

} // class end
