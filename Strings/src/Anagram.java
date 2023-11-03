import java.util.Scanner;
public class Anagram {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		if(str1.length()==str2.length())
		{
			AnagramApp theAnagram=new AnagramApp();
			System.out.println(theAnagram.isAnagram(str1,str2)); ;	
		}
		else 
		{
			System.out.println("The Strings are not Anagram");
		}
	}
}

