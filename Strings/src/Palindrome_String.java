import java.util.Scanner;
public class Palindrome_String {
public static void main(String[] args) {
	System.out.println("Enter a string to check wether the given string is palindrome or not :");
	Scanner scanner =new Scanner(System.in);
	String s1 = scanner.nextLine();
	Palindrome_String_App p = new Palindrome_String_App();
	String result = p.palindromechecker(s1);
	System.out.println("Given String :"+s1);
	System.out.println("Reversed String :"+result);
	if(s1.equals(result))
	{
		System.out.println("Given String is Palindrome");
	}
	else 
	{
		System.out.println("Given String is not Palindrome");
	}
			 
}
}
