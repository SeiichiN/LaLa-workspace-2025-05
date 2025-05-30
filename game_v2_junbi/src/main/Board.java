package main;

public class Board {

	String[][] map = {
			{".", ".", ".", ".", "."},
			{".", ".", ".", ".", "."},
			{".", ".", ".", ".", "."},
			{".", ".", ".", ".", "."},
			{".", ".", ".", ".", "."},
	};
	
	public static final int YSIZE = 5;
	public static final int XSIZE = 5;
	
	public static void printMap(String[][] map) {
		for (int y = 0; y < YSIZE; y++) {
			System.out.print("|");
			for (int x = 0; x < XSIZE; x++) {
				System.out.print(map[y][x] + "|");
			}
			System.out.println();
		}
	}
		
} // class end
