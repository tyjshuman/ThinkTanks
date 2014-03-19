package main;

public class Tank {

	final int length = 100;
	final int width = 60;

	final double cornerHeading = Math.atan(((double) length / 2)
			/ ((double) width / 2));

	int heading;
	int x;
	int y;
	int[] FL;
	int[] FR;
	int[] RL;
	int[] RR;

	double diagonal;

	public Tank(int heading, int x, int y) {
		this.heading = heading;
		this.x = x;
		this.y = y;

		diagonal = dist(x, y, x - width / 2, y - length / 2);
	}

	private static double dist(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public int[] getFL() {
		int xout = 0;
		int yout = 0;

		if (getHeading() + cornerHeading >= 0
				&& getHeading() + cornerHeading <= 180) {
			xout = (int) (x - Math.cos(getHeading() + cornerHeading) * diagonal);
		} else
			xout = (int) (x + Math.cos(getHeading() + cornerHeading) * diagonal);

		if (getHeading() + cornerHeading >= 270
				|| getHeading() + cornerHeading <= 90) {
			yout = (int) (y - Math.sin(getHeading() + cornerHeading) * diagonal);
		} else
			yout = (int) (y + Math.sin(getHeading() + cornerHeading) * diagonal);

		return new int[] { xout, yout };
	}

	public int getHeading() {
		return heading % 360;
	}

	private static int fixHeading(int raw) {
		return 360 - (raw % 360);
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void turn() {
		heading++;
	}
}
