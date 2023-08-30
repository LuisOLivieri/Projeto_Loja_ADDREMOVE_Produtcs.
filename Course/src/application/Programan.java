package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Programan {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be ADDED in STOCK: ");
		int quantity = sc.nextInt(); //VALOR DIGITADO SERÁ PARAMETRO PARA O METODO ADDPRODUCTS.
		product.addProducts(quantity); //ATUALIZAÇÃO DA QUANTIDADE DENTRO DO OBJETO PRODUCT.
		
		System.out.println("UPDATE data: " + product);
		
		System.out.println("Enter the number of products to be REMOVE in STOCK: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("UPDATE data: " + product);
		
		
		sc.close();

	}

}
