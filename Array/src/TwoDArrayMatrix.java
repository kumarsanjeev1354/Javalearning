//Print 3 by 2 matrix
import java.util.Scanner;
public class TwoDArrayMatrix {
//@author Sanjeev Kumar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r,c,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Rows");
r=sc.nextInt();
System.out.println("Enter Rows");
c=sc.nextInt();
int[][] arr=new int[r][c];
System.out.println("Enter Elements for row");
for(int i=0;i<r;i++)
{
	//System.out.println("Enter column");
	for(int j=0;j<c;j++)
		
	{
		
		arr[i][j]=sc.nextInt();
		//System.out.println("Enter Elements for row");
}
	
	
}

System.out.println("Elements of matrix are");
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		System.out.print(arr[i][j]+"\t");
		
	}
	System.out.println();
}
for(int i=0;i<r;i++)
{
	for(int j=0;j<c;j++)
	{
		if(i==j)
		{
			sum=sum+arr[i][j];
		}
		
	}
	
	
}
System.out.println(+sum);
	}

}
