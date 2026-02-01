package com.babai.dui.ui.controls;

import static com.babai.dui.ui.controls.DUI.borderPane;

import java.awt.Component;

import javax.swing.JFrame;

public class UIWindow extends JFrame
{
	public UIWindow() {
		
	}
	
	public UIWindow title(String title) {
		setTitle(title);
		return this;
	}
	
	public UIWindow size(int width, int height) {
		setSize(width, height);
		return this;
	}

	public UIWindow location(int x, int y) {
		setLocation(x, y);
		return this;
	}
	
	public UIWindow closeOperation(int operation) {
		setDefaultCloseOperation(operation);
		return this;
	}

	public UIWindow visible(boolean visible) {
		setVisible(visible);
		setLocationRelativeTo(null);
		return this;
	}

	public UIWindow resizable(boolean resizable) {
		setResizable(resizable);
		return this;
	}

	public UIWindow content(Component component) {
		setContentPane(borderPane().center(component));
		return this;
	}
	
	public UIWindow packFrame() {
		pack();
		return this;
	}
}
