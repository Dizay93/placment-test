package basics;

public class GivenFunction {
	public int execute(int m, int n) {
		if(n == 0){ return 0;}
		else if(m == 0){ return 2 * n;}
		else if(n == 1){ return 2;}
		 else { return execute(m - 1, execute(m, n - 1));}
		}


}

