package problem;

public class CountingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// count posing and negative value by counting

		
		  int[] arr = { 55, -22, -20, 88, 44, 1, -4, 9, 10, 66, 55 }; int counter1 = 0,
		  counter2 = 0; for (int i = 0; i < arr.length; i++) {
		  
		  if (arr[i] >= 0) {
		  
		  counter1 = counter1 + 1;
		  
		  }
		  
		  else { counter2 = counter2 + 1; }
		  
		  } System.err.println(counter1); System.err.println(counter2);
		 


	}

}
