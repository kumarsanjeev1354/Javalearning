//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
public class SumOfElementArray {
	//@author Sanjeev Kumar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,sum=0;
		double avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		r=sc.nextInt();
		System.out.println("Enter no of rows");
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter Elements of an array");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();//Entering values from user
			}
		}
		System.out.println("Elements of an array is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");//Printing and elements of an array
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=sum+arr[i][j];//calculating sum of an array
			}
			
		}
		System.out.println("Sum of an array is:"+sum);//printing sum 
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				avg=sum/arr[i][j];//calculating an average of elements
			}
			
		}
		System.out.println("Average of an array is:"+avg);//printing an average of array elements

	}
}
