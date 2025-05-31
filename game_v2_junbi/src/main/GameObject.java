package main;

import java.util.Random;

public abstract class GameObject {
	int y;
	int x;
	String name;
	char suffix;
	
	public GameObject(String name, char suffix) {
		this.name = name;
		this.suffix = suffix;
	}
	
	public void setPosition(Board board) {
		do {
			setYX(board);
		} while (board.map[y][x] != '.');
		board.map[y][x] = suffix;
	}
	
	public void setPlayer(Board board) {
		setYX(board);
	}
	
	private void setYX(Board board) {
		this.y = new Random().nextInt(board.ysize);
		this.x = new Random().nextInt(board.xsize);
	}
}
