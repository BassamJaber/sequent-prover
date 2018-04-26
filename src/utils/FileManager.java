package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
	private static final String DEFAULT_FILE = "formula.txt";

	public static String openFileOrDie(String fileName) throws FileNotFoundException {
		if (fileName == null) {
			fileName = DEFAULT_FILE;
		}
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		String formula= input.nextLine();
		System.out.println("Formula in file is:"+formula);
		input.close();
		return formula;
	}
}
