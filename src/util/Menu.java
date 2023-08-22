package util;

import java.util.Scanner;

import entities.User;

public class Menu {
	Scanner input = new Scanner(System.in);
	Scanner inputNewUser = new Scanner(System.in);
	User user = new User(); 
	
	public int MenuOption() {
		
		int option = 0;
		
		do {
			System.out.println();
			System.out.println("0 - Finalizar");
			System.out.println("1 - Cadastrar novo usuário");
			System.out.println("2 - Lista de usuários");
			System.out.println("3 - Cadastrar novo evento");
		
			option = input.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Nome: ");
					String name = inputNewUser.nextLine();
					
					System.out.println("Idade: ");
					String age = inputNewUser.nextLine();
					
					System.out.println("Profissão: ");
					String work = inputNewUser.nextLine();
					
					user.registerNewUser(name, age, work);
					
					break;
					
				case 2: 
					user.getUsers();
					
					break;
					
					default:
						System.out.println("Default");
			}
						
		}while(option != 0);
		
		return option;
	}
}
