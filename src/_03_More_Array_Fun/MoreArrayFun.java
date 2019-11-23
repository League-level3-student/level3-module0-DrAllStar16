package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[0]="a";
		strings[1]="b";
		strings[2]="c";
		strings[3]="d";
		strings[4]="e";
	printArray(strings);
	System.out.println(" ");
	printArrayBackwards(strings);
	System.out.println(" ");
	printEveryOther(strings);
	System.out.println(" ");
	printRandomOrder(strings);
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
 static	void printEveryOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i%2==0) {
				System.out.println(strings[i]);

			}
					}
	}
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
 
 static	void printRandomOrder(String[] strings) {
	 ArrayList <String> arrayList = new ArrayList <String>();
		Random r = new Random();
		for (int i = 0; i < strings.length; i++) {
			arrayList.add(strings[i]);
		} 
		int size = arrayList.size();
		for (int l = 0; l < size; l++) {
			int thingy = r.nextInt(arrayList.size());
			System.out.println(arrayList.get(thingy));
			arrayList.remove(thingy);
		} 
		
		
	}

}
