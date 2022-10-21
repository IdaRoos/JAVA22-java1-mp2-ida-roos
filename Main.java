package miniprojekt2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Customer c = new Customer(0, 0);
		Product productOne = new Product("Snickers", 12, 4);
		Product productTwo = new Product("Apple", 5, 3);
		Discountproduct productThree = new Discountproduct("Bread", 30, 2, 0.3);

		Scanner sc = new Scanner(System.in);
		boolean checkout = true;

		while (checkout) {
			System.out.println("1. Buy " + productOne.getProdName() + " " + productOne.getProdPrice() + " SEK, " + productOne.getStockUpdate() + " left");
			System.out.println("2. Buy " + productTwo.getProdName() + " " + productTwo.getProdPrice() + " SEK, " + productTwo.getStockUpdate() + " left");
			System.out.println("3. Buy " + productThree.getProdName() + " " + productThree.discountedPrice() + " SEK, " + productThree.getStockUpdate() + " left");
			System.out.println("4. Quit ");
			System.out.print("Choose your option: ");

			int input = sc.nextInt();
			System.out.println();
			

			switch (input) {
			case 1:
				if (productOne.getStockUpdate() <= 0) {
					System.out.println("Oh no, The " + productOne.getProdName() +" are out of stock. Pick something else");
					break;
				}
				else {
				c.setAddtoCart(1, productOne.getProdPrice());
				productOne.setStockupdate();
				break;
				}
			case 2:
				if (productTwo.getStockUpdate() <= 0) {
					System.out.println("Oh no, The " + productTwo.getProdName() + "s are out of stock. Try again later.");
					break;
				}
				else {c.setAddtoCart(1, productTwo.getProdPrice());
				productTwo.setStockupdate();
				break;
				}
			case 3:
				if (productThree.getStockUpdate() <= 0) {
					System.out.println("Oh no, The " + productThree.getProdName() +" are out of stock. Try again later.");
					break;
				}
				else { 
				c.setAddtoCart(1, productThree.discountedPrice());
				productThree.setStockupdate();
	
				break;
				
				}
			case 4:
				System.out.println("You purchased a total of " + c.getProdAmount() + " items. " + "The total cost was "
						+ c.getSumPrice() + " SEK.");
				checkout = false;
				break;

				default:
					System.out.println("You made an invalid choice. Try again. Choose between 1, 2 ,3  or 4.");
					break;
		} 

	}
		sc.close();

}
}
