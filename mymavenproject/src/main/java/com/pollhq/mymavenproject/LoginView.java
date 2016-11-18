package com.pollhq.mymavenproject;


import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

@SuppressWarnings("serial")
public class LoginView extends LoginScreen implements View {
	public LoginView(){
		super();
		addAction();
	}
	
	public void addAction(){
		loginButton.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo("poll");
			}
		});
		registerButton.addClickListener(new ClickListener(){
			@Override
			public void buttonClick(ClickEvent event) {
				getUI().getNavigator().navigateTo("registration");
			}
		});
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
