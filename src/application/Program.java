package application;



import util.Menu;

public class Program {

	public static void main(String[] args) {
		Menu menu = new Menu();
		System.out.println(menu.MenuOption());
		
		/*
		 	Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a data e hora (formato: xx/xx/xx xx:xx): ");
	        String inputDataHora = scanner.nextLine();

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	        try {
	            LocalDateTime dataHora = LocalDateTime.parse(inputDataHora, formatter);
	            System.out.println("Data e Hora inseridas: " + dataHora.format(formatter));
	        } catch (Exception e) {
	            System.out.println("Formato inválido. Certifique-se de usar o formato correto.");
	        }

	        scanner.close();
	      */
		
		//Categories cat = Categories.OFFICES;
		//System.out.println(cat.getCategoryEvent());
	        
	    
		}

}
