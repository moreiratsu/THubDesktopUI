package com.alvaro.thub.desktop.views;
import javax.swing.JPanel;

import org.jdesktop.swingx.JXTitledPanel;

public abstract class View extends JXTitledPanel{
	
	
	private String name = null;
	
	public View() {		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setTitle(name);
	}
	
}
