package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




//Compute n  numbers then sum and average
public class SummationOfSetOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		List<Integer> list=new ArrayList<>(); 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many number you wanna input");
		int takenNumber = input.nextInt();
		for (int i = 0; i < takenNumber; i++) {
			System.out.println("Enter your desired namber");
			list.add(input.nextInt());
		}
		
		for (Integer evryNumberInList : list) {
			
		      
		      sum=sum+evryNumberInList;
		    		  
		}
		
		System.err.println("Summation of all number:"+"  "+sum);
		System.err.println("Size of List"+"   "+list.size());
		System.out.println("Average of number:"+"  "+sum/list.size());

	}

}
