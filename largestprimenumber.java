public class largestprimenumber {

	public static void main(String[] args) {

		// long number = 600851475143L; //readline

		long number = 600851475143L;

		int largestPrimeFactor = 1;

		for (int factor = 1; factor < number; factor++) {
			if (number % factor == 0 && prime(factor)) {
				System.out.println("number: " + number + " factor: " + factor
						+ " largestPrimeFactor: " + largestPrimeFactor);

				largestPrimeFactor = factor;
			}

		}

		System.out.println("The largest prime factor of " + number + " is "
				+ largestPrimeFactor);

	} // end of main

	public static boolean prime(int originalFactor) {
		for (int newFactor = 2; newFactor < originalFactor; newFactor++) {
			if (originalFactor % newFactor == 0) {
				return false;
			}
		}

		return true;
	}

} // end of class
