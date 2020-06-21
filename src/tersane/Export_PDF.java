/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.SnapshotParameters;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import tersane.Yeni_raporController;
/**
 *
 * @author Toshiba
 */
public class Export_PDF {
   public void pdf(AnchorPane root,String raporNO) {
    
  
    root.getChildrenUnmodifiable();
        try {
            WritableImage nodeshot = root.snapshot(new SnapshotParameters(), null);
    
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            ImageIO.write(SwingFXUtils.fromFXImage(nodeshot, null), "png", output);
            output.close();
       
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            PDImageXObject pdimage;
            PDPageContentStream content;
     
            pdimage = PDImageXObject.createFromByteArray(doc, output.toByteArray(), "png");
     
            content = new PDPageContentStream(doc, page);
         
           
            PDRectangle box = page.getMediaBox();
            double factor = Math.min(box.getWidth() / nodeshot.getWidth(), box.getHeight() / nodeshot.getHeight());

            float height = (float) (nodeshot.getHeight() * factor);

            
            content.drawImage(pdimage, 0, box.getHeight() - height, (float) (nodeshot.getWidth() * factor), height);

            content.close();
            doc.addPage(page);
         
            File outputFile = new File("C:\\Users\\Toshiba\\Documents\\NetBeansProjects\\tersane\\PDF\\" +raporNO + ".pdf");

            doc.save(outputFile);
            doc.close();
          
            
        } catch (IOException e) {
        }
   }
    }    
    

