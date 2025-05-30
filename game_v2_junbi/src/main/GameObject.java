package main;

import java.util.Random;

public abstract class GameObject {
	int y;
	int x;
	String name;
	
	public GameObject(String name) {
		this.name = name;
	}
	
	public void setPosition(Board board) {
		do {
			this.y = new Random().nextInt(Board.YSIZE);
			this.x = new Random().nextInt(Board.XSIZE);
		} while (!board.map[y][x].equals("."));
		board.map[y][x] = name.substring(0, 1);
	}
}
