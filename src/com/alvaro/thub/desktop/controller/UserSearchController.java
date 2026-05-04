package com.alvaro.thub.desktop.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;

import com.alvaro.thub.dao.criteria.UserCriteria;
import com.alvaro.thub.desktop.views.UserSearchView;
import com.alvaro.thub.model.UserDTO;
import com.alvaro.thub.service.UserService;
import com.alvaro.thub.service.impl.UserServiceImpl;
import com.alvaro.thub.utils.Results;

public class UserSearchController extends AbstractAction implements KeyListener, ItemListener, PropertyChangeListener {

	private UserSearchView view = null;
	private UserService userService = null;

	public UserSearchController(UserSearchView view) {
		super("Buscar", new ImageIcon(UserSearchController.class.getResource("/nuvola/lupa16.png")));
		this.view = view;
		this.userService = new UserServiceImpl();
	}

	public void doAction(){
		UserCriteria criteria = view.getCriteria();	
		Results<UserDTO> resultados = userService.findBy(criteria, 1, Integer.MAX_VALUE); 
		view.setModel(resultados);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		doAction();	
	}

	@Override
	public void keyPressed(KeyEvent arg0) {	
	}

	// buscar cuando escriba por lo menos 3 caracteres en un textField
	@Override
	public void keyReleased(KeyEvent arg0) {
		doAction();			
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	// buscar cuando seleccione una opcion en un combobox
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		doAction();
	}

	// buscar cuando se cambia un jdatechooser
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().equalsIgnoreCase("date")) {
			doAction();
		}		
	}
}