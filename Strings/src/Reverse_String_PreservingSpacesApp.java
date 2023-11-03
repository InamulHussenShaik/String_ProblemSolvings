
public class Reverse_String_PreservingSpacesApp {
	static String solution(String s1)
	{

		char arr[]=s1.toCharArray();
		char revarr[]= new char [arr.length];
		//copy spaces list 
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]==' ')
			{
				revarr[i]=arr[i];
			}  
		}
		//reverse the array 
		int j=revarr.length-1;
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i]!=' ')
			{
				if(revarr[j]==' ')
				{
					j--;
				}
				revarr[j]=arr[i];
				j--;
			}
		}
		String str = new String(revarr);
		return str;
	}
}

