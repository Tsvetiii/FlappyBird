
public class MovingObject extends GameObject {
	double speed;
	int move = 1;

	public MovingObject(int width, int height, double speed) {
		super(width, height);
		this.speed = speed;

	}

	public void setMove(int move) {
		this.move = move;
	}

}
