package main;

import javax.swing.JFrame;

public class TestingMain {
	public static void main(String args[]) {
		Tank tank = new Tank(340, 50, 50);
		System.out.println(tank.getFL()[0] + " , " + tank.getFL()[1]);

		Tank model = new Tank(0, 300, 300);
		TestingView view = new TestingView(model);
		TestingController controller = new TestingController(model, view);

		// register controller as the listener
		view.registerListener(controller);

		// start it up
		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		view.setSize(700, 700);
		view.setVisible(true);
	}
}
