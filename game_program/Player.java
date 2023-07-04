package game_program;

public class Player {

	static String player_name = "John";

	public static void main(String[] args) {
		Game g = new Game();
		Weapon w = g.pressButton();
		w.use();

	}
}
