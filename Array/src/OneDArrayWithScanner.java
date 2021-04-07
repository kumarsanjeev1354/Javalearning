import java.util.Scanner;
public class OneDArrayWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr;
int n=0;
int p=0;//initilizing values of n=0;
arr=new int[6];//assigning array of lenght equal to 5
Scanner sc=new Scanner(System.in);
System.out.println("Enter array length");
n=sc.nextInt();
System.out.println("Enter elements of array");
for(int i=0;i<n;i++)
{
	
	arr[i]=sc.nextInt();
	
}
System.out.println("Array is");
for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
arr[2]=8;//updateing value of element at value 2;
System.out.println("Updated Array is:");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);

}
	}

}
