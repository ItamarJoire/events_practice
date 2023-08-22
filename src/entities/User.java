package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class User {
	private String name;
	private String age;
	private String work;
	
	public void registerNewUser(String name, String age, String work) {
		this.name = name;
		this.age = age;
		this.work = work;
		
		saveNewUser();
	}
	
	public void saveNewUser() {
		String[] lines = new String[] {"Nome: " + name, "Idade: " + age, "Profissão: " + work};
		
		String path = "C:\\temp\\eventos.txt";
		
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
		String path = "C:\\temp\\eventos.txt";
		
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
