package problem;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber=66;
		int secondNumber=77;
		int temporaryNumber=0;
		System.out.println("Before swapping two numbers: \n"+"first Number="+firstNumber+"\n"+"second Number="+secondNumber);
		temporaryNumber= firstNumber;
		firstNumber=secondNumber;
		secondNumber=temporaryNumber;
		
		System.out.println("After swapping two numbers: \n"+"first Number="+firstNumber+"\n"+"second Number="+secondNumber);
	}

}
