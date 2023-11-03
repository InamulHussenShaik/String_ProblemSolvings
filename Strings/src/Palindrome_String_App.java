
public class Palindrome_String_App {
String palindromechecker(String s1)
{
	char ch[]=s1.toCharArray();
	char revch[]=new char[ch.length];
	int j=ch.length-1;
	for(int i=0; i<ch.length; i++)
	{
		revch[j]=ch[i];
		j--;
	}
	String revString = new String(revch);
	return revString;
}
}
