package filesurfer;

import java.io.File;
import java.util.*;



public class Intitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initialize\n");
		
		File somefile = new File(args[0]);
		Parse p = new Parse();
//		Scanner fileparse = new Scanner(somefile);
		
		int total;
		int words;
		int numbers;
		
		total = Parse.parser(somefile);
		
		words = p.getWords();
		numbers = p.getNumbers();
		
		System.out.println("there are " + words + " words.");
		System.out.println("there are " + numbers + " numbers.");
		
		System.out.println("there are " + total + " words and numbers.");
	}

}
