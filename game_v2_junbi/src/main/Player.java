package main;

import java.util.Scanner;

public class Player extends GameObject {
	int hp = 100;
	int mp = 50;
	int attackP = 30;

	public Player(String name, char suffix) {
		super(name, suffix);
	}

	public char move(Board board) {
		char mode = 'm';  // m -- move
		int y = this.y;
		int x = this.x;
		System.out.print("w:↑ s:↓ a:← d:→ q:終了");
		@SuppressWarnings("resource")
		char dir = new Scanner(System.in).next().charAt(0);
		switch (dir) {
			case 'w' -> {
				y -= 1;
				if (y < 0) y = 0;
			}
			case 's' -> {
				y += 1;
				if (y >= board.ysize) y = board.ysize - 1;
			}
			case 'a' -> {
				x -= 1;
				if (x < 0) x = 0;
			}
			case 'd' -> {
				x += 1;
				if (x >= board.xsize) x = board.xsize - 1;
			}
			case 'q' -> {
				mode = 'q';  // q -- quit
			}
		}
		this.y = y;
		this.x = x;
		return mode;
	}
}
