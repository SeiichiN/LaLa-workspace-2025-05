package main;

import java.util.Scanner;

public class Player extends GameObject {
	int hp = 100;
	int mp = 50;
	int attackP = 30;

	public Player(String name, char suffix) {
		super(name, suffix);
	}
	
	public void lookAround(Board board) {
		char location = board.map[this.y][this.x];
		switch (location) {
			case '.' -> {
				System.out.println("何も見当たりません");
			}
			case 'g' -> {
				System.out.println("ゴブリンが現れた！");
			}
			case 's' -> {
				System.out.println("スライムが現れた！");
			}
			case 'p' -> {
				System.out.println("ポーションが落ちている");
			}
			case 'e' -> {
				System.out.println("エーテルが落ちている");
			}
		}
	}

	public char move(Board board) {
		char mode = 'm';  // m -- move
		int y = this.y;
		int x = this.x;
		System.out.print("W:↑ S:↓ A:← D:→ Q:終了 > ");
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
