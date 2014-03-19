package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

/**
 * This demonstrates the controller in a model-view-controller pattern. Adapted
 * from Figures 14.23 and 14.34.
 * 
 * @author Tom Bylander
 */
public class TestingController implements ListSelectionListener,
		MouseMotionListener {
	/**
	 * The model of this MVC example
	 */
	private Tank model;

	/**
	 * The view of this MVC example
	 */
	private TestingView view;

	public TestingController(Tank model, TestingView view) {
		this.model = model;
		this.view = view;
	}

	/**
	 * Add a point to the model when the user drags the mouse, and repaint the
	 * window. Need more logic to draw solid lines.
	 */
	public void mouseDragged(MouseEvent event) {
		Point point = event.getPoint(); // find point
		model.turn();
		view.repaint();
		System.out.println("hi");
	} // end method mouseDragged

	/**
	 * This method doesn't do anything, but it needs to be here to implement
	 * MouseMotionListener.
	 */
	public void mouseMoved(MouseEvent event) {
		// this method intentionally left blank
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}
}
