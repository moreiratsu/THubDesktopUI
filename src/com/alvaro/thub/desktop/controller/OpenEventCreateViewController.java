package com.alvaro.thub.desktop.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.alvaro.thub.desktop.MainWindow;
import com.alvaro.thub.desktop.views.EventView;

/**
 * Controlador para ABRIR LA VISTA DE CREACION DE EVENTOS.
 */

public class OpenEventCreateViewController extends AbstractAction{
	
	public OpenEventCreateViewController() {	
	}

	private void doAction() {
		EventView eventCreateView = new EventView();
		eventCreateView.setEditable(true);
		MainWindow.getInstance().addClosableView(eventCreateView.getName(), eventCreateView);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		doAction();		
	}

}
