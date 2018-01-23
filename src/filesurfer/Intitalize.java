package filesurfer;

import java.io.File;
import java.util.*;



public class Intitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Initialize\n");
		
		File somefile = new File(args[0]);
		Parse p = new Parse();
		Scanner kbd = new Scanner(System.in);
		
		int total;
		int words;
		int numbers;
		int menu;
		
		System.out.println("To get word and number count enter 1");
		System.out.println("To search for a word enter 2");
		
		menu = kbd.nextInt();
		
		if(menu == 1)
		{
			total = Parse.parser(somefile);
			
			words = p.getWords();
			numbers = p.getNumbers();
			
			System.out.println("there are " + words + " words.");
			System.out.println("there are " + numbers + " numbers.");
			
			System.out.println("there are " + total + " words and numbers.");
		}
		else if(menu == 2)
		{
			boolean search;
			System.out.println("enter the keyword");
			String word = kbd.next();

			search = Parse.parser(somefile,word);
			
			if(search)
				System.out.println("It's there");
			else
				System.out.println("It's not there");
			
		}
	}

}
