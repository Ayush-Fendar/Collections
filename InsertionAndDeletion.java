// Insertion and deletion 

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionAndDeletion{
	
	ArrayList<String> list = new ArrayList<>();
	
	public void add(String element)
	{
		list.add(element);
	}
	
	public void display()
	{
		System.out.println("Current list :" +list);
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("How many elements you want to add :");
		int num =sc.nextInt(); 
		InsertionAndDeletion obj= new InsertionAndDeletion();
		for(int i=0 ;i<num;i++)
		{
			System.out.println("Enter element :" +(i+1)+ ":");
			String element = sc.next();
			obj.add(element);	
		}
		obj.display();
	}
}