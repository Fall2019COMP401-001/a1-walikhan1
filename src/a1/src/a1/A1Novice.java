package a1;


import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
	int numCust = scan.nextInt();
	
	String [] fullName = new String [numCust]; 
		
	double [] totPrice = new double[numCust];
		
	for (int i=0; i< numCust; i++) {
	
		String firstName = scan.next();
		
		char initial = firstName.charAt(0);
	
		String lastName = scan.next();
		
		int numItems = scan.nextInt(); 
		
		fullName [i] = initial + "." + lastName;
		
	
		for (int j=0; j<numItems; j++) {
	
					int quan = scan.nextInt();
					
					String name = scan.next();
		
					double price = scan.nextDouble();
	
					totPrice[i] += (quan * price);	
		
					
	}
	

		
	}
	
	
	for (int k=0; k< numCust; k++) {
	
	
	System.out.println(fullName[k] + ": "+ String.format("%.2f", totPrice[k]));
	                         
	
	}		
		
	scan.close();
	}
}
