package newpackage;

import java.util.*;

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
}
}