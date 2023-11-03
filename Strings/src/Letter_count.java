import java.util.Scanner;
public class Letter_count {
	public static void main(String[] args) {
		System.out.println("Enter a string to count the occurence of each letter in a given string :");
		Scanner scan = new Scanner (System.in);
		String s1=scan.nextLine();
		String s2="";
		for(int i=0; i<s1.length(); i++)
		{
			if (!s2.contains(String.valueOf(s1.charAt(i))))
			{
				s2=s2+s1.charAt(i);
			}
		}
		for(int j=0;j<=s2.length()-1;j++)
		{
			int count=0;
			for(int i=0;i<=s1.length()-1;i++)
			{
				if(s2.charAt(j)==s1.charAt(i))
				{
					count++;
				}
			}
			System.out.println(s2.charAt(j)+" ====> "+count);
		}
		
	}

}
