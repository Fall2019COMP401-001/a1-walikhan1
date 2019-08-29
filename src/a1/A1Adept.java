package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numItems = scan.nextInt(); // number of items
		
		String[] itemName = new String[numItems];// item name
		
		double[] prices = new double[numItems];// prices
		
		

		for (int i=0; i< numItems ; i++) { // number of items loop
		
			
			itemName[i] = scan.next();
			
			prices[i] = scan.nextDouble();
		}
		
		int numCust = scan.nextInt();// number of customers
		
		
		String [] fullName = new String [numCust]; // full name
		
		double[] totPrice = new double[numCust];
		
		
		for (int j=0; j< numCust ; j++) {

				String firstName = scan.next();
				
				String lastName = scan.next();
				
				fullName [j] = firstName + " " + lastName; 
				
				int itemsBought = scan.nextInt();
				
				for (int k=0; k< itemsBought ; k++) { // loop based on items bought
					
					int quan = scan.nextInt();
				
					String nameofItem = scan.next();
					
					
					int index = 0;	
					
						for (int l = 0; l < itemName.length; l++) {
					
						if(itemName[l].equals(nameofItem)) {
							
							index = l;
						
							break;	
						}
									
				}
						double cost = quan * prices[index];
						
						totPrice [j] += cost; 
								
			
		}	
				
								
	}
	
				int biggest = 0;
				double most = 0.0;
				
				for (int i = 0; i < totPrice.length; i++) { //finds highest paying customer
					if(totPrice[i]>most) {
						most = totPrice[i];
						biggest = i;
					}
			
				}			
				int smallest = 0;
				double least = most;
				
				for (int i = 0; i < totPrice.length; i++) { //finds lowest paying customer
				if(totPrice[i]<least) {
				least = totPrice[i];
				smallest = i;	
				
	}
				
				}
				double average = 0.0;// average
				
				for(int i = 0; i < totPrice.length; i++) { 
					average+=totPrice[i];
	}
				
				{
					
			

					
					average /= totPrice.length; // average
					System.out.println("Biggest: " + fullName[biggest] + " "  + " (" + String.format("%.2f", totPrice[biggest]) + ")"); //prints output
					System.out.println("Smallest: " + fullName[smallest] + " " + " (" + String.format("%.2f", totPrice[smallest]) + ")");
					System.out.println("Average: " + String.format("%.2f", average));
								}
				}
	
}

