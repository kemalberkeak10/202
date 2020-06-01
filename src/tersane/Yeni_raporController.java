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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import tersane.RaporlarController;
import tersane.müsteri;
import tersane.ekipman;

/**
 * FXML Controller class
 *
 * @author Toshiba
 */
public class Yeni_raporController implements Initializable {

    @FXML
    private TextField mstr;
    @FXML
    private ChoiceBox<String> prjd;
    @FXML
    private ChoiceBox<String> chz;
    @FXML
    private ChoiceBox<String> kmtp;
    @FXML
    private ChoiceBox<String> yzydrm;
    @FXML
    private ChoiceBox<String> mynsm;
    @FXML
    private TextField rapor_no;
    @FXML
    private ComboBox<String> sonuc1;
    @FXML
    private ComboBox<String> sonuc2;
    @FXML
    private ComboBox<String> sonuc3;
    @FXML
    private ComboBox<String> sonuc4;
    @FXML
    private ComboBox<String> sonuc5;
    @FXML
    private ComboBox<String> sonuc6;
    @FXML
    private ComboBox<String> sonuc7;
    @FXML
    private TextField operatör_adsoyad;
    @FXML
    private TextField degerlendiren_adsoyad;
    @FXML
    private TextField onay_adsoyad;
    @FXML
    private TextField müsteri_adsoyad;
    
 
    @FXML
    private TextField kutupmesafesi;
    @FXML
    private TextField tasiyiciortam;
    @FXML
    private TextField miknatislamateknigi;
    @FXML
    private TextField isiksiddeti;
    @FXML
    private TextField isikmesafesi;
    @FXML
    private TextField operatör_seviye;
    @FXML
    private TextField degerlendiren_seviye;
    @FXML
    private TextField onay_seviye;
    
    static String secili_ekipman;
     static String secili_müsteri;
    static String e;
    @FXML
    private Button exportExcell;
    @FXML
    private TextField testyeri;
    @FXML
    private TextField rapor_tarihi;
    @FXML
    private TextField isemri;
    @FXML
    private TextField teklifno;
    @FXML
    private TextField muayene_tarihi;
    @FXML
    private TextField operatör_tarih;
    @FXML
    private TextField degerlendiren_tarih;
    @FXML
    private TextField onay_tarih;
    @FXML
    private Button geri_button;

       

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       database.baglan();
       müsteribilgileriniyükle();
       String proje = "Select proje_ad from projeler";
       String yüzey = "Select yuzey_durumu from yüzeyler";
       String muayeneasamasi = "Select asama from muayene_asamasi";
       String akimtipi= "Select Akim_tipi from acdc";
      
