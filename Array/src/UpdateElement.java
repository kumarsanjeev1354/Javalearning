//Update elements in an array
import java.util.Scanner;
public class UpdateElement {
	//@author Sanjeev Kumar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row of array");
		r=sc.nextInt();//entering no of rows needed for array
		System.out.println("Enter Column of an array");
		c=sc.nextInt();//entering no of rows needed for array
		int[][]arr=new int[r][c];//intilizing 2d array with row r and column c
		System.out.println("Enter Elements of any array");// Entering elements of an array
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();//Getting input from user for elements from user
			}
		}
		System.out.println("Elements of matrix is");//Printing elements of an array
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");//Printing final array
			}
			System.out.println();
		}
		System.out.println("Enter value of elements to be update");
		n=sc.nextInt();//entering value to be updated
		arr[0][2]=n;//setting updated value at row 0 and column 2th position

		System.out.println("Updated array is");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+"\t");//printing updated array list
			}
			System.out.println();
		}

	}

}
