package edu.wit.cs.comp1050;

import java.util.Scanner;
import java.util.ArrayList;

//TODO: document this class
public class PA4c {
	
	public static void removeRepeated(ArrayList<Integer> list) {
		// replace with your code
		for (int i = 0; i < list.size(); i++) {
			int value = list.get(i);
			// Check for duplicates of the current value
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(j).equals(value)) {
					list.remove(j);
					j--; // Adjust index after removal
				}
			}
		}
	}

	public static void main(String[] args) {
		// replace with your code
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Enter integers:");
		
		// Read integers from the console until EOF is detected
		while (scanner.hasNextInt()) {
			list.add(scanner.nextInt());
		}
		scanner.close();
		
		if (list.isEmpty()) {
			System.out.println("No values entered.");
		} else {
			// Remove repeated elements
			removeRepeated(list);
			
			// Output the distinct values
			System.out.print("The distinct integer(s):");
			for (int value : list) {
				System.out.print(" " + value);
			}
			System.out.println();
		}
	}

}