       String sonuc ="Select sonuc from sonuc";
        try {
            
            prjd.getItems().addAll(database.showProje(proje));
            yzydrm.getItems().addAll(database.showYüzeyD(yüzey));
            mynsm.getItems().addAll(database.showMuayene_asamasi(muayeneasamasi));
            kmtp.getItems().addAll(database.showAkimtipi(muayeneasamasi));
            
            sonuc1.getItems().addAll(database.showSonuc(sonuc));
            sonuc2.getItems().addAll(database.showSonuc(sonuc));
            sonuc3.getItems().addAll(database.showSonuc(sonuc));
            sonuc4.getItems().addAll(database.showSonuc(sonuc));
            sonuc5.getItems().addAll(database.showSonuc(sonuc));
            sonuc6.getItems().addAll(database.showSonuc(sonuc));
            sonuc7.getItems().addAll(database.showSonuc(sonuc));
           
            } catch (SQLException ex) {
            Logger.getLogger(Yeni_raporController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      this.operatör_adsoyad.setText(String.valueOf(RaporlarController.secilen1));
        this.degerlendiren_adsoyad.setText(String.valueOf(RaporlarController.secilen2));
        this.onay_adsoyad.setText(String.valueOf(RaporlarController.secilen3));
       this.operatör_seviye.setText(RaporlarController.secilenOpSeviye);
        this.degerlendiren_seviye.setText(RaporlarController.secilenDeSeviye);
        this.onay_seviye.setText(RaporlarController.secilenOnSeviye);
        this.müsteri_adsoyad.setText(String.valueOf(RaporlarController.müsteri1));
        this.mstr.setText(String.valueOf(RaporlarController.müsteri1));
        this.rapor_tarihi.setText(String.valueOf(RaporlarController.secilentarih));
        this.operatör_tarih.setText(String.valueOf(RaporlarController.secilentarih));
        this.degerlendiren_tarih.setText(String.valueOf(RaporlarController.secilentarih));
         this.onay_tarih .setText(String.valueOf(RaporlarController.secilentarih)); 
         this.muayene_tarihi.setText(String.valueOf(RaporlarController.secilentarih));
        chz.setOnAction(e->{
        loadOtherCihazInformation();
               
        });
       
  
       

        
        try {
           Export_Excell ex = new Export_Excell();

            loadCihaz();
            
            /*  
              String yuzeyDurumu = yzydrm.getValue();
              String muayeneAsamasi =mynsm.getValue();
              String akimTipi = kmtp.getValue();
              String s1 = sonuc1.getValue();
              String s2 = sonuc2.getValue();
              String s3 = sonuc3.getValue();
              String s4 = sonuc4.getValue();
              String s5 = sonuc5.getValue();
              String s6 = sonuc6.getValue();
              String s7 = sonuc7.getValue();
              String muayeneTarih = muayene_tarihi.getText();
              String onayTarih = onay_tarih.getText();
              String degerlendirenTarih = degerlendiren_tarih.getText();
              String operatörTarih= operatör_tarih.getText(); */
            exportExcell.setOnAction(e->{
                String musteriAd = mstr.getText();
                String cihazAd = chz.getValue();
                String projeAd = prjd.getValue();
                String testYeri = testyeri.getText();
                String kutupMesafesi = kutupmesafesi.getText();
                String opAd = operatör_adsoyad.getText();
                String deAd = degerlendiren_adsoyad.getText();
                String onAd = onay_adsoyad.getText();
                String opSeviye = operatör_seviye.getText();
                String deSeviye = degerlendiren_seviye.getText();
                String onSeviye = onay_seviye.getText();
                try {
                    ex.excell(musteriAd, cihazAd ,projeAd, testYeri, kutupMesafesi, opAd, deAd, onAd, opSeviye, deSeviye, onSeviye );
                } catch (IOException ex1) {
                    Logger.getLogger(RaporlarController.class.getName()).log(Level.SEVERE, null, ex1);
                }
            });
        } catch (SQLException ex1) {
            Logger.getLogger(RaporlarController.class.getName()).log(Level.SEVERE, null, ex1);
        }
        }
    

    
    public void loadCihaz() throws SQLException{
        database dao = new database();
        String sql = "SELECT cihaz from ekipmanlar";
        chz.getItems().addAll(dao.showEkipman(sql));

    }

    private void loadOtherCihazInformation() {
        
        secili_ekipman = chz.getSelectionModel().getSelectedItem();
        ekipman e = database.getOtherCihazInformation(secili_ekipman);
        kutupmesafesi.setText(e.kutup_mProperty().getValue());
        tasiyiciortam.setText(e.t_ortamProperty().getValue());
       miknatislamateknigi.setText(e.hesaplama_tProperty().getValue());
       isikmesafesi.setText(e.isik_mProperty().getValue());
       isiksiddeti.setText(e.isik_sProperty().getValue());
    }
        private void müsteribilgileriniyükle() {
        
        secili_müsteri =(String.valueOf(RaporlarController.müsteri1));
        
        müsteri m = database.müsteribilgileri(secili_müsteri);
        testyeri.setText(m.ilProperty().getValue());
        isemri.setText(m.is_emriProperty().getValue());
      teklifno.setText(m.teklif_noProperty().getValue());
       
    }

    @FXML
    private void show_raporlar(ActionEvent event) {
           
         if(event.getSource()== geri_button){
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
    
    
           
    }    
    

