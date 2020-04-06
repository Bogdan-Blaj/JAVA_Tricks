package com.main;

import java.io.IOException;

import com.main.exception.ProgramException;
import com.main.menu.Menu;

public class MainApp {

	public static void main(String[] args) throws NumberFormatException, ProgramException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Menu menu = new Menu();
		menu.StartMenu();
	}

}
