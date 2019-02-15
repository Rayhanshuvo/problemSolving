package problem;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class ComputeNMinusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many number you wanna input");
		int takenNumber = input.nextInt();
		for (int i = 0; i < takenNumber; i++) {
			System.out.println("Enter your desired namber");
			list.add(input.nextInt());
		}

		/*
		 * ListIterator<Integer> listIterator= list.listIterator(); while
		 * (listIterator.hasNext()) {
		 * 
		 * System.err.println(listIterator.next());
		 */

		for (int j = 0; j < list.size() - 1; j++) {

			sum = sum + list.get(j);

		}

		System.err.println("Sums of N-1 items:" + "   " + sum);

	}

}
