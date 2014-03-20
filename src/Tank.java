public class Tank {

	final int length = 25;
	final int width = 15;

	final double cornerHeading = Math.atan(((double)length/2)/((double)width/2));
	
	int heading;
	int x;
	int y;
	int[] FL;
	int[] FR;
	int[] RL;
	int[] RR;

	double diagonal;

	public Tank(int heading,int x,int y){
		this.heading = heading;
		this.x = x;
		this.y = y;
		
		diagonal = dist(x,y,x-width/2,y-length/2);
	}

	private static double dist(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public int[] getFL(){
		int x = 0;
		int y = 0;
		
		//if(getHeading() + cornerHeading)
		return new int[] {(int) (x + Math.cos(getHeading() + cornerHeading)*diagonal),(int) (y + Math.sin(getHeading() + cornerHeading)*diagonal)};
	}
	
	public int getHeading(){
		return 360-(heading%360);
	}
	
	private static int fixHeading(int raw){
		return 360-(raw%60);
	}
}
