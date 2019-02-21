package problem;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		int l=0;
		int m=1;
		int counter=0;
		 int i=0;
		int[] arr = new int[10];
		for (i = 0; i < 10; i++) {

		
			if (i < 2) {
				arr[i] = i;
				//System.out.println(arr[i]);
			}
			
			// System.out.println(arr[i]);
			else if (i >= 2 && i < 10) {
				for (k = 0; k < 1; k++) {
					//System.out.println("Test");
					int temp = arr[l] + arr[ m];
					System.out.println("sum"+temp);
					int j = counter;
					System.out.println("Value j:"+j);
					arr[j] = temp;
                   //System.out.println("ber hossi"+k); 
					
				}
				//System.err.println("Baire+"+k);
				l++;
				m++;
			}
        //System.out.println("Count:"+i);
			counter=counter+1;
		}
		for (int excess : arr) {
			System.err.println(excess);
		}

	

	}

}
