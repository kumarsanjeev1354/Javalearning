import java.util.Scanner;
public class Specificvalue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,c,n,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row");
		r=sc.nextInt();
		System.out.println("Enter no of Columns");
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
		System.out.println("Enter number to find");
		n=sc.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==n)
				{
					System.out.println("Found");
					break;
				}
				/*else
				{
					count++;
				}*/
			}
			
		}
		/*if(count>0)
		{
			System.out.println("NOt Found");
		}*/
	}

}
