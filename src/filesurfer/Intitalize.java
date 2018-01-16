package filesurfer;

import java.io.File;
import java.util.*;



public class Intitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initialize");
		
		File somefile = new File(args[0]);
		Parse p = new Parse();
//		Scanner fileparse = new Scanner(somefile);
		
		int total;
		
		total = Parse.parser(somefile);
		
		System.out.println(total);
	}

}
