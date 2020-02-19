package percy.vanesa.arrays;

import java.util.*;

public class ReadArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = new int[6];
		int i, number;
		Scanner entry = new Scanner(System.in);

		//Request arrays values
		for (i = 0; i < 5; i++){

			System.out.println("Enter the number");
			number = entry.nextInt();
			myArray[i] = number;
			

		} 

		//Print the content of array
		for (i = 0; i < 5; i++){

			System.out.println("The content of the array in index "+ i + " es " + myArray[i] );
			

		} 
		entry.close();

	}

}
