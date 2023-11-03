import java.util.Scanner;
public class All_Sub_Strings 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter one string to print all possible strings in it..");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		//char arr[]=s1.toCharArray();
		for(int i=0; i<s1.length(); i++)
		{
			String s2="";

			for(int j=i; j<s1.length(); j++)
			{
				s2 = s2 +s1.charAt(j);//s2 = s2 +Character.toString(arr[j]);
				System.out.println(s2);
			}
		}
	}
}
