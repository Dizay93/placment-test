package basics;

import java.util.Scanner;

public class Drawerb {

	public static void main(String[] args) {
	
		 
		
		
		
					final int[][] matrix = {
					  { 1 },
					  { 1, 1},
					  { 1 ,2 ,1},
					  {1, 3, 3, 1},
					  {1, 4 ,6, 4, 1},
					  {1, 5, 10, 10 ,5 ,1},
					  {1, 6 ,15 ,20 ,15 ,6 ,1},
					  {1, 7 ,21 ,35 ,35 ,21 ,7 ,1},
					  {1 ,8 ,28 ,56 ,70 ,56 ,28 ,8, 1}
					};
					
					for (int i = 0; i < matrix.length; i++) {
					    for (int j = 0; j < matrix[i].length; j++) {
					        System.out.print(matrix[i][j] + " ");
					    }
					    System.out.println();
					}
			     
	           
	        }

	}


