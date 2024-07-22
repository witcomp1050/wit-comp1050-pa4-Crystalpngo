package edu.wit.cs.comp1050;

import java.util.ArrayList;

public class Shifter {
	public static final int NUM_LETTERS = ('z' - 'a') + 1;
	private String encrytedMessage;

	public Shifter(String s) {
		// replace with your code
		this.encrytedMessage = s;
	}

    public static char shift1(char c, int n) {
        if (Character.isLetter(c)) {
        	char base = Character.isLowerCase(c) ? 'a' : 'A';
        	return (char) ((char) ((c - base + n + NUM_LETTERS)) % NUM_LETTERS + base);
        }
    	return c;
    }

	public String shift(int n) {
		StringBuilder shifted = new StringBuilder();
		for (char c : encrytedMessage.toCharArray()) {
			shifted.append(shift1(c, n));
		}
		return shifted.toString(); // replace with your code
	}

	public int[] findShift(String sub) {
        ArrayList<Integer> found = new ArrayList<>();
        for(int i = 0; i < NUM_LETTERS; i++) {
        	if (shift(i).contains(sub)) {
        		found.add(i);
        	}
        }
   
        int[] foundAsArray = new int[found.size()];
        for (int i = 0; i < found.size(); i++) {
            foundAsArray[i] = found.get(i);
        }
        return foundAsArray;
	}

}
