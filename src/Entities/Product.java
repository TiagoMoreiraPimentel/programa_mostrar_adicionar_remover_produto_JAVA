package Entities;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	// construtor
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// getters e setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setName(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	// funções
	public double TotalValueInStock() {
		return price * quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	// formatar texto
	public String toString(){
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", TotalValueInStock());
	}	
}
