package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] stuff = new String[5];
		// 2. print the third element in the array
		System.out.println(stuff[2]);
		// 3. set the third element to a different value
		stuff[2] = "hi";
		// 4. print the third element again
		System.out.println(stuff[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < stuff.length; i++) {
			stuff[i] = "hello there";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < stuff.length; i++) {
			System.out.println(stuff[i]);
		}
		// 7. make an array of 50 integers

		int[] thing = new int[50];

		// 8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < thing.length; i++) {
			thing[i] = r.nextInt();
		}

		// 9. without printing the entire array, print only the smallest number on the
		// array
		int small = Integer.MAX_VALUE;

		for (int i = 0; i < thing.length; i++) {
			if (thing[i] < small) {
				small = thing[i];
			}

		}
		System.out.println(small);
		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < thing.length; i++) {
			System.out.println(thing[i]);
		}

		// 11. print the largest number in the array.
		int large = 0;
		System.out.println(" ");
		for (int l = 0; l < thing.length; l++) {
			if (thing[l] > large) {
				large = thing[l];
			}

		}
		int last= 0;
		// 12. print only the last element in the array
		System.out.println(" ");
		for (int e = 0; e < thing.length; e++) {
			last = thing[e];
			
		}
		System.out.println(last);
	}

}
