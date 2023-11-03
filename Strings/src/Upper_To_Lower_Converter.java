//Write a java program to convert all the uppercase letters to lowercase letters in the string.
import java.util.Scanner;
public class Upper_To_Lower_Converter {
	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		String Converted_String1 =s1.toLowerCase();
		System.out.println(Converted_String1);
		String Converted_String2 =s1.toUpperCase();
		System.out.println(Converted_String2);
		
	}
}
