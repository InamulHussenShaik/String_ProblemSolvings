//Write a java program to take 2 strings as user input and 
//returns a concatenated string if the string values are equal.
import java.util.Scanner;
public class Return_Concatination {
	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		System.out.println("Enter String s1 :");
		String s2 = scan.nextLine();
		String res =getConcatinatedString(s1,s2);
		System.out.println("The Concatinated String is :"+res);
	}
	 static String getConcatinatedString(String s1, String s2)
	 {
		 String s3 = null;
		if(s1.equals(s2))
		{
		   s3=s1.concat(s2);
		   
	    } 
		return s3;
		
}
}
