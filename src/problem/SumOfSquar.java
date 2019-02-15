package problem;

public class SumOfSquar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int readedVar=0;
		int sumOfSquare=0;
		int array[]= {1,2,1,1,1};
		for(int i=0;i<array.length;i++) {
			
			readedVar=array[i]*array[i]; 
			sumOfSquare=sumOfSquare+readedVar;
			
		}
		System.err.println(sumOfSquare);
				

	}

}
