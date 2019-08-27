package a1;


import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
	int numCust = scan.nextInt();
	
	String [] fullName = new String  [numCust]; 
		
	int [] totPrice = new int[numCust];
		
	for (int i=0; i< numCust; i++) {
	
		String firstName = scan.next();
		
		char initial = firstName.charAt(0);
	
		String lastName = scan.next();
		
		int numItems = scan.nextInt(); 
		
		fullName [i] = initial + "." + lastName;
		 
	
	for (int j=0; j< numItems; j++) {
	
		int quan = scan.nextInt();
	
		String items = scan.next();
	
		double price = scan.nextDouble();
	
		totPrice[j] += quan * price;	
		
		
	}
	

	
	}
	
	scan.close();
	for (int k=0; k< numCust; k++) {
	
	
	System.out.println(fullName [k] + ": "+ totPrice[k]);
	
	

	

	}		
		
	}
}
