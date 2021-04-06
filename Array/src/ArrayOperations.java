import java.util.Scanner;
public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;int sum=0,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Size of array");
n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter elements:");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
	
}

System.out.println("Even Numbers are:");
for(int i=0;i<n;i++)
{
	
	if(arr[i]%2==0)
	{
		
		
		System.out.println(arr[i]);
	}
	
	
}
for(int i=0;i<n;i++)
{
	sum=sum+arr[i];
	
}
System.out.println("Sum is:"+sum);
for(int i=0;i<n;i++)
{
	System.out.println();
}

System.out.println("Size of Array is:"+n);
	}

}
