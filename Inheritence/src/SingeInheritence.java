import java.util.Scanner;
class Shape1
{
	int length,breadth;
	public void set_data(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Rectangle1 extends Shape
{
	int area,perimeter;
	public void area(int a,int p)
	{
		area=a;
		perimeter=p;
	}
	public void display()
	{
		System.out.println("Length of Rectangle is:"+length);
		System.out.println("Breadth of Rectangle is:"+breadth);
		System.out.println("Area of Rectangle is:"+area);
		System.out.println("Perimeter of Rectangle is:"+perimeter);
	}
}
public class SingeInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 obj=new Rectangle1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		obj.length=sc.nextInt();
		System.out.println("Enter Breadth");
		obj.breadth=sc.nextInt();
		obj.area=obj.length+obj.breadth;
		obj.perimeter=2*(obj.length+obj.breadth);
		obj.display();
	}

}
