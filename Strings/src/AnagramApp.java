import java.util.Arrays;
public class AnagramApp {
	String isAnagram(String str1,String str2)
	{
	char[] arr1 = str1.toLowerCase().toCharArray();
	char[] arr2 = str2.toLowerCase().toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0; i<arr1.length; i++)
	{
		if(arr1[i]!=arr2[i])
		{
			return "Strings are not Anagram";
		}
	}
	return "Strings are Anagram";
//	if(String.valueOf(arr1).equals(String.valueOf(arr2)))
//	{
//	     return "The Strings are Anagram";
//	}
//	return "The Strings are not not Anagram";
}
}

