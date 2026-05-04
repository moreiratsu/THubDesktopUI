package com.alvaro.thub.desktop.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Icon;

import com.alvaro.thub.desktop.views.View;

public abstract class Controller extends AbstractAction {
	
	private View view = null;
	
	public Controller(View view) {
		this(view, null);
	}
	
	public Controller(View view, String name) {
		this(view, name, null);
	}
	
	public Controller(View view, String name, Icon icon) {
		super(name, icon);
		this.view = view;
	}
	
	public View getView() {
		return this.view;
	}
	
	public abstract void doAction();
	

	public final void actionPerformed(ActionEvent e) {
		doAction();
	}
	
}
