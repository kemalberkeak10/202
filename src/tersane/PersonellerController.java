/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import static tersane.database.con;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class PersonellerController implements Initializable {

    @FXML
    private Button anasayfa_button;
    
    @FXML
    private Button ekipmanlar_button;
    
    @FXML
    private Button müsteriler_button;
    @FXML
    private Button projeler_button;
    @FXML
    private Button personeller_button;
    @FXML
    private TextField persid;
    @FXML
    private TextField persad;
    @FXML
    private TextField perssoy;
    @FXML
    private TextField perlev;
    @FXML
    private Button personel_ekle;
    @FXML
    private Button personel_sil;
    @FXML
    private TableView<personel> personeller_table;
    @FXML
    private TableColumn<personel, String> pers_ID;
    @FXML
    private TableColumn<personel, String> pers_AD;
    @FXML
    private TableColumn<personel, String> pers_SOYAD;
    @FXML
    private TableColumn<personel, String> pers_LEVEL;
    @FXML
    private Button personel_düzenle;
    private ObservableList<personel>data;
    @FXML
    private Button personel_göster;
    @FXML
    private Button yüzeyler_button;
    @FXML
    private Button raporlar_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
       
            database.baglan();
            tablo();
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
    private void personel_ekle(ActionEvent event) {
         String id=persid.getText();
            String ad=persad.getText();
            String soyad=perssoy.getText();
            String seviye=perlev.getText();
           
       
 
      
        if(persid.getText().isEmpty() || persad.getText().isEmpty() || perssoy.getText().isEmpty() ){
             if(persid.getText().isEmpty()){
              System.out.println("ID Boş Bırakılamaz");
          } 
            if(persad.getText().isEmpty()){
              System.out.println("AD Boş Bırakılamaz");
          } 
             if(perssoy.getText().isEmpty() ){
              System.out.println("SOYAD Boş Bırakılamaz");
        }  
        }
        else{
              database.preparedCalisanlariEkle(id, ad, soyad, seviye);
              tablo();
        }



       }
    @FXML
    private void personel_sil(ActionEvent event) {
            String id=persid.getText();
            
          database.preparedCalisanlariSil(id);
          tablo();
    }

    @FXML
    private void personel_düzenle(ActionEvent event) {
             String ad=persad.getText();
        String soyad=perssoy.getText();
        String id=persid.getText();
        String level = perlev.getText();
        database.preparedCalisanlariGüncelle( ad, soyad,level,id);
        tablo();
    }

    @FXML
    private void personel_göster(ActionEvent event) {
        try {
            database.baglan();
            data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM personel");
            while(rs.next()) {
                
                data.add(new personel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonellerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        pers_ID.setCellValueFactory(new PropertyValueFactory<>("id"));
        pers_AD.setCellValueFactory(new PropertyValueFactory<>("ad"));
        pers_SOYAD.setCellValueFactory(new PropertyValueFactory<>("soyad"));
        pers_LEVEL.setCellValueFactory(new PropertyValueFactory<>("level"));
        
        personeller_table.setItems(null);
        personeller_table.setItems(data);
        tablo();
        
    }
          public void tablo(){
                  try {
            database.baglan();
            data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM personel");
            while(rs.next()) {
                
                data.add(new personel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonellerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        pers_ID.setCellValueFactory(new PropertyValueFactory<>("id"));
        pers_AD.setCellValueFactory(new PropertyValueFactory<>("ad"));
        pers_SOYAD.setCellValueFactory(new PropertyValueFactory<>("soyad"));
        pers_LEVEL.setCellValueFactory(new PropertyValueFactory<>("level"));
        
        personeller_table.setItems(null);
        personeller_table.setItems(data);
          }
    
}
