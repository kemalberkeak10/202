/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class RaporlarController implements Initializable {

    @FXML
    private Button anasayfa_button;
    @FXML
    private ImageView anamenu;
    @FXML
    private Button projeler_button;
    @FXML
    private Button ekipmanlar_button;
    @FXML
    private Button raporlar_button;
    @FXML
    private Button personeller_button;
    @FXML
    private Button rekle_button;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

   /* @FXML
    private void show_personeller(MouseEvent event) {
    }*/

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
    private void rapor_ekle(ActionEvent event) {
        if(event.getSource()== rekle_button){
            try{
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
                

                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("raporekipman.fxml")));
                stage.setScene(scene);
                stage.show();


            }catch(IOException e){
                System.err.println(e.getMessage());
            }
        }
        
    }


    
}
