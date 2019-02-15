package problem;

public class PowerProblem {

	//1 2 4 8 16 32 ....... n
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;i++) {
			
			int j= (int) Math.pow(2, i);
			System.out.println(j);
		}

	}

}
