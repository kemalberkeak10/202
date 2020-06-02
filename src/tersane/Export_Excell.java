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
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tersane.Yeni_raporController;
/**
 *
 * @author Toshiba
 */
public class Export_Excell {
    public void excell(String musteriAd,String projeAd,String testYeri, String muayeneStandarti, String degerlendirmeStandarti,
            String muayeneProsedürü,String muayeneKapsami,String resimNo,String yüzeyDurumu,String muayeneAsamasi,
            String sayfaNo, String raporNo, String raporTarihi, String isemriNo , String teklifNo,
           String cihazAd, String kutupMesafesi,String tasiyiciOrtam, String miknatislamaTeknigi, String isikSiddeti, String isikMesafesi,
           String muayeneBölgesi , String akimTipi, String luxMetre, String muayeneOrtami, String miknatisGiderimi , String isilIslem,
           String yüzeySicakligi , String muayenebölgesindekialanSiddeti , String surFace , String isikcihaziTanimi , String kaldirmaTesti,
           String standartSapma, String muayeneTarih , String aciklamaveEkler,
           String siraNo1 , String kpNo1 , String kuNo1, String kyNo1, String kal1, String c1, String ht1, String hy1, String s1,
           String siraNo2 ,String kpNo2 , String kuNo2,String kyNo2,String kal2,String c2,String ht2,String hy2,String s2,
           String siraNo3 ,String kpNo3 , String kuNo3,String kyNo3,String kal3,String c3,String ht3,String hy3,String s3,
          String siraNo4 ,String kpNo4 ,String kuNo4,String kyNo4,String kal4,String c4,String ht4,String hy4,String s4,
          String siraNo5 ,String kpNo5 ,String kuNo5,String kyNo5,String kal5,String c5,String ht5,String hy5,String s5,
           String siraNo6 ,String kpNo6 ,String kuNo6,String kyNo6,String kal6,String c6,String ht6,String hy6,String s6,
          String siraNo7 ,String kpNo7 , String kuNo7, String kyNo7, String kal7, String c7, String ht7, String hy7, String s7,
           String siraNo8 ,String kpNo8 ,String kuNo8,String kyNo8,String kal8,String c8,String ht8,String hy8,String s8,
          String siraNo9 ,String kpNo9 ,String kuNo9,String kyNo9,String kal9,String c9,String ht9,String hy9,String s9,
          String siraNo10 ,String kpNo10 ,String kuNo10,String kyNo10,String kal10,String c10,String ht10,String hy10,String s10,
           String siraNo11 ,String kpNo11 ,String kuNo11, String kyNo11, String kal11,String c11,String ht11,String hy11,String s11,
          String siraNo12 ,String kpNo12 ,String kuNo12,String kyNo12,String kal12,String c12,String ht12,String hy12,String s12,
          String siraNo13 , String kpNo13 ,String kuNo13,String kyNo13,String kal13,String c13,String ht13,String hy13,String s13,
          String siraNo14 ,String kpNo14 ,String kuNo14,String kyNo14, String kal14,String c14,String ht14,String hy14,String s14,
           String opAd, String deAd, String onAd, String opSeviye, String deSeviye, String onSeviye, String operatörTarih, String degerlendirenTarih, String onayTarih) 
            throws IOException  {
             String dosyaAd = projeAd;
            FileInputStream inputStream = new FileInputStream(new File("RaporExcell.xlsx"));
            
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream); 
            XSSFSheet sheet = workbook.getSheetAt(0);
            CellStyle style1 = workbook.createCellStyle();
            style1.setAlignment(HorizontalAlignment.CENTER);
            style1.setVerticalAlignment(VerticalAlignment.CENTER);
          /*  style1.setBottomBorderColor(IndexedColors.BLACK.getIndex());
            style1.setLeftBorderColor(IndexedColors.BLACK.getIndex());
            style1.setRightBorderColor(IndexedColors.BLACK.getIndex());
            style1.setTopBorderColor(IndexedColors.BLACK.getIndex()); */
            style1.setBorderTop(BorderStyle.THIN);
            style1.setBorderBottom(BorderStyle.THIN);
            style1.setBorderLeft(BorderStyle.THIN);
            style1.setBorderRight(BorderStyle.THIN);
            
          
            
            XSSFRow row = sheet.getRow(2); //ÜST SOL
            XSSFCell cell = row.createCell(3);
            cell.setCellValue(musteriAd);
            cell.setCellStyle(style1);
          
            XSSFRow row2 = sheet.getRow(3);
            XSSFCell cell2 = row2.createCell(3);
            cell2.setCellValue(projeAd);
            cell2.setCellStyle(style1);
            
            XSSFRow row3 = sheet.getRow(4);
            XSSFCell cell3 = row3.createCell(3);
            cell3.setCellValue(testYeri);            
            cell3.setCellStyle(style1);
            
            XSSFRow row4 = sheet.getRow(5);
            XSSFCell cell4 = row4.createCell(3);
            cell4.setCellValue(muayeneStandarti);            
            cell4.setCellStyle(style1);
            
            XSSFRow row5 = sheet.getRow(6);
            XSSFCell cell5 = row5.createCell(3);
            cell5.setCellValue(degerlendirmeStandarti);            
            cell5.setCellStyle(style1);
            
             //*********************************ÜST ORTA
            XSSFCell cell6 = row.createCell(19);
            cell6.setCellValue(muayeneProsedürü);
            cell6.setCellStyle(style1);
          
            
            XSSFCell cell7 = row2.createCell(19);
            cell7.setCellValue(muayeneKapsami);
            cell7.setCellStyle(style1);
            
           
            XSSFCell cell8 = row3.createCell(19);
            cell8.setCellValue(resimNo);            
            cell8.setCellStyle(style1);
            
           
            XSSFCell cell9 = row4.createCell(19);
            cell9.setCellValue(yüzeyDurumu);            
            cell9.setCellStyle(style1);
            
           
            XSSFCell cell10 = row5.createCell(19);
            cell10.setCellValue(muayeneAsamasi);            
            cell10.setCellStyle(style1);
             
             //*************ÜST SAĞ
            
             XSSFCell cell11 = row.createCell(26);
            cell11.setCellValue(sayfaNo);
            cell11.setCellStyle(style1);
          
            
            XSSFCell cell12 = row2.createCell(26);
            cell12.setCellValue(raporNo);
            cell12.setCellStyle(style1);
            
           
            XSSFCell cell13 = row3.createCell(26);
            cell13.setCellValue(raporTarihi);            
            cell13.setCellStyle(style1);
            
           
            XSSFCell cell14 = row4.createCell(26);
            cell14.setCellValue(isemriNo);            
            cell14.setCellStyle(style1);
            
           
            XSSFCell cell15 = row5.createCell(26);
            cell15.setCellValue(teklifNo);            
            cell15.setCellStyle(style1);
            
              //EKİPMANLAR
            XSSFRow row9 = sheet.getRow(8);   //Ekipmanlar
            XSSFCell celle1 = row9.createCell(4);
            celle1.setCellValue(kutupMesafesi);
            celle1.setCellStyle(style1);
           
            XSSFRow row10 = sheet.getRow(9);
            XSSFCell celle2 = row10.createCell(4);
            celle2.setCellValue(cihazAd);
            celle2.setCellStyle(style1); 
            
            XSSFRow row11 = sheet.getRow(10);
            XSSFCell celle3 = row11.createCell(4);
            celle3.setCellValue(tasiyiciOrtam);
            celle3.setCellStyle(style1);
            
            XSSFRow row12 = sheet.getRow(11);
            XSSFCell celle4 = row12.createCell(4);
            celle4.setCellValue(miknatislamaTeknigi);
            celle4.setCellStyle(style1);
            
            XSSFRow row13 = sheet.getRow(12);
            XSSFCell celle5 = row13.createCell(4);
            celle5.setCellValue(isikSiddeti);
            celle5.setCellStyle(style1);
            
            XSSFRow row14 = sheet.getRow(13);
            XSSFCell celle6 = row14.createCell(4);
            celle6.setCellValue(isikMesafesi);
            celle6.setCellStyle(style1);
             // EKİPMANLAR ORTA
             
             
            XSSFCell celle7 = row9.createCell(16);
            celle7.setCellValue(muayeneBölgesi);
            celle7.setCellStyle(style1);
           
            
            XSSFCell celle8 = row10.createCell(16);
            celle8.setCellValue(akimTipi);
            celle8.setCellStyle(style1); 
            
            
            XSSFCell celle9 = row11.createCell(16);
            celle9.setCellValue(luxMetre);
            celle9.setCellStyle(style1);
            
            
            XSSFCell celle10 = row12.createCell(16);
            celle10.setCellValue(muayeneOrtami);
            celle10.setCellStyle(style1);
            
            
            XSSFCell celle11 = row13.createCell(16);
            celle11.setCellValue(miknatisGiderimi);
            celle11.setCellStyle(style1);
            

            XSSFCell celle12 = row14.createCell(16);
            celle12.setCellValue(isilIslem);
            celle12.setCellStyle(style1);
            
             /// EKİPMANLAR SAĞ
             XSSFCell celle13 = row9.createCell(25);
            celle13.setCellValue(yüzeySicakligi);
            celle13.setCellStyle(style1);
           

            XSSFCell celle14 = row10.createCell(25);
            celle14.setCellValue(muayenebölgesindekialanSiddeti);
            celle14.setCellStyle(style1); 
            
            
            XSSFCell celle15 = row12.createCell(25);
            celle15.setCellValue(surFace);
            celle15.setCellStyle(style1);
            
            
            XSSFCell celle16 = row13.createCell(25);
            celle16.setCellValue(isikcihaziTanimi);
            celle16.setCellStyle(style1);
         
            XSSFCell celle18 = row14.createCell(25);
            celle18.setCellValue(kaldirmaTesti);
            celle18.setCellStyle(style1);
            ////Standart sapma
            XSSFRow row20 = sheet.getRow(19);
            XSSFCell cells1 = row20.createCell(7);
            cells1.setCellValue(standartSapma);
            cells1.setCellStyle(style1);
          
            XSSFRow row21 = sheet.getRow(20);
            XSSFCell cells2 = row21.createCell(7);
            cells2.setCellValue(muayeneTarih);            
            cells2.setCellStyle(style1);
            
            XSSFRow row22 = sheet.getRow(21);
            XSSFCell cells3 = row22.createCell(7);
            cells3.setCellValue(aciklamaveEkler);            
            cells3.setCellStyle(style1);
            //MUAYENE SONUCLARI
            XSSFRow row25 = sheet.getRow(24);
            XSSFRow row26 = sheet.getRow(25);
            XSSFRow row27 = sheet.getRow(26);
            XSSFRow row28 = sheet.getRow(27);
            XSSFRow row29 = sheet.getRow(28);
            XSSFRow row30 = sheet.getRow(29);
            XSSFRow row31 = sheet.getRow(30);
            XSSFRow row32 = sheet.getRow(31);
            XSSFRow row33 = sheet.getRow(32);
            XSSFRow row34 = sheet.getRow(33);
            XSSFRow row35 = sheet.getRow(34);
            XSSFRow row36 = sheet.getRow(35);
            XSSFRow row37 = sheet.getRow(36);
            XSSFRow row38 = sheet.getRow(37);
            
            
            XSSFCell cell1a = row25.createCell(0);
            cell1a.setCellValue(siraNo1);            
            cell1a.setCellStyle(style1);
            
            XSSFCell cell2a = row25.createCell(1);
            cell2a.setCellValue(kpNo1);            
            cell2a.setCellStyle(style1);
            
            XSSFCell cell3a = row25.createCell(8);
            cell3a.setCellValue(kuNo1);            
            cell3a.setCellStyle(style1);
            
            XSSFCell cell4a = row25.createCell(11);
            cell4a.setCellValue(kyNo1);            
            cell4a.setCellStyle(style1);
            
            XSSFCell cell5a = row25.createCell(17);
            cell5a.setCellValue(kal1);            
            cell5a.setCellStyle(style1);
            
            XSSFCell cell6a = row25.createCell(18);
            cell6a.setCellValue(c1);            
            cell6a.setCellStyle(style1);
            
            XSSFCell cell7a = row25.createCell(22);
            cell7a.setCellValue(ht1);            
            cell7a.setCellStyle(style1);
            
            XSSFCell cell8a = row25.createCell(24);
            cell8a.setCellValue(hy1);            
            cell8a.setCellStyle(style1);
            
            XSSFCell cell9a = row25.createCell(27);
            cell9a.setCellValue(s1);            
            cell9a.setCellStyle(style1);
            
            XSSFCell cell1b = row26.createCell(0);
            cell1b.setCellValue(siraNo2);            
            cell1b.setCellStyle(style1);
            
            XSSFCell cell2b = row26.createCell(1);
            cell2b.setCellValue(kpNo2);            
            cell2b.setCellStyle(style1);
            
            XSSFCell cell3b = row26.createCell(8);
            cell3b.setCellValue(kuNo2);            
            cell3b.setCellStyle(style1);
            
            XSSFCell cell4b = row26.createCell(11);
            cell4b.setCellValue(kyNo2);            
            cell4b.setCellStyle(style1);
            
            XSSFCell cell5b = row26.createCell(17);
            cell5b.setCellValue(kal2);            
            cell5b.setCellStyle(style1);
            
            XSSFCell cell6b = row26.createCell(18);
            cell6b.setCellValue(c2);            
            cell6b.setCellStyle(style1);
            
            XSSFCell cell7b = row26.createCell(22);
            cell7b.setCellValue(ht2);            
            cell7b.setCellStyle(style1);
            
            XSSFCell cell8b = row26.createCell(24);
            cell8b.setCellValue(hy2);            
            cell8b.setCellStyle(style1);
            
            XSSFCell cell9b = row26.createCell(27);
            cell9b.setCellValue(s2);            
            cell9b.setCellStyle(style1);
            
            XSSFCell cell1c = row27.createCell(0);
            cell1c.setCellValue(siraNo3);            
            cell1c.setCellStyle(style1);
            
            XSSFCell cell2c = row27.createCell(1);
            cell2c.setCellValue(kpNo3);            
            cell2c.setCellStyle(style1);
            
            XSSFCell cell3c = row27.createCell(8);
            cell3c.setCellValue(kuNo3);            
            cell3c.setCellStyle(style1);
            
            XSSFCell cell4c = row27.createCell(11);
            cell4c.setCellValue(kyNo3);            
            cell4c.setCellStyle(style1);
            
            XSSFCell cell5c = row27.createCell(17);
            cell5c.setCellValue(kal3);            
            cell5c.setCellStyle(style1);
            
            XSSFCell cell6c = row27.createCell(18);
            cell6c.setCellValue(c3);            
            cell6c.setCellStyle(style1);
            
            XSSFCell cell7c = row27.createCell(22);
            cell7c.setCellValue(ht3);            
            cell7c.setCellStyle(style1);
            
            XSSFCell cell8c = row27.createCell(24);
            cell8c.setCellValue(hy3);            
            cell8c.setCellStyle(style1);
            
            XSSFCell cell9c = row27.createCell(27);
            cell9c.setCellValue(s3);            
            cell9c.setCellStyle(style1);
            
            XSSFCell cell1d = row28.createCell(0);
            cell1d.setCellValue(siraNo4);            
            cell1d.setCellStyle(style1);
            
            XSSFCell cell2d = row28.createCell(1);
            cell2d.setCellValue(kpNo4);            
            cell2d.setCellStyle(style1);
            
            XSSFCell cell3d = row28.createCell(8);
            cell3d.setCellValue(kuNo4);            
            cell3d.setCellStyle(style1);
            
            XSSFCell cell4d = row28.createCell(11);
            cell4d.setCellValue(kyNo4);            
            cell4d.setCellStyle(style1);
            
            XSSFCell cell5d = row28.createCell(17);
            cell5d.setCellValue(kal4);            
            cell5d.setCellStyle(style1);
            
            XSSFCell cell6d = row28.createCell(18);
            cell6d.setCellValue(c4);            
            cell6d.setCellStyle(style1);
            
            XSSFCell cell7d = row28.createCell(22);
            cell7d.setCellValue(ht4);            
            cell7d.setCellStyle(style1);
            
            XSSFCell cell8d = row28.createCell(24);
            cell8d.setCellValue(hy4);            
            cell8d.setCellStyle(style1);
            
            XSSFCell cell9d = row28.createCell(27);
            cell9d.setCellValue(s4);            
            cell9d.setCellStyle(style1);
            
            XSSFCell cell1e = row29.createCell(0);
            cell1e.setCellValue(siraNo5);            
            cell1e.setCellStyle(style1);
            
            XSSFCell cell2e = row29.createCell(1);
            cell2e.setCellValue(kpNo5);            
            cell2e.setCellStyle(style1);
            
            XSSFCell cell3e = row29.createCell(8);
            cell3e.setCellValue(kuNo5);            
            cell3e.setCellStyle(style1);
            
            XSSFCell cell4e = row29.createCell(11);
            cell4e.setCellValue(kyNo5);            
            cell4e.setCellStyle(style1);
            
            XSSFCell cell5e = row29.createCell(17);
            cell5e.setCellValue(kal5);            
            cell5e.setCellStyle(style1);
            
            XSSFCell cell6e = row29.createCell(18);
            cell6e.setCellValue(c5);            
            cell6e.setCellStyle(style1);
            
            XSSFCell cell7e = row29.createCell(22);
            cell7e.setCellValue(ht5);            
            cell7e.setCellStyle(style1);
            
            XSSFCell cell8e = row29.createCell(24);
            cell8e.setCellValue(hy5);            
            cell8e.setCellStyle(style1);
            
            XSSFCell cell9e = row29.createCell(27);
            cell9e.setCellValue(s5);            
            cell9e.setCellStyle(style1);
            
            XSSFCell cell1f = row30.createCell(0);
            cell1f.setCellValue(siraNo6);            
            cell1f.setCellStyle(style1);
            
            XSSFCell cell2f = row30.createCell(1);
            cell2f.setCellValue(kpNo6);            
            cell2f.setCellStyle(style1);
            
            XSSFCell cell3f = row30.createCell(8);
            cell3f.setCellValue(kuNo6);            
            cell3f.setCellStyle(style1);
            
            XSSFCell cell4f = row30.createCell(11);
            cell4f.setCellValue(kyNo6);            
            cell4f.setCellStyle(style1);
            
            XSSFCell cell5f = row30.createCell(17);
            cell5f.setCellValue(kal6);            
            cell5f.setCellStyle(style1);
            
            XSSFCell cell6f = row30.createCell(18);
            cell6f.setCellValue(c6);            
            cell6f.setCellStyle(style1);
            
            XSSFCell cell7f = row30.createCell(22);
            cell7f.setCellValue(ht6);            
            cell7f.setCellStyle(style1);
            
            XSSFCell cell8f= row30.createCell(24);
            cell8f.setCellValue(hy6);            
            cell8f.setCellStyle(style1);
            
            XSSFCell cell9f = row30.createCell(27);
            cell9f.setCellValue(s6);            
            cell9f.setCellStyle(style1);
            
            XSSFCell cell1g = row31.createCell(0);
            cell1g.setCellValue(siraNo7);            
            cell1g.setCellStyle(style1);
            
            XSSFCell cell2g = row31.createCell(1);
            cell2g.setCellValue(kpNo7);            
            cell2g.setCellStyle(style1);
            
            XSSFCell cell3g = row31.createCell(8);
            cell3g.setCellValue(kuNo7);            
            cell3g.setCellStyle(style1);
            
            XSSFCell cell4g = row31.createCell(11);
            cell4g.setCellValue(kyNo7);            
            cell4g.setCellStyle(style1);
            
            XSSFCell cell5g = row31.createCell(17);
            cell5g.setCellValue(kal7);            
            cell5g.setCellStyle(style1);
            
            XSSFCell cell6g = row31.createCell(18);
            cell6g.setCellValue(c7);            
            cell6g.setCellStyle(style1);
            
            XSSFCell cell7g = row31.createCell(22);
            cell7g.setCellValue(ht7);            
            cell7g.setCellStyle(style1);
            
            XSSFCell cell8g = row31.createCell(24);
            cell8g.setCellValue(hy7);            
            cell8g.setCellStyle(style1);
            
            XSSFCell cell9g = row31.createCell(27);
            cell9g.setCellValue(s7);            
            cell9g.setCellStyle(style1);
            
            XSSFCell cell1h = row32.createCell(0);
            cell1h.setCellValue(siraNo8);            
            cell1h.setCellStyle(style1);
            
            XSSFCell cell2h = row32.createCell(1);
            cell2h.setCellValue(kpNo8);            
            cell2h.setCellStyle(style1);
            
            XSSFCell cell3h = row32.createCell(8);
            cell3h.setCellValue(kuNo8);            
            cell3h.setCellStyle(style1);
            
            XSSFCell cell4h = row32.createCell(11);
            cell4h.setCellValue(kyNo8);            
            cell4h.setCellStyle(style1);
            
            XSSFCell cell5h = row32.createCell(17);
            cell5h.setCellValue(kal8);            
            cell5h.setCellStyle(style1);
            
            XSSFCell cell6h = row32.createCell(18);
            cell6h.setCellValue(c8);            
            cell6h.setCellStyle(style1);
            
            XSSFCell cell7h = row32.createCell(22);
            cell7h.setCellValue(ht8);            
            cell7h.setCellStyle(style1);
            
            XSSFCell cell8h = row32.createCell(24);
            cell8h.setCellValue(hy8);            
            cell8h.setCellStyle(style1);
            
            XSSFCell cell9h = row32.createCell(27);
            cell9h.setCellValue(s8);            
            cell9h.setCellStyle(style1);
            
            XSSFCell cell1i = row33.createCell(0);
            cell1i.setCellValue(siraNo9);            
            cell1i.setCellStyle(style1);
            
            XSSFCell cell2i = row33.createCell(1);
            cell2i.setCellValue(kpNo9);            
            cell2i.setCellStyle(style1);
            
            XSSFCell cell3i = row33.createCell(8);
            cell3i.setCellValue(kuNo9);            
            cell3i.setCellStyle(style1);
            
            XSSFCell cell4i = row33.createCell(11);
            cell4i.setCellValue(kyNo9);            
            cell4i.setCellStyle(style1);
            
            XSSFCell cell5i = row33.createCell(17);
            cell5i.setCellValue(kal9);            
            cell5i.setCellStyle(style1);
            
            XSSFCell cell6i = row33.createCell(18);
            cell6i.setCellValue(c9);            
            cell6i.setCellStyle(style1);
            
            XSSFCell cell7i = row33.createCell(22);
            cell7i.setCellValue(ht9);            
            cell7i.setCellStyle(style1);
            
            XSSFCell cell8i = row33.createCell(24);
            cell8i.setCellValue(hy9);            
            cell8i.setCellStyle(style1);
            
            XSSFCell cell9i = row33.createCell(27);
            cell9i.setCellValue(s9);            
            cell9i.setCellStyle(style1);
            
            XSSFCell cell1j = row34.createCell(0);
            cell1j.setCellValue(siraNo10);            
            cell1j.setCellStyle(style1);
            
            XSSFCell cell2j = row34.createCell(1);
            cell2j.setCellValue(kpNo10);            
            cell2j.setCellStyle(style1);
            
            XSSFCell cell3j = row34.createCell(8);
            cell3j.setCellValue(kuNo10);            
            cell3j.setCellStyle(style1);
            
            XSSFCell cell4j = row34.createCell(11);
            cell4j.setCellValue(kyNo10);            
            cell4j.setCellStyle(style1);
            
            XSSFCell cell5j = row34.createCell(17);
            cell5j.setCellValue(kal10);            
            cell5j.setCellStyle(style1);
            
            XSSFCell cell6j = row34.createCell(18);
            cell6j.setCellValue(c10);            
            cell6j.setCellStyle(style1);
            
            XSSFCell cell7j = row34.createCell(22);
            cell7j.setCellValue(ht10);            
            cell7j.setCellStyle(style1);
            
            XSSFCell cell8j = row34.createCell(24);
            cell8j.setCellValue(hy10);            
            cell8j.setCellStyle(style1);
            
            XSSFCell cell9j = row34.createCell(27);
            cell9j.setCellValue(s10);            
            cell9j.setCellStyle(style1);
            
            XSSFCell cell1k = row35.createCell(0);
            cell1k.setCellValue(siraNo11);            
            cell1k.setCellStyle(style1);
            
            XSSFCell cell2k = row35.createCell(1);
            cell2k.setCellValue(kpNo11);            
            cell2k.setCellStyle(style1);
            
            XSSFCell cell3k = row35.createCell(8);
            cell3k.setCellValue(kuNo11);            
            cell3k.setCellStyle(style1);
            
            XSSFCell cell4k = row35.createCell(11);
            cell4k.setCellValue(kyNo11);            
            cell4k.setCellStyle(style1);
            
            XSSFCell cell5k = row35.createCell(17);
            cell5k.setCellValue(kal11);            
            cell5k.setCellStyle(style1);
            
            XSSFCell cell6k = row35.createCell(18);
            cell6k.setCellValue(c11);            
            cell6k.setCellStyle(style1);
            
            XSSFCell cell7k = row35.createCell(22);
            cell7k.setCellValue(ht11);            
            cell7k.setCellStyle(style1);
            
            XSSFCell cell8k = row35.createCell(24);
            cell8k.setCellValue(hy11);            
            cell8k.setCellStyle(style1);
            
            XSSFCell cell9k = row35.createCell(27);
            cell9k.setCellValue(s11);            
            cell9k.setCellStyle(style1);
            
            XSSFCell cell1l = row35.createCell(0);
            cell1l.setCellValue(siraNo12);            
            cell1l.setCellStyle(style1);
            
            XSSFCell cell2l = row36.createCell(1);
            cell2l.setCellValue(kpNo12);            
            cell2l.setCellStyle(style1);
            
            XSSFCell cell3l = row36.createCell(8);
            cell3l.setCellValue(kuNo12);            
            cell3l.setCellStyle(style1);
            
            XSSFCell cell4l = row36.createCell(11);
            cell4l.setCellValue(kyNo12);            
            cell4l.setCellStyle(style1);
            
            XSSFCell cell5l = row36.createCell(17);
            cell5l.setCellValue(kal12);            
            cell5l.setCellStyle(style1);
            
            XSSFCell cell6l = row36.createCell(18);
            cell6l.setCellValue(c12);            
            cell6l.setCellStyle(style1);
            
            XSSFCell cell7l = row36.createCell(22);
            cell7l.setCellValue(ht12);            
            cell7l.setCellStyle(style1);
            
            XSSFCell cell8l = row36.createCell(24);
            cell8l.setCellValue(hy12);            
            cell8l.setCellStyle(style1);
           
            XSSFCell cell9l = row36.createCell(27);
            cell9l.setCellValue(s12);            
            cell9l.setCellStyle(style1);
            
            XSSFCell cell1m = row37.createCell(0);
            cell1m.setCellValue(siraNo13);            
            cell1m.setCellStyle(style1);
            
            XSSFCell cell2m = row37.createCell(1);
            cell2m.setCellValue(kpNo13);            
            cell2m.setCellStyle(style1);
            
            XSSFCell cell3m = row37.createCell(8);
            cell3m.setCellValue(kuNo13);            
            cell3m.setCellStyle(style1);
            
            XSSFCell cell4m = row37.createCell(11);
            cell4m.setCellValue(kyNo13);            
            cell4m.setCellStyle(style1);
            
            XSSFCell cell5m = row37.createCell(17);
            cell5m.setCellValue(kal13);            
            cell5m.setCellStyle(style1);
            
            XSSFCell cell6m = row37.createCell(18);
            cell6m.setCellValue(c13);            
            cell6m.setCellStyle(style1);
            
            XSSFCell cell7m = row37.createCell(22);
            cell7m.setCellValue(ht13);            
            cell7m.setCellStyle(style1);
            
            XSSFCell cell8m = row37.createCell(24);
            cell8m.setCellValue(hy13);            
            cell8m.setCellStyle(style1);
            
            XSSFCell cell9m = row37.createCell(27);
            cell9m.setCellValue(s13);            
            cell9m.setCellStyle(style1);
            
            XSSFCell cell1n = row38.createCell(0);
            cell1n.setCellValue(siraNo14);            
            cell1n.setCellStyle(style1);
            
            XSSFCell cell2n = row38.createCell(1);
            cell2n.setCellValue(kpNo14);            
            cell2n.setCellStyle(style1);
            
            XSSFCell cell3n = row38.createCell(8);
            cell3n.setCellValue(kuNo14);            
            cell3n.setCellStyle(style1);
            
            XSSFCell cell4n = row38.createCell(11);
            cell4n.setCellValue(kyNo14);            
            cell4n.setCellStyle(style1);
            
            XSSFCell cell5n = row38.createCell(17);
            cell5n.setCellValue(kal14);            
            cell5n.setCellStyle(style1);
            
            XSSFCell cell6n = row38.createCell(18);
            cell6n.setCellValue(c14);            
            cell6n.setCellStyle(style1);
            
            XSSFCell cell7n = row38.createCell(22);
            cell7n.setCellValue(ht14);            
            cell7n.setCellStyle(style1);
            
            XSSFCell cell8n = row38.createCell(24);
            cell8n.setCellValue(hy14);            
            cell8n.setCellStyle(style1);
            
            XSSFCell cell9n = row38.createCell(27);
            cell9n.setCellValue(s14);            
            cell9n.setCellStyle(style1);
               //PERSONEL BİLGİLERİ
             
            
            XSSFRow row40 = sheet.getRow(39);
            XSSFCell cell640 = row40.createCell(5);
            cell640.setCellValue(opAd);            
            cell640.setCellStyle(style1);
            
            
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
            
            XSSFCell cell11641 = row41.createCell(15);
            cell11641.setCellValue(deSeviye);            
            cell11641.setCellStyle(style1);
            
            XSSFCell cell2141 = row41.createCell(20);
            cell2141.setCellValue(onSeviye);            
            cell2141.setCellStyle(style1);
            
            XSSFRow row42 = sheet.getRow(41);
            XSSFCell cell642 = row42.createCell(5);
            cell642.setCellValue(operatörTarih);            
            cell642.setCellStyle(style1);
            
            XSSFCell cell1642 = row42.createCell(15);
            cell1642.setCellValue(degerlendirenTarih);            
            cell1642.setCellStyle(style1);
            
            XSSFCell cell2142 = row42.createCell(20);
            cell2142.setCellValue(onayTarih);            
            cell2142.setCellStyle(style1);
           
            
            inputStream.close();
 
            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\tersane\\"+raporNo+".xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println("Excel written successfully");

     
    
    }
    
}
