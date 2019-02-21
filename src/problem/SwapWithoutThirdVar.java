package problem;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOne=10;
		int numberTwo=6;
		
		numberOne=numberOne+numberTwo;
		numberTwo= numberOne-numberTwo;
		numberOne= numberOne-numberTwo;
		
		System.out.println("NumberOne:"+numberOne+"\n"+"NumberTwo:"+numberTwo);

	}

}
