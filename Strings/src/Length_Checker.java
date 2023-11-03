////Write a java program to take 2 strings as user input
//and checks whether they are of same length or not. If the 
//strings are of same length then print “Both strings are of same length” otherwise prints 
//“Both strings are of different length”.
import java.util.Scanner;
public class Length_Checker {

	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println("Enter String s1 :");
		String s2 = scan.nextLine();
		if(s1.length()==s2.length())
		{
			System.out.println("Both strings are of same length");
		}
		else 
		{
			System.out.println("Both strings are not of same length");
		}
	}
}
