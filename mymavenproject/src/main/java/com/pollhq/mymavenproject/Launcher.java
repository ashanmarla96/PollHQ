package com.pollhq.mymavenproject;

import static eu.hurion.vaadin.heroku.VaadinForHeroku.forApplication;
import static eu.hurion.vaadin.heroku.VaadinForHeroku.herokuServer;

public class Launcher {
	public static void main(final String[] args){
		herokuServer(forApplication(MyUI.class)).start();
	}
}
