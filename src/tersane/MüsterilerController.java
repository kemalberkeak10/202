/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javafx.stage.Stage;
import static tersane.database.con;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class MüsterilerController implements Initializable {

    @FXML
    private Button anasayfa_button;
    @FXML
    private Button müsteriler_button;
    @FXML
    private Button projeler_button;
    @FXML
    private Button yüzeyler_button;
    @FXML
    private Button ekipmanlar_button;
    @FXML
    private Button raporlar_button;
    @FXML
    private Button personeller_button;
    @FXML
    private TableView<müsteri> müsteriler_table;
    @FXML
    private TableColumn<müsteri, String> id;
    @FXML
    private TableColumn<müsteri, String> f_adi;
    @FXML
    private TableColumn<müsteri, String> il;
    @FXML
    private TableColumn<müsteri, String> ilce;
    @FXML
    private TableColumn<müsteri, String> i_emri;
    @FXML
    private TableColumn<müsteri, String> t_no;
     private ObservableList<müsteri>data;
    @FXML
    private Button müsteri_ekle;
    @FXML
    private Button müsteri_sil;
    @FXML
    private Button müsteri_düzenle;
    @FXML
    private TextField müsid;
    @FXML
    private TextField müsfa;
    @FXML
    private TextField müsil;
    @FXML
    private TextField müsilce;
    @FXML
    private TextField müsie;
    @FXML
    private TextField müstn;
   


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try {
            database.baglan();
            data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM müsteriler");
            while(rs.next()) {
                
                data.add(new müsteri(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonellerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        f_adi.setCellValueFactory(new PropertyValueFactory<>("firma_adi"));
        il.setCellValueFactory(new PropertyValueFactory<>("il"));
        ilce.setCellValueFactory(new PropertyValueFactory<>("ilce"));
        i_emri.setCellValueFactory(new PropertyValueFactory<>("is_emri"));
        t_no.setCellValueFactory(new PropertyValueFactory<>("teklif_no"));
        
        müsteriler_table.setItems(null);
        müsteriler_table.setItems(data);
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
    private void müsteri_e(ActionEvent event) {
            String id=müsid.getText();
            String fa= müsfa.getText();
            String il=müsil.getText();
            String ilce=müsilce.getText();
           String  ie = müsie.getText();
            String tn = müstn.getText();      
       
 
      

              database.preparedMüsteriEkle( id, fa, il, ilce, ie, tn);
    }

    @FXML
    private void müsteri_s(ActionEvent event) {
        String id=müsid.getText();
            
          database.preparedMüsteriSil(id);
    }

    @FXML
    private void müsteri_d(ActionEvent event) {
          String id=müsid.getText();
            String fa= müsfa.getText();
            String il=müsil.getText();
            String ilce=müsilce.getText();
           String  ie = müsie.getText();
            String tn = müstn.getText();            
       
 
        database.preparedMüsteriGüncelle( fa, il, ilce, ie, tn, id);
    }
}
