import java.util.Scanner;
public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int r,c,sum=0;
		System.out.println("Enter Row");
		r=sc.nextInt();
		System.out.println("Enter Col");
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		System.out.println("Enter the elements of the matrix") ;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
					
		}	
		System.out.println("The elements of the matrix") ;
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
	