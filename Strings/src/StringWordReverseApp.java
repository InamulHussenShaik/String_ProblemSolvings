public class StringWordReverseApp {

	static String solution(String s1)
	{
		String word=null;
		String revstring=null;
		String words[]=s1.split(" ");
		for(int i=0; i<words.length; i++)
		{
			word = words[i];
			char ch1[]=new char [word.length()];
			char ch2[]=new char [word.length()];
			ch1=word.toCharArray();
			int j=word.length()-1;
			for(int k=0; k<ch1.length; k++)
			{
				ch2[j]=ch1[k];
				j--;
			}
			String revword=new String(ch2);
			revstring=revstring+revword+" ";
			
			
		}
		return revstring;
	}
}