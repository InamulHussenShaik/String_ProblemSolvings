//Write a java program to convert all the lowercase letters to uppercase letters in the string.
import java.util.Scanner;
public class Lower_To_Upper {
	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		String Converted_String =s1.toUpperCase();
		System.out.println(Converted_String);

}
}