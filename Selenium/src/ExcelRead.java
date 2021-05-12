import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//@Author Sanjeev Kumar
public class ExcelRead {

	String uname;
	public void getdata() throws IOException
	{
		//Created object for File Input Stream
		FileInputStream  fs=new FileInputStream("E:\\Automation\\Selenium\\Test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fs);
		XSSFSheet sheet=wb.getSheet("Test");
		System.out.println(""+sheet.getLastRowNum());
		XSSFRow row=sheet.getRow(2);
		XSSFCell cl=row.getCell(0);
		uname=cl.getStringCellValue();
		System.out.println("Name is:"+ uname);

	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead er=new ExcelRead();
		er.getdata();
	}

}

