package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class ExcelDataConfig2 {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
		
	//"C:\\ExcelData\\TestData.xlsx"
	public ExcelDataConfig2(String excelPath)
	{
		
		try {
			File src = new File(excelPath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
				
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getData(int sheetNumber, int row, int column)
	{
		sheet1 = wb.getSheetAt(sheetNumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
			
	}
	
	public String readXL(String TC, String fieldName)
	{
		int XLSheetIndex=0;
		sheet1 = wb.getSheetAt(XLSheetIndex);
		int maxCol= sheet1.getRow(0).getLastCellNum();
		int maxRow=	sheet1.getLastRowNum();	
		int irow = 0,icol = 0,ithRow = 0,ithCol = 0;			
		//System.out.println("Col width:"+maxCol);
		//System.out.println("Row width:"+maxRow);

		
		for(irow=1; irow<=maxRow; irow++)
		{
			String datarow=sheet1.getRow(irow).getCell(0).getStringCellValue();
			//System.out.println("Rows : " + datarow);
			if(datarow.equalsIgnoreCase(TC))
			{
				ithRow=irow;
				//System.out.println("ithRow : " + ithRow);
				break;
			}
		}
		
		for(icol=0; icol<maxCol; icol++)
		{
			String datacol=sheet1.getRow(0).getCell(icol).getStringCellValue();
			//System.out.println("Cols : " + datacol);
			if(datacol.equalsIgnoreCase(fieldName))
			{
				ithCol=icol;
				//System.out.println("ithCol : " + ithCol);
				break;
			}
		}
		
		String cellVal=getData(XLSheetIndex, ithRow, ithCol);
		return cellVal;
	}

}
