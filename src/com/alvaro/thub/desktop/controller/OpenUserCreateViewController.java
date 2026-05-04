package com.alvaro.thub.desktop.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.alvaro.thub.desktop.MainWindow;
import com.alvaro.thub.desktop.views.UserView;

public class OpenUserCreateViewController extends Controller{
	
	public OpenUserCreateViewController() {	
		super(null); // Puedes agregar un nombre o un ícono aquí 
	}
	
	@Override
	public void doAction() {
				UserView userCreateView = new UserView();
				MainWindow.getInstance().addClosableView(userCreateView.getName(), userCreateView);			
	}

}
