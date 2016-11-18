package com.pollhq.mymavenproject;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

public class CreateView extends CreateWindow implements View{
	public CreateView(){
		addAction();
	}
	
	public void addAction(){
		pollButton.addClickListener(event -> getUI().getNavigator().navigateTo("poll"));
		logoutButton.addClickListener(event -> getUI().getNavigator().navigateTo(""));
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
