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
		// setObject("@", map);  // player
		printMap(map);
	} // main() end
	
	public static void printMap(String[][] map) {
		for (int y = 0; y < 5; y++) {
			System.out.print("|");
			for (int x = 0; x < 5; x++) {
				System.out.print(map[y][x] + "|");
			}
			System.out.println();
		}
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
