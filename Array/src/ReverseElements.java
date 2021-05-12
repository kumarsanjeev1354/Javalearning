import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//@Author Sanjeev Kumar
public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> I=new ArrayList<String>();
		I.add("Test1");
		I.add("Test2");
		I.add("Test3");
		I.add("Test4");
		I.add("Test5");
		I.add("Test6");

		System.out.println("Array List before Reverse is");
		System.out.println(I.toString());
		Collections.reverse(I);
		System.out.println("Array List After Reverse is");
		System.out.println(I);


	}

}

