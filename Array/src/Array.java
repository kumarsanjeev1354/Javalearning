import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int[] arr;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Elements of array are:");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
//System.out.println(Size of array)
	}

}