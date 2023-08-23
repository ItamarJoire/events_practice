package entities.enums;

public enum Categories {
	PROFESSIONALS("Profissional"),
	CULTURAL("Cultural"),
	ARTISTIC("Artístico"),
	RELIGIOUS("Religioso"),
	SOCIAL("Social"),
	OFFICES("Oficiais");

	private String categoryEvent; 
	
	Categories(String categoryEvent) {
		this.categoryEvent = categoryEvent;
	}
	
	public String getCategoryEvent() {
		return categoryEvent;
	}
}
