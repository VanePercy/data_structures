/*Write in the array*/

package percy.vanesa.arrays;


public class WriteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] firstArray = new int[5];
		int i = 0;
		

		do {
			firstArray[i] = i;
			System.out.println(firstArray[i]);
			i += 1;
			
		} while (i < 5);

	}

}
