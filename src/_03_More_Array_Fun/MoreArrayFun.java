package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[1]="a";
		strings[2]="b";
		strings[3]="c";
		strings[4]="d";
		strings[5]="e";
	printArray(strings);
	printArrayBackwards(strings);
	}	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	
 static	void printArray(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
 static	void printArrayBackwards(String[] strings) {
		for (int i = strings.length-1; i >= 0; i--) {
			System.out.println(strings[i]);
		}
		
		
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	

}
