package com.pollhq.mymavenproject;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.OptionGroup;



@SuppressWarnings("serial")
public class PollView extends PollScreen implements View{
	public PollView(){
		super();
		addAction();
		
	}

	private void addAction() {
		createButton.addClickListener(event -> getUI().getNavigator().navigateTo("create"));
		logoutButton.addClickListener(event -> getUI().getNavigator().navigateTo(""));
		pollPanel.setContent(new PollComponent("Sample", "2"));
		answerPanel.setContent(new OptionGroup());
	}
	

	@Override
	public void enter(ViewChangeEvent event) {
		// TODO Auto-generated method stub
		
	}
}
