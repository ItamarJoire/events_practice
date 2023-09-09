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
			System.out.println(" (1) - Cadastrar novo usuário");
			System.out.println(" (2) - Cadastrar novo evento");
			System.out.println(" (3) - Listar usuários");
			System.out.println(" (4) - Listar eventos");
			System.out.println(" -------------------------------");
			System.out.println(" (0) - Finalizar programa!");
			
			option = input.nextInt();
			
			switch(option) {
				case 1:
					user.registerUser();
					break;
				
				case 2:
					event.registerEvent();
					break;
					
				case 3: 
					user.getUsers();
					break;
					
				case 4:
					event.getEvents();
					break;
					
				default:
					System.out.println(" Programa finalizado!");
			}
			
			System.out.println();
			
		}while(option != 0);
		
		return option;
	}
}