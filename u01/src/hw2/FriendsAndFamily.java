package hw2;

import java.util.Scanner;

public class FriendsAndFamily {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("\nEnter list price: ");
			double listPrice = input.nextDouble();
			
			System.out.println("Enter discount %: ");
			int discount = input.nextInt();
			System.out.printf("You'll pay only $%2.2f", listPrice - listPrice*discount/100);
			
		} while(true);

	}

}
