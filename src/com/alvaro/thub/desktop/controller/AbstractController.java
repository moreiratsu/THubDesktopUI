package com.alvaro.thub.desktop.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;

import com.alvaro.thub.desktop.views.View2;

public abstract class AbstractController
extends AbstractAction /* ActionListener*/
implements
ItemListener, KeyListener,		
Controller2 {

	private View2 view = null;

	public AbstractController() {			
	}

	public AbstractController(View2 view) {
		this.view = view;
	}

	@Override
	public View2 getView() {
		return this.view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		doIt();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		doIt();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// doIt();		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// doIt();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		doIt();		
	}

}
