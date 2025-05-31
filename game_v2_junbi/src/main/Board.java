package main;

public class Board {
	public int ysize;
	public int xsize;
	char[][] map;
	
	public Board() {
		this(5, 5);
	}

	public Board(int ysize, int xsize) {
		this.ysize = ysize;
		this.xsize = xsize;
		map = new char[ysize][xsize];
		init();
	}
	
	
	private void init() {
		for (int y = 0; y < ysize; y++) {
			for (int x = 0; x < xsize; x++) {
				map[y][x] = '.';
			}
		}
	}
	
	public void printMap() {
		for (int y = 0; y < ysize; y++) {
			System.out.print("|");
			for (int x = 0; x < xsize; x++) {
				System.out.print(map[y][x] + "|");
			}
			System.out.println();
		}
	}
		
	public void printMap(Player player) {
		for (int y = 0; y < ysize; y++) {
			System.out.print("|");
			for (int x = 0; x < xsize; x++) {
				if (y == player.y && x == player.x) {
					System.out.print(player.suffix + "|");
				} else {
					System.out.print(map[y][x] + "|");
				}
			}
			System.out.println();
		}
	}
} // class end
