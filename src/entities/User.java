package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
	private String name;
	private String age;
	private String work;
	
	Scanner input = new Scanner(System.in);
	
	public void registerUser() {	
		System.out.print(" Nome: ");
		name = input.nextLine();
		
		System.out.print(" Idade: ");
		age = input.nextLine();
						
		System.out.print(" Profissão: ");
		work = input.nextLine();
		
		saveUser();
	}
	
	public void saveUser() {
		String[] lines = new String[] {"Nome: " + name, "Idade: " + age, "Profissão: " + work};
		
		String path = "C:\\temp\\usuarios.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			bw.newLine();
			
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getUsers() {
		String path = "C:\\temp\\usuarios.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
