
public class String_Methods 
{
	public static void main(String[] args) 
	{
		String s1= " jaya lava kusa jaya lava ";
		System.out.println(s1.length());
		System.out.println(s1.startsWith("v"));
		System.out.println(s1.startsWith("j",0));
		System.out.println(s1.endsWith("a"));
		System.out.println(s1.replace('j','k'));
		System.out.println(s1.replace("jaya", "gaya"));
		System.out.println(s1.replaceAll("jaya","maaya"));
		char arr[]=s1.toCharArray();
		System.out.println("===============");
		System.out.print("arr----->");
		int i=0;
		do
		{
			System.out.print(arr[i]+"|");
			i++;
		} while (i<=arr.length-1);
	
	}
}
