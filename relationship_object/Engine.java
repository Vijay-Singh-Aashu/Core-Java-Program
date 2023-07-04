package relationship_object;

public class Engine {
	int hp;
	int strokes;
	String type;

	Engine() {

	}

	Engine(int hp, int strokes, String type) {
		this.hp = hp;
		this.strokes = strokes;
		this.type = type;
	}

	public void display() {
		System.out.println("hp is: " + hp);
		System.out.println("Strokes is: " + strokes);
		System.out.println("Type is: " + type);
	}
}
