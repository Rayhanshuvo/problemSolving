package problem;

public class FactorialProb {
	static int n = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int functionReturnValue = factorialProb(n);
		System.err.println(functionReturnValue);
	}

	private static int factorialProb(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
           // System.out.println(n);
            return 1;
			

		} else {
			return n * factorialProb(n - 1);
			//System.err.println(n);
			
		}

	}

}
