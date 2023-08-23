package util;

import java.util.Scanner;

import entities.Event;
import entities.User;

public class Menu {
	Scanner input = new Scanner(System.in);
	
	User user = new User();
	Event event = new Event();

	public int MenuOption() {
		int option = 0;
		
		do {
			System.out.println();
			System.out.println("0 - Finalizar");
			System.out.println("1 - Cadastrar novo usuário");
			System.out.println("2 - Lista de usuários");
			System.out.println("3 - Cadastrar novo evento");
			System.out.println("4 - Lista de eventos");
			
			option = input.nextInt();
			
			switch(option) {
				case 1:
					user.registerUser();
					break;
					
				case 2: 
					user.getUsers();
					break;
					
				case 3:
					event.registerEvent();
					break;
				case 4:
					event.getEvents();
					break;
					
				default:
					System.out.println("Default");
			}
			
		}while(option != 0);
		
		return option;
	}
}