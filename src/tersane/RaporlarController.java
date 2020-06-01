/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import tersane.müsteri;
import tersane.rapor;
import tersane.ekipman;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class RaporlarController implements Initializable {

    @FXML
    private Button anasayfa_button;
    @FXML
    private Button projeler_button;
    @FXML
    private Button ekipmanlar_button;
    @FXML
    private Button raporlar_button;
    @FXML
    private Button personeller_button;
   
    @FXML
    private Button müsteriler_button;
    @FXML
    private Button yüzeyler_button;
    @FXML
    private Button rapor_ekle;
     
 
    @FXML
    private ChoiceBox<müsteri> mstr;
    @FXML
    private ChoiceBox<personel> operatör;
    @FXML
    private ChoiceBox<personel> değerlendiren;
    @FXML
    private ChoiceBox<personel> onay;
    @FXML
    private DatePicker tarih;
    
    static String b,c;
    static personel secilen1;
    static personel secilen2;
    static personel secilen3;
    static müsteri müsteri1 ;
    static String secilenOpSeviye;
    static String secilenDeSeviye;
    static String secilenOnSeviye;
    static String secilentarih;
    


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        database.baglan();
       

       
}



        
    
   
    @FXML
    private void show_anasayfa(ActionEvent event) {
         if(event.getSource()== anasayfa_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    private void show_raporlar(ActionEvent event) {
         if(event.getSource()== raporlar_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("raporlar.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
        
    }

    @FXML
    private void show_projeler(ActionEvent event) { 
         if(event.getSource()== projeler_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("projeler.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    private void show_ekipmanlar(ActionEvent event) {
         if(event.getSource()== ekipmanlar_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("ekipmanlar.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

   

 @FXML
    private void show_personeller(ActionEvent event) {
        if(event.getSource()== personeller_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("personeller.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
        
    }


 

    @FXML
    private void show_müsteriler(ActionEvent event) {
        if(event.getSource()== müsteriler_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("müsteriler.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }

    @FXML
    private void show_yüzeyler(ActionEvent event) {
        if(event.getSource()== yüzeyler_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("yüzeyler.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }


    

    @FXML
    private void rapor_e(ActionEvent event) {
        if(event.getSource()== rapor_ekle){
            try{
               secilenCalisan();
               secilenMüsteri();
          
                 Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("yeni_rapor.fxml")));
                stage.setScene(scene);
                stage.show();
                


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
    }
    public void secilenCalisan(){
        secilen1 = operatör.getSelectionModel().getSelectedItem();
      
               
        b = String.valueOf(secilen1.adProperty().get());
        
                
        c = String.valueOf(secilen1.soyadProperty().get());
  

        secilenOpSeviye=database.getSeviye(b,c);
       
        secilen2 = değerlendiren.getSelectionModel().getSelectedItem();
      
        
        b = String.valueOf(secilen2.adProperty().get());
               
        c = String.valueOf(secilen2.soyadProperty().get());
          
        secilenDeSeviye=database.getSeviye(b,c);
        secilen3 = onay.getSelectionModel().getSelectedItem();
  
        
        b = String.valueOf(secilen2.adProperty().get());
       
        c = String.valueOf(secilen2.soyadProperty().get());
      
        secilenOnSeviye=database.getSeviye(b,c);
        
    }
    public void secilenMüsteri(){
        müsteri1 = mstr.getSelectionModel().getSelectedItem();
        
    }
    
         
    database da = new database();
    @FXML
    private void operatorset(MouseEvent event) {
         operatör.setItems(da.choiceCalisan());
    }

    @FXML
    private void degerlendirenset(MouseEvent event) {
        değerlendiren.setItems(da.choiceCalisan());
    }

    @FXML
    private void onayset(MouseEvent event) {
        onay.setItems(da.choiceCalisan());
    }

    @FXML
    private void müsteriset(MouseEvent event) {
        
          
           mstr.setItems(da.secMüsteri());
          
    }

    @FXML
    private void tarihal(ActionEvent event) {
        LocalDate date = tarih.getValue(); 
        secilentarih = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); 
        
     
      
    }
  
   
 

  
  

 
   
   }



