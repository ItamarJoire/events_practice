package entities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.enums.Categories;

public class Event {
	private String name;
	private String description;
	private Categories category;
	private String address;
	private LocalDateTime dateAndHours;
	private String dateAndHoursString;

	Scanner input = new Scanner(System.in);

	public void registerEvent() {
		System.out.print(" Nome: ");
		name = input.nextLine();
		
		System.out.print(" Decrição: ");
		description = input.nextLine();
						
		System.out.println(" Categoria: ");
		System.out.println("  (p) - Profissional");
		System.out.println("  (c) - Cultural");
		System.out.println("  (a) - Artístico");
		System.out.println("  (r) - Religioso");
		System.out.println("  (s) - Social");
		System.out.println("  (o) - Oficial");
		
		String value = input.nextLine();
		
		getCategories(value);
		
		System.out.print(" Endereço: ");
		address = input.nextLine();
		
		System.out.print(" Data e hora: (formato: xx/xx/xx xx:xx): ");
		String inputDateAndHours = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        try {
            dateAndHours = LocalDateTime.parse(inputDateAndHours, formatter);
            dateAndHoursString = dateAndHours.format(formatter);
        } catch (Exception e) {
            System.out.println(" Formato inválido. Certifique-se de usar o formato correto.");
        }
		
		saveEvent();
	}
	
	public void getCategories(String value) {
		switch(value) {
			case "p":
				category = Categories.PROFESSIONALS;;  
				break;
			case "c":
				category = Categories.CULTURAL;  
				break;
			case "a":
				category = Categories.ARTISTIC;  
				break;
			case "r":
				category = Categories.RELIGIOUS;  
				break;
			case "s":
				category = Categories.SOCIAL;  
				break;
			case "o":
				category = Categories.OFFICES;  
				break;
			default: 
				System.out.println("Dando erro!");
		}
	}
	
	public void saveEvent() {
		String[] lines = new String[] {
				"Nome: " + name, 
				"Descrição: " + description,
				"Tipo: " + category,
				"Endereço: " + address,
				"Data e hora: " + dateAndHoursString,
		};
		
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

	public void getEvents() {
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public LocalDateTime getDateAndHours() {
		return dateAndHours;
	}

	public void setDateAndHours(LocalDateTime dateAndHours) {
		this.dateAndHours = dateAndHours;
	}

}
