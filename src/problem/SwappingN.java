package problem;

public class SwappingN {

	
	//forthnumer--------------->firstNumber
	//firstNumber-------------->secondNumber
	//secondNumber------------->thirdNumber
	//thirdNumber-------------->forthNumber
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNumber=66;
		int secondNumber=77;
		int thirdNumber=88;
		int forthNumber=99;
		int temporaryNumber=0;
		
		temporaryNumber=firstNumber;
		firstNumber=forthNumber;
		forthNumber=thirdNumber;
		thirdNumber=secondNumber;
		secondNumber=temporaryNumber;
		
		System.out.println("First Number: "+firstNumber+"\n"+"second Number: "+secondNumber+"\n"+"Third Number:"+thirdNumber+"\n"+"forth Number:"+forthNumber);

	}

}
