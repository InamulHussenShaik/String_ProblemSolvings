import java.util.Scanner;
public class Reverse_String_PreservingSpaces {
public static void main(String[] args) {
	System.out.println("Enter the String to reverse by preserving its spaces :");
	Scanner scan = new Scanner(System.in);
	String s1=scan.nextLine();
	String str =Reverse_String_PreservingSpacesApp.solution(s1);
	System.out.println(str);
	}

}
