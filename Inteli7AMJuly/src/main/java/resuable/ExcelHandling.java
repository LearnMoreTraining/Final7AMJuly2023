package resuable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandling {


    public static String readExcel(String sheetName, int row , int column) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/datashet/TestData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(row).getCell(column).getStringCellValue();

    }
}
