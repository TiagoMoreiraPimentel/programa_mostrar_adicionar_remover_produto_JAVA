package Aplication;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;

public class programa_mostrar_adicionar_remover_produto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		Product product = new Product(name, price, quantity);
		System.out.printf("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.AddProducts(quantity);
		System.out.printf("Product data: " + product);
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.RemoveProducts(quantity);
		System.out.printf("Product data: " + product);
		System.out.println();
		

		sc.close();

	}

}
