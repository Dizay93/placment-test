package basics;

public class Drawera {

	public static void main(String[] args) {
		
		final String[][] matrix = {
				{"|","O","|","O","|","X","|"},
				{"|","O","|","X","|","X","|"},
				{"|","O","|"," ","|","O","|"},
				 
				};
				
				for (int i = 0; i < matrix.length; i++) {
				    for (int j = 0; j < matrix[i].length; j++) {
				        System.out.print(matrix[i][j] + " ");
				    }
				    System.out.println();
				}
		     

	}

}
