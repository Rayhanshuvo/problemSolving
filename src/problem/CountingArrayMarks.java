package problem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingArrayMarks {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>(); 
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many number you wanna input");
		int takenNumber = input.nextInt();

		for (int i = 0; i < takenNumber; i++) {
			System.out.println("Enter your desired namber");
			list.add(input.nextInt());
		}

		for (int j = 0; j < list.size(); j++) {
			// System.err.println(array[j]);
			if (list.get(j) >= 50 && list.get(j) > 0) {
				System.err.println(list.get(j) + "  " + "Pass Mark");
			} else if (list.get(j) < 50) {
				System.out.println(list.get(j) + "  " + "Fail Marks");

			}

		}
	}
}
