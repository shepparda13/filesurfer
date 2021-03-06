package filesurfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parse {
	
	private static int words;
	private static int numbers;
	
	//Parse file and included files to get total number of words
	//and numbers filepaths not included
	public static int parser(File somefile)
	{
		Scanner fileparse = null;
		
		try {
			fileparse = new Scanner(somefile);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total = 0;
		
		while(fileparse.hasNext())
		{
			String current = fileparse.next();
			
			if(Parse.isNumber(current))
			{
				total++;
				numbers++;
			}
			
			else if(Parse.isFile(current))
				total += parser(new File(current));
			
			else
			{
				total++;
				words++;
			}
						
		}
		return total;
	}
	
	//Parse file to search for a specific keyword
	public static boolean parser(File somefile,String keyword)
	{
		Scanner fileparse = null;
		
		try {
			fileparse = new Scanner(somefile);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(fileparse.hasNext())
		{
			String current = fileparse.next();
			
			if(current.equals(keyword))
				return true;
			
			else if(Parse.isFile(current))
				return parser(new File(current), keyword);
				
		}
		return false;
	}
	
	public static boolean isNumber(String str)
	{
		try 
		{
			Double number = Double.parseDouble(str);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}
	
	public static boolean isFile(String str)
	{
		if(str.contains(":"))
			return true;
		else 
			return false;
	}
	
	public int getNumbers()
	{
		return numbers;
	}
	
	public int getWords()
	{
		return words;
	}
	
	

}
