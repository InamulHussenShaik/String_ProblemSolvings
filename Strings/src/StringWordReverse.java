import java.util.Scanner;
public class StringWordReverse {
	public static void main(String[] args) {
		System.out.println("Enter a string to reverse each word..");
		Scanner scan = new Scanner(System.in);
		String s1=scan.nextLine();
		String str = StringWordReverseApp.solution(s1);
		System.out.println(str);
		
		
	}
}
