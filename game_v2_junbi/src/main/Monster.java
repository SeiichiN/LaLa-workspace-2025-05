package main;

import java.util.Random;

public abstract class Monster extends GameObject {

	public Monster(String name, char suffix) {
		super(name, suffix);
	}

	public void move(Board board) {
		board.map[this.y][this.x] = '.'; 
		int y = 0;
		int x = 0;
		/**
		 *      1
		 *    4 0 2
		 *      3
		 */
		do {
			y = this.y;
			x = this.x;
			int dir = new Random().nextInt(5);
			switch (dir) {
				case 1 -> {
					y -= 1;
					if (y < 0) y = 0;
				}
				case 3 -> {
					y += 1;
					if (y >= board.ysize) y = board.ysize - 1;
				}
				case 4 -> {
					x -= 1;
					if (x < 0) x = 0;
				}
				case 2 -> {
					x += 1;
					if (x >= board.xsize) x = board.xsize - 1;
				}
				default -> {}
			}
		} while(board.map[y][x] != '.');
		board.map[y][x] = this.suffix; 
		this.y = y;
		this.x = x;
	}
}
