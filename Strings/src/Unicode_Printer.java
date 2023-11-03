//Write a java program to take a string as user input and print the 
//unicode value of every character present in the string.
import java.util.Scanner;
public class Unicode_Printer {

	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		for(int i=0; i<s1.length(); i++)
		{
			int unicode=(int)s1.charAt(i);
			System.out.println("The unicode value of Index"+ i +" is :"+unicode);
		}
		
	}
}

