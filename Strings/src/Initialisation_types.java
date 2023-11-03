
public class Initialisation_types 
{
 public static void main(String[] args) 
 {
	 String s1 ="Enamul";
	 String s2=s1;
	 String s3="Enamul";
	 String s4="EnamulHussen";
	 String s5="Enamul"+"Hussen";
	 String s7= new String ("Enamul");
	 String s8=new String ("Enamulhussen");
	 String s6=s1+s7;
	 char ch[]=new char[4];
	 ch[0]='E';
	 ch[1]='n';
	 ch[2]='a';
	 ch[3]='m';
	 String s9= new String(ch);
	 if(s5==s8)
	 {
		 System.out.println("References are equal");
	 }
	 else 
	 {
		 System.out.println("References are not equal");
	 }
	 if(s5.equals(s8))
	 {
		 System.out.println("String Literals are Equal");
	 }
	 else
	 {
		 System.out.println("String literals are not equal");
	 }	
}
}
