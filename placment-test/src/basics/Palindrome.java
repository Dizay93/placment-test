package basics;

import java.util.Scanner;

public class Palindrome {

	private static Scanner in;

	public static void main(String[] args) {
	
		Integer original=0;
	
			Scanner in = new Scanner(System.in);
			System.out.println("Enter int to verifiy is a palindrome");
			original = in.nextInt();
	     
	      		
	      
	    		if(original==Integer.reverse(original))         	
	    			System.out.println("Entered int is a palindrome.");
			    else
			    	System.out.println("Entered int is not a palindrome.");
	    	  
	      
      	
       
	      
	}}

//		
//		
//		String original, reverse = ""; 
//	      Scanner in = new Scanner(System.in);
//	 
//	      System.out.println("Enter a string to check if it is a palindrome");
//	      original = in.nextLine();
//	 
//	      int length = original.length();
//	 
//	      for ( int i = length - 1; i >= 0; i-- )
//	         reverse = reverse + original.charAt(i);
//	 
//	      if (original.equals(reverse))
//	         System.out.println("Entered string is a palindrome.");
//	      else
//	         System.out.println("Entered string is not a palindrome.");}
//}
