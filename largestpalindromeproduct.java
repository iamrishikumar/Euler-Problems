import java.io.*;
import java.util.*;

public class largestpalindromeproduct {

	public static void main(String[] args) {

		int product;
		int maxPalindrome = 0;
		for (int i = 100; i < 1000; i++) {

			for (int j = 100; j < 1000; j++) {
				product = i * j;
				System.out.println("i " + i + "\tj: " + j + "\tproduct:"
						+ product);
				if (isPalindrome(product)) {
					if (product > maxPalindrome) {
						maxPalindrome = product;
					}
				}
			}
		}

		System.out.println(maxPalindrome
				+ " is the largest three digit palindrome!");

	}

	public static boolean isPalindrome(int num) {

		String str = Integer.toString(num);
		int first = 0;
		int last = str.length() - 1;

		for (int i = 0; i < str.length() / 2; i++) {

			char firstLetter = str.charAt(first);
			char lastLetter = str.charAt(last);
			if (firstLetter != lastLetter) {
				return false;
			}

			first++;
			last--;
		}

		return true;

	}
}