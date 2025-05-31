package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();

		List<Monster> monsters = new ArrayList<>();
		monsters.add(new Goblin("ゴブリン", 'g'));
		monsters.add(new Slime("スライム", 's'));
		for (Monster m : monsters) {
			m.setPosition(board);
		}

		List<Item> items = new ArrayList<>();
		items.add(new Potion("ポーション", 'p'));
		items.add(new Ether("エーテル", 'e'));
		for (Item i : items) {
			i.setPosition(board);
		}
		
		Player player = new Player("勇者", '@');
		player.setPlayer(board);

		board.printMap(player);
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
	
	public static void init(Board board) {
		// board.printMap();
	}

}
