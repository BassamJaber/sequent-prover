package driver;

import java.io.FileNotFoundException;

import utils.FileManager;

public class Main {

	public static void main(String[] args) {
		try {
			FileManager.openFileOrDie(null);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found!");
		}
	}
	
	public static void formulaParsing(){
		
	}
}
