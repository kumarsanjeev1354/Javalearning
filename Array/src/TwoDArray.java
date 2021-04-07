//Intilization of Two D array
import java.util.Scanner;
public class TwoDArray {
//@author Sanjeev k
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,w,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No of Rows");
		r=sc.nextInt();
		System.out.println("Enter No of Rows");
		w=sc.nextInt();
		int [][] arr=new int[r][w];
		System.out.println("Enter elemenets of matrix");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<w;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<w;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<w;j++)
			{
				if(i==j)
				{
				sum=sum+arr[i][j];
				}
			}
		}
		System.out.print("Sum is"+" ");
		System.out.println(+sum);
		
		
	
	}

}
