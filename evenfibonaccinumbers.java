public class evenfibonaccinumbers {

	public static void main(String[] args) {

		int lowerNum = 1;
		int higherNum = 2;
		int fibonacciSum = 0;
		int sumOfEvens = 2;

		while (fibonacciSum < 4000000) {
			fibonacciSum = lowerNum + higherNum;

			if (fibonacciSum % 2 == 0) {
				sumOfEvens += fibonacciSum;
			}

			lowerNum = higherNum;
			higherNum = fibonacciSum;
		}

		System.out
				.println("The sum of the even-valued Fibonacci numbers below 4 million is: "
						+ sumOfEvens);
	}
}
