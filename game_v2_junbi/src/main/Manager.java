package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	Board board;
	Player player;
	List<Monster> monsters;
	List<Item> items;
	
	public Manager() {
		board = new Board();
		monsters = new ArrayList<>();
		items = new ArrayList<>();
		setGameObject();
		player = new Player("勇者", '@');
		player.setPlayer(board);
	}
	
	public void start() {
		board.printMap(player);
		while (true) {
			char ch = selectAction();
			if (ch == 'q') break;
		}
		System.out.println("ゲーム終了");
	}
	
	public void setGameObject() {
		monsters.add(new Goblin("ゴブリン", 'g'));
		monsters.add(new Slime("スライム", 's'));
		for (Monster m : monsters) {
			m.setPosition(board);
		}

		items.add(new Potion("ポーション", 'p'));
		items.add(new Ether("エーテル", 'e'));
		for (Item i : items) {
			i.setPosition(board);
		}
	}
	
	public char selectAction() {
		System.out.print("M:移動 L:見る C:コマンド Q:終了 > ");
		@SuppressWarnings("resource")
		char select = new Scanner(System.in).next().charAt(0);
		switch (select) {
			case 'm' -> {
				move();
			}
			case 'l' -> {
				player.lookAround(board);
			}
			case 'c' -> {
				
			}
		}
		return '0';
	}
	


	public void move() {
		char mode = 'm';
		while (mode == 'm') {
			mode = player.move(board);
			if (mode == 'q') break;
			for (Monster m : monsters) {
				m.move(board);
			}
			board.printMap(player);
		}
		System.out.println("移動おわり");
	}

}
