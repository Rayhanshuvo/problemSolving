package problem;

public class FindHarmonicMean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfInput=5;
		double takenValue=0.0;
		double sumOfArrayValue = 0.0;
		double finalOutPutOfHarmonicMean=0.0;
		double array[]= {1,2,3,4,5};
		
		for(int i=0;i<numberOfInput;i++) {
			
			takenValue=(1/array[i]);
			//System.out.println(takenValue);
			sumOfArrayValue=sumOfArrayValue+takenValue;
			//System.err.println(sumOfArrayValue);
			
		}
		System.err.println(sumOfArrayValue);
		finalOutPutOfHarmonicMean=numberOfInput/sumOfArrayValue;
		System.out.println(finalOutPutOfHarmonicMean);

	}

}
