package vars;

import java.util.Arrays;

public class VarargsExample {

	public static void printMessages(String... messages) {
		System.out.println("Number of messages: " + messages.length);
		for (String msg : messages) {
			System.out.print(msg + " ");
		}
		System.out.println("\n");
	}

	public static int findLargest(int... numbers) {
		System.out.print("Largest in " + Arrays.toString(numbers) + ": ");
		int max = Integer.MIN_VALUE;
		for (int num : numbers) if (max < num) max = num;

		return max;
	}
}

