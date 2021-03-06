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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import static tersane.database.con;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class EkipmanlarController implements Initializable {

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
    private TextField ekipc;
    @FXML
    private TextField ekipkm;
    @FXML
    private TextField ekipto;
    @FXML
    private TextField ekipmt;
    @FXML
    private TextField ekipis;
    @FXML
    private TextField ekipim;
    @FXML
    private TableView<ekipman> ekipmanlar_table;
    @FXML
    private Button ekipman_ekle;
    @FXML
    private Button ekipman_sil;
    @FXML
    private Button ekipman_düzenle;
    @FXML
    private TableColumn<ekipman, String> cihaz;
    @FXML
    private TableColumn<ekipman, String> k_mesafe;
    @FXML
    private TableColumn<ekipman, String> t_ortam;
    @FXML
    private TableColumn<ekipman, String> m_teknik;
    @FXML
    private TableColumn<ekipman, String> i_siddet;
    @FXML
    private TableColumn<ekipman, String> i_mesafe;
    private ObservableList<ekipman>data;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void ekipman_d(ActionEvent event) {
         String chz=ekipc.getText();
            String ktm= ekipkm.getText();
            String to=ekipto.getText();
            String mt=ekipmt.getText();
           String  is = ekipis.getText();
            String im = ekipim.getText();      
       
 
        database.preparedEkipmanGüncelle( ktm, to, mt, is, im,chz);
        tablo();
       
    }

    @FXML
    private void ekipman_e(ActionEvent event) {
            String chz=ekipc.getText();
            String ktm= ekipkm.getText();
            String to=ekipto.getText();
            String mt=ekipmt.getText();
           String  is = ekipis.getText();
            String im = ekipim.getText();      
       
 
      

              database.preparedEkipmanEkle( chz, ktm, to, mt, is, im);
              tablo();
        }

    @FXML
    private void ekipman_s(ActionEvent event) {
        String chz=ekipc.getText();
            
          database.preparedEkipmanSil(chz);
          tablo();
    }
public void tablo(){ 
        try {
            database.baglan();
            data = FXCollections.observableArrayList();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM ekipmanlar");
            while(rs.next()) {
                
                data.add(new ekipman(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonellerController.class.getName()).log(Level.SEVERE, null, ex);
        }
        cihaz.setCellValueFactory(new PropertyValueFactory<>("cihaz"));
        k_mesafe.setCellValueFactory(new PropertyValueFactory<>("kutup_m"));
        t_ortam.setCellValueFactory(new PropertyValueFactory<>("t_ortam"));
        m_teknik.setCellValueFactory(new PropertyValueFactory<>("hesaplama_t"));
        i_siddet.setCellValueFactory(new PropertyValueFactory<>("isik_s"));
        i_mesafe.setCellValueFactory(new PropertyValueFactory<>("isik_m"));
        
        ekipmanlar_table.setItems(null);
        ekipmanlar_table.setItems(data);
    }   

}


