import java.util.Scanner;
public class Rectangle {
int length,breadth,area,perimeter;
void getdata(int l,int b,int a,int p)
{
	length=l;
	breadth=b;
	area=a;
	perimeter=p;
}
void display()
{
	System.out.println("Length of Rectaangle is:" +" "+length);
	System.out.println("Breadth of Rectaangle is:" +" "+breadth);
	System.out.println("Area of Rectaangle is:" +" "+area);
	System.out.println("Perimeter of Rectaangle is:" +" "+perimeter);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lenght of Rectangle");
		int l=sc.nextInt();
		System.out.println("Enter Lenght of Breadth");
		int b=sc.nextInt();
		int a=l*b;
		int p=2*(l+b);
		obj.getdata(l, b, a, p);
		obj.display();
	}

}
