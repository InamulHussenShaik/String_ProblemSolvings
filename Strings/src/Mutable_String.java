
public class Mutable_String 
{
	public static void main(String[] args) {
		
	StringBuffer sbuf = new StringBuffer("Rama");
	System.out.println(sbuf);
	sbuf.append(" Sita");
	System.out.println(sbuf);
	System.out.println("================");
	StringBuilder sbuild = new StringBuilder("Ravana");
	System.out.println(sbuild);
	sbuild.append(" Surpanaka");
	System.out.println(sbuild);

}
}