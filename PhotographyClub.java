/*
 * Assignment4_Francine_Vo.java
 * Francine Vo
 * 01253035
 * 09/26/2023
 */
import java.io.File; // 1. Import classes
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhotographyClub {

	public static void main(String[] args) {
		// 2. Display Header
		System.out.println("  **********************");
		System.out.println("  *  Photography Club  *");
		System.out.println("  **********************");
		System.out.println("Name" + "\t" + "Age");
		System.out.println("====" + "\t" + "===");

		// 3. Declare variables
		String myFile = "input.txt";
		Scanner inData = null;
		double age = 0, oldestAge = 0, youngestAge = 100, totalAge = 0,
				averageAge = 0;
		String name = "", oldestStudent = "", youngestStudent = "";

		// 4. Read data from file
		try {
			inData = new Scanner(new File(myFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("Error opening the file!");
			System.exit(1);
		}
		// 5. Use a loop to read and display the name and the age
		for (int i = 1; inData.hasNext() && i <= 100; i++) { // i is the counter
			name = inData.next();
			age = inData.nextInt();

			// 6. Calculate Average Age
			totalAge += age;
			averageAge = totalAge / i;
			System.out.println(name + "\t" + age);

			// 7. Determine name and age of oldest student
			if (age > oldestAge) {
				oldestAge = age;
				oldestStudent = name;
			}
			// 8. Determine name and age of youngest student
			if (age < youngestAge) {
				youngestAge = age;
				youngestStudent = name;
			}
		}
		// 9. Output results
		System.out.println("Oldest student is " + oldestStudent
				+ ". The student is " + oldestAge + " years old");
		System.out.println("Youngest student is " + youngestStudent
				+ ". The student is " + youngestAge + " years old");
		System.out.println("The average age is " + averageAge + " years old");
	}
}
