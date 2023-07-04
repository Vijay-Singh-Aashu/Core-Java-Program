package relationship_object;

public class Engine_1 {
	int hp;
	int strokes;
	String type;

	Engine_1() {

	}

	Engine_1(int hp, int strokes, String type) {
		this.hp = hp;
		this.strokes = strokes;
		this.type = type;
	}

	public void displayEngine_1() {
		System.out.println("hp is: " + hp);
		System.out.println("Strokes is: " + strokes);
		System.out.println("Type is: " + type);
	}
}
