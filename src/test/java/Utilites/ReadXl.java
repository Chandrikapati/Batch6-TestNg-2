package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXl {
	
	
	 public static String ReadXlData(String sheetName, int r, int c) throws IOException {

	        File F = new File(FilePath.XLPath);
	        FileInputStream fi;
	         String value ="";

	                fi = new FileInputStream(F);
	                Workbook w = new XSSFWorkbook(fi);
	                 Sheet s = w.getSheet(sheetName);
	                Row row = s.getRow(r);
	                Cell cell = row.getCell(c);

	                int cellType = cell.getCellType();
	                //cell is String
	                if (cellType==1){
	                   value = cell.getStringCellValue();
	                   //cell is data
	                }else if(DateUtil.isCellDateFormatted(cell)) {
	                    Date d = cell.getDateCellValue();
	                    SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyy");
	                    value = sim.format(d);
	                }else{
	                    double d = cell.getNumericCellValue();
	                    //type casting
	                    long l = (long) d;
	                    value = String.valueOf(l);
	                }

	        return value;
	    }

}
