import java.util.Scanner;
public class Remove_Duplicate {
	public static void main(String[] args) {
		System.out.println("Enter one string to remove duplicate letters..");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		//char arr[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(!s2.contains(String.valueOf(s1.charAt(i))))
			{
			  s2 = s2+s1.charAt(i);//s2=s2+Character.toString(arr[i]);
			}
		}
		System.out.println(s2);
	}
}
