package a1;

import java.util.Scanner;

public class A1Jedi {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
	

		int numItems = scan.nextInt(); // number of items
		
		String[] itemName = new String[numItems];// item name
		
		double[] prices = new double[numItems];// prices
		
		int [] custAmount = new int[numItems];  // customer amount
		
		int[]  itemAmount = new int[numItems]; // item amount string 
		 
		for (int i=0; i< numItems ; i++) { // number of items loop
		
			
			itemName[i] = scan.next();
			
			prices[i] = scan.nextDouble();
		}
		
		
		int numCust = scan.nextInt();// number of customers
		
		String [] fullName = new String [numCust]; // full name
		
		double[] totPrice = new double[numCust]; // gives the total price after name 
		
		
		for (int j=0; j< numCust ; j++) {  // loop for names 

				String firstName = scan.next();
				
				String lastName = scan.next();
				
				fullName [j] = firstName + " " + lastName; 
				
				int itemsBought = scan.nextInt();
		
				
				for (int k=0; k< itemsBought ; k++) { // loop based of individual customer 
					int quan = scan.nextInt();
				
					String nameofItem = scan.next();
					
		
					int index = find(itemName,nameofItem);  // index to associate item amount and customer amounts
					
					itemAmount[index] = itemAmount[index] + quan;
					custAmount[index] = custAmount[index] + 1;
						
					
						
						}
				    }
						for (int i = 0; i < itemName.length; i++) { // for loop for final output 
							if (custAmount[i] == 0) {
								System.out.println("No customers bought " + itemName[i]);
							}
						
							else {
								System.out.println(custAmount[i] + " customers bought " + itemAmount[i] + " " + itemName[i]);
							}
			
						}	
	
	}
	

	public static int find(String[] a, String target) { //helper method
		
		int index = 0;
		
		for (int i = 0; i < a.length; i++)
			if (target.equals(a[i]))
				return i;

		return -1;

		
		}	
		
}
	
					
						
					
							
						
						
						
						
						
						
						
									
				
		
				
				
									
		
	
	
