
	public class GameObject {
		int height;
		int width;
		int x;
		int y;

		public GameObject(int height, int width) {
			this.height = height;
			this.width = width;
		}

		public void position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
