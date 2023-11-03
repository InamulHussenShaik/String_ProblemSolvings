//Write a java program to take a string as user input and returns the count of 
//uppercase letters and lowercase letters.
import java.util.Scanner;
public class Upper_Lower_Counter 
{
	public static void main(String[] args) {
		System.out.println("Enter String s1 :");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		int Upper_Count =0;
		int Lower_Count =0;
		for(int i=0; i<s1.length(); i++)
		{
			int unicode=(int)s1.charAt(i);
			if(unicode<=91)
			{
				Upper_Count+=1;
			}
			else 
			{
				Lower_Count+=1;
			}
		}
		System.out.println("The No of upper case latters are :"+Upper_Count);
		System.out.println("The no of lower case Latters are :"+Lower_Count);
	}

}
