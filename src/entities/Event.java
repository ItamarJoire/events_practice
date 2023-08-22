package entities;

import entities.enums.Categories;

public class Event {
	private String name;
	private String address;
	private Categories category;
	
	public Event(String name, String address, Categories category) {
		this.name = name;
		this.address = address;
		this.category = category;
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

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
	
	
}
