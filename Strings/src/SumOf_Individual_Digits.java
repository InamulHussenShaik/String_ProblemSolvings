
public class SumOf_Individual_Digits {
    public static void main(String[] args) 
    {
    	int num=567;
    	String s1=Integer.toString(num);
    	char arr[]=s1.toCharArray();
    	int sum=0;
    	int i=0;
		do
		{
			sum=sum+Character.getNumericValue(arr[i]);
			i++;
		}
		while(i<arr.length);
		System.out.println(sum);
	}
}
