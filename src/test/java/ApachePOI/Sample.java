package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Sample {

	public static void main(String[] args) throws IOException {
		String excelFilePath = System.getProperty("user.dir") + "\\Files\\DataProvider.xlsx";
		File excelFile = new File(excelFilePath);
		FileInputStream fis = new FileInputStream(excelFile);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("employees");
		
		
		/*
		 * Iterator<Row> rows = sheet.iterator(); while (rows.hasNext()) { Row row =
		 * rows.next(); Iterator<Cell> cells = row.iterator();
		 * 
		 * while(cells.hasNext()) { Cell cell = cells.next(); Cell Type cellType =
		 * cell.getCellType();
		 * 
		 * switch (cellType) {
		 * 
		 * case STRING: System.out.print(cell.getStringCellValue()); break; case
		 * NUMERIC: System.out.print((cell.getNumericCellValue()); break; case BOOLEAN:
		 * System.out.print(cell.getBooleanCellValue()); break; }
		 * 
		 * } }
		 */

		System.out.println(sheet.getLastRowNum()); // 4 rows so 3 is the index count
		System.out.println(sheet.getPhysicalNumberOfRows()); // 4 rows

		int rows = sheet.getPhysicalNumberOfRows();
		int cols = sheet.getRow(0).getLastCellNum();

		/*for (int r = 0; r < rows; r++) {

			XSSFRow row = sheet.getRow(r);

			for (int c = 0; c < cols; c++) {

				XSSFCell cell = row.getCell(c);

				CellType cellType = cell.getCellType();

				switch (cellType) {

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		workbook.close();
	}*/

}
}
