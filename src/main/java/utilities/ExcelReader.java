package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelReader {
    public static String readCell(String filePath, int row, int cell) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheetAt(0);
        return sheet.getRow(row).getCell(cell).toString();
    }
}
