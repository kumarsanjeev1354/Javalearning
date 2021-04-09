import java.util.Scanner;
class Shape
{
	int length,breadth;
	public void set_data(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Rectangle extends Shape
{
	int area,perimeter;
	public void area(int a,int p)
	{
		area=a;
		perimeter=p;
	}
}
class Print extends Rectangle
{
	public void display()
	{
		System.out.println("Length of Rectangle is:"+length);
		System.out.println("Breadth of Rectangle is:"+breadth);
		System.out.println("Area of Rectangle is:"+area);
		System.out.println("Perimeter of Rectangle is:"+perimeter);

	}
}
public class MultiLevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print obj=new Print();
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
