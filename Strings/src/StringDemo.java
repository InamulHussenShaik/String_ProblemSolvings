
public class StringDemo 
{
	public static void main(String[] args) {
		
	char arr1[]=new char[10];
	arr1[0]='E';
	arr1[1]='n';
	arr1[2]='a';
	arr1[3]='m';
	arr1[4]='u';
	arr1[5]='l';
	arr1[6]='h';
	arr1[7]='a';
	arr1[8]='q';
	arr1[9]='e';
	for(char x:arr1)
	{
		System.out.print(x+"|");
	}
	System.out.println();
	char arr2[]= new char[arr1.length];
	for(int i=0; i<=arr1.length-1;i++)
	{
		arr2[i]=arr1[i];
	}
	for(char y :arr2)
	{
		System.out.print(y+"|");
	}
	System.out.println();
	char arr3[]= new char[arr2.length];
	int j=0;
	for(int i=arr2.length-1; i>=0; i--)
	{
		arr3[j]=arr2[i];
		j++;
	}
	for(char z :arr3)
	{
		System.out.print(z+"|");
	}
	

}
}
