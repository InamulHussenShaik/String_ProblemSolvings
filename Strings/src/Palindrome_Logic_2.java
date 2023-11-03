

public class Palindrome_Logic_2 {

	public static void main(String[] args) {
		String s1 = "malayalam";
		char arr[]= s1.toCharArray();
		for(int j=0; j<s1.length(); j++)
		{
			int count =1;
			for(int i=j+1; i<s1.length(); i++)
			{  
				{
					if(s1.charAt(j)==arr[i])
					{
						count ++;
						arr[i]=' ';	
					}
				}
			}
			if(arr[j]!=' ')
			{		
				System.out.println(arr[j]+"====>"+count);

			}
		}
	}
}