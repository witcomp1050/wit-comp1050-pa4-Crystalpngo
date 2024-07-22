package edu.wit.cs.comp1050;

//TODO: document this class
public class PA4a {
	
	/**
	 * Error if incorrect command-line arguments are supplied
	 */
	public static final String ERR_USAGE = "Please supply correct inputs: <encrypted string> <substring>";
	
	/**
	 * Error if shift could not be found
	 */
	public static final String ERR_NONE = "No valid shifts found.";

	/**
	 * Outputs all shifts of the encrypted string
	 * that contain the supplied substring
	 * 
	 * @param args command-line arguments: <encrypted string> <substring>
	 */
	public static void main(String[] args) {
		// replace with your code
		if (args.length != 2) {
            System.out.println(ERR_USAGE);
            return;
        }

        String encryptedMessage = args[0];
        String substring = args[1];

        Shifter shifter = new Shifter(encryptedMessage);
        int[] validShifts = shifter.findShift(substring);

        if (validShifts.length == 0) {
            System.out.println(ERR_NONE);
        } else {
            for (int shift : validShifts) {
                System.out.printf("%02d: %s%n", shift, shifter.shift(shift));
            }
        }
    }
}

