package filesurfer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Parse {
	
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
		
		int numbers = 0;
		int words = 0;
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

}
