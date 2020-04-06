package com.main.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.main.exception.ErrorMessages;
import com.main.exception.ProgramException;
import com.main.tasks.fileWordCount.MainFileWordCount;

public class Menu {

	public Menu() {
		
	}
	
	public void StartMenu() {
		System.out.println("Inside Menu");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		int option = 0;
		do {
			System.out.println("________________________________");
			System.out.println("1. Basic Files Operation");
			System.out.println("2. Count number of words from file");
			System.out.println("________________________________");
			
				try {
					option = Integer.parseInt(reader.readLine());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if ( option < 0 ) throw new ProgramException(ErrorMessages.INVALID_OPTION.getErrorMessage());


				System.out.println();
			switch(option) {
			case 1:
				System.out.println("Chosen 1 ");
				break;	
				
			case 2:
				MainFileWordCount mfc = new MainFileWordCount();
				mfc.MainFileWordCountAccessPoint();
				System.out.println("Chosen 2");
				break;
				
			default:
				break;
			
			}
			
			
			
		}while(option != 0);
		
		
	}
}
