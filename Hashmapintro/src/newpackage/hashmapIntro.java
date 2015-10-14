package newpackage;

import java.util.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class hashmapIntro {
	static HashMap < Integer, String> intmap = new HashMap<Integer ,String>();
	
	/*public void add(int a, String b)
	{
		intmap.put(a, b);
				
	}*/

	public static void main(String[] args)
	{
		Scanner keyboard= new Scanner(System.in);
		int num;
		String newVal,cont;
		do{
		System.out.println("Enter a number");
		num=keyboard.nextInt();
		keyboard.nextLine();
		if(intmap.containsKey(num))
		{
			String val = intmap.get(num);
			System.out.println("You entered "+val);
		}
		else
		{
			System.out.println("Value not found - please add to map\nEnter Value below!");
			newVal = keyboard.nextLine();
			intmap.put(num, newVal);
		}
		System.out.println("Continue? Press n to exit");
		cont=keyboard.nextLine();
		
		
	}while(!cont.equals("n"));
		
		 //writing keys and values to a file
	    System.out.println("writing keys and values to a file");
	    String filename = (System.getProperty("user.dir") + File.separatorChar +"Integervalue.txt");
		System.out.println(filename);
	        
	    PrintWriter writer = null;
		try {
			writer = new PrintWriter(new File(filename));
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist!");
		}
		
		//print both the key and the value on same line
		// for each key in the key set write the key, a tab and the value
		for (int key : intmap.keySet()) {
			System.out.println("write this line: " + key);
	    	writer.println(key + "\t" + intmap.get(key));
	    }
		writer.close();
	    
}
}