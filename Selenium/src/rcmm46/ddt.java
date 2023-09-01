package rcmm46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ddt
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
     FileInputStream fis=new FileInputStream("./exel/Book4.xlsx");
    Workbook book=WorkbookFactory.create(fis);
    Sheet sht =  book.getSheet("Sheet1");
     
     
     
     
     
   
    
	}

}
