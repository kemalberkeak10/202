/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Toshiba
 */
public class Export_Excell {
    public void excell(String musteriAd, String cihazAd, String projeAd,String testYeri,
            String kutupMesafesi, String opAd, 
            String deAd, String onAd,  
            String opSeviye, String deSeviye, 
            String onSeviye) throws IOException  {
        
            FileInputStream inputStream = new FileInputStream(new File("Bericht2_MitKommentaren.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
            XSSFSheet sheet = workbook.getSheetAt(0);
            CellStyle style1 = workbook.createCellStyle();
            style1.setAlignment(HorizontalAlignment.CENTER);
            style1.setVerticalAlignment(VerticalAlignment.CENTER);
            
            XSSFRow row = sheet.getRow(2);
            XSSFCell cell = row.createCell(3);
            cell.setCellValue(musteriAd);
            cell.setCellStyle(style1);
            
            XSSFRow row9 = sheet.getRow(8);
            XSSFCell cell39 = row9.createCell(4);
            cell39.setCellValue(kutupMesafesi);
            cell39.setCellStyle(style1);
           
            XSSFRow row10 = sheet.getRow(9);
            XSSFCell cell310 = row10.createCell(4);
            cell310.setCellValue(cihazAd);
            cell310.setCellStyle(style1);            
            
            XSSFRow row2 = sheet.getRow(3);
            XSSFCell cell2 = row2.createCell(3);
            cell2.setCellValue(projeAd);
            cell2.setCellStyle(style1);
            
            XSSFRow row3 = sheet.getRow(4);
            XSSFCell cell3 = row3.createCell(3);
            cell3.setCellValue(testYeri);            
            cell3.setCellStyle(style1);
            
            XSSFRow row40 = sheet.getRow(39);
            XSSFCell cell6 = row40.createCell(5);
            cell6.setCellValue(opAd);            
            cell6.setCellStyle(style1);
            
            
            XSSFCell cell16 = row40.createCell(15);
            cell16.setCellValue(deAd);            
            cell16.setCellStyle(style1); 
            
          
            XSSFCell cell21 = row40.createCell(20);
            cell21.setCellValue(onAd);            
            cell21.setCellStyle(style1);
            
            XSSFRow row41 = sheet.getRow(40);
            XSSFCell cell641 = row41.createCell(5);
            cell641.setCellValue(opSeviye);            
            cell641.setCellStyle(style1);
            
            XSSFCell cell11541 = row41.createCell(15);
            cell11541.setCellValue(deSeviye);            
            cell11541.setCellStyle(style1);
            
            XSSFCell cell2141 = row41.createCell(20);
            cell2141.setCellValue(onSeviye);            
            cell2141.setCellStyle(style1);
            
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\tersane\\Bericht2_MitKommentaren.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Excel written successfully");

     
    
    }
    
}
