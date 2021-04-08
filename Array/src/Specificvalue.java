//Write a Java program to test if an array contains a specific value.
import java.util.Scanner;
public class Specificvalue {
	//@author Sanjeev Kumar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
		r=sc.nextInt();
		System.out.println("Enter row");
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter Elements of an array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements of an array are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		/*for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		if(arr[i][j]==4)
		{
			System.out.println("Number exist in array list");

		}
		else
		{
			System.out.println("Number don't exist in array list");

		}
	}
	break;*/

		/*System.out.println("Enter number to find");
n=sc.nextInt();
for(int i=0;i<r;i++)
{*/

	}

}
