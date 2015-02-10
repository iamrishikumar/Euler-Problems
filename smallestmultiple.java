/*
 * Rishi Kumar
 * CS 196
 * rkumar15
 */
public class smallestmultiple {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int minNum = 0;
		boolean notDivisibleByAll = true;

		while (notDivisibleByAll) {
			for (b = 1; b < 21; b++) {

				if (a % b == 0) {
				} else {
					a++;
					b = 1;
				}

				if (b == 20) {
					minNum = a;
					System.out.println(minNum);
					notDivisibleByAll = false;
				}
			}
		}
	}
}
