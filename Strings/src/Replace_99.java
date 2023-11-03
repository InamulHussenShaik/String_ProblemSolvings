import java.util.Scanner;
public class Replace_99 {
	public static void main(String[] args) {
	System.out.println("Enter one string to remove duplicate letters..");
    Scanner scan = new Scanner(System.in);
    String s1 = scan.nextLine();
    s1=s1.replaceAll(" ", "99");
    System.out.println(s1);
}
}
