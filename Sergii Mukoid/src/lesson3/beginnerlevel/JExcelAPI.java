package lesson3.beginnerlevel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import jxl.read.biff.BiffException;

import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class JExcelAPI
{
   public void writeToExcel(String fileName, String sheetName, int row, int column, String content) 
      throws BiffException, IOException, WriteException
   {
      WritableWorkbook wworkbook;
      wworkbook = Workbook.createWorkbook(new File(fileName));
      Label label = new Label(row-1, column-1, content);
      //wworkbook.getSheet(0).addCell(label);
      wworkbook.createSheet(sheetName, 0).addCell(label);
      wworkbook.write();
      wworkbook.close();
   }
   
   public void readFromExcel() 
	   throws BiffException, IOException, WriteException
	   {
      Workbook workbook = Workbook.getWorkbook(new File("output.xls"));
      Sheet sheet = workbook.getSheet(0);
      Cell cell1 = sheet.getCell(0, 2);
      System.out.println(cell1.getContents());
      Cell cell2 = sheet.getCell(3, 4);
      System.out.println(cell2.getContents());
      workbook.close();
   }
   
   public static void main(String[] args) {
	   
	   
   }
}