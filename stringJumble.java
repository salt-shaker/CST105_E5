package stringJumble;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringJumble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		String data = "";

		// Open File
		try {
			File myObj = new File(
					"C:\\Users\\Sashae\\eclipse-workspace\\multiArrStringJumble\\src\\stringJumble\\words.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data += " " + myReader.nextLine();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		// Split words of text file
		char tempArray[] = data.toCharArray();
		
		/*
		for (char x : tempArray) {
			if (x == ' ') {
				System.out.println('*');
			} else {
				System.out.println(x);
			}
		}
		*/

		// 2D Multi-Dimensional Array
		char jumble[][] = new char[6][7];

		// Arrays.fill(char[][] jumble, '*'); // Didn't work for 2d array
		Arrays.stream(jumble).forEach(a -> Arrays.fill(a, '*'));

		int counter = 1;

		System.out.println("Orginal");
		// Row Column
		for (int row = 0; row < jumble.length; row++) {
			for (int col = 0; col < jumble[row].length; col++) {
					if (tempArray[counter] == ' ') {
						System.out.print('*');
						jumble[row][col] = '*';
					} else {
						System.out.print(tempArray[counter]);
						jumble[row][col] = tempArray[counter];
					}
				counter++;
			}
		}
		
		System.out.println("");
		
		System.out.println("Jumbled");

		// Column Row
		for (int col = 0; col < jumble[0].length; col++) {
		for (int row = 0; row < jumble.length; row++) {
				System.out.print(jumble[row][col]);
		}
		}
	}// EOM
} // EOC


