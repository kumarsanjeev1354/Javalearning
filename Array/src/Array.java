import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
n=sc.nextInt();
int[] arr1=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
	arr1[i]=sc.nextInt();
}
System.out.println("Elements of array are:");
for(int i=0;i<n;i++)
{
System.out.println(arr1[i]);
}
System.out.println("Size of array" + " " + n);
		
        System.out.println("Hello 1");
		
	}

}
