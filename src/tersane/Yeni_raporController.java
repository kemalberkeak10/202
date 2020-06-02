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
import javafx.scene.control.CheckBox;
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
    @FXML
    private TextField muayenestandarti;
    @FXML
    private TextField degerlendirmestandarti;
    @FXML
    private TextField muayeneprosedürü;
    @FXML
    private TextField muayenekapsami;
    @FXML
    private TextField resimno;
    @FXML
    private TextField sayfano;
    @FXML
    private TextField raporno;
    @FXML
    private TextField muayenebölgesi;
    @FXML
    private TextField luxmetre;
    @FXML
    private TextField muayeneortami;
    @FXML
    private TextField miknatisgiderimi;
    @FXML
    private TextField isilislem;
    @FXML
    private TextField yüzeysicaklik;
    @FXML
    private TextField muayenebölgesindekialanşiddeti;
    @FXML
    private TextField surface;
    @FXML
    private TextField isikcihazitanimi;
    @FXML
    private TextField kaldirmatesti;
    @FXML
    private CheckBox akaynagi;
    @FXML
    private CheckBox bkaynagi;
    @FXML
    private TextField standartsapma;
    @FXML
    private TextField aciklamaveekler;
    
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
    private ComboBox<String> sonuc8;
    @FXML
    private ComboBox<String> sonuc9;
    @FXML
    private ComboBox<String> sonuc10;
    @FXML
    private ComboBox<String> sonuc11;
    @FXML
    private ComboBox<String> sonuc12;
    @FXML
    private ComboBox<String> sonuc13;
    @FXML
    private ComboBox<String> sonuc14;

    @FXML
    private TextField sirano1;
    @FXML
    private TextField sirano2;
    @FXML
    private TextField sirano3;
    @FXML
    private TextField sirano4;
    @FXML
    private TextField sirano5;
    @FXML
    private TextField sirano6;
    @FXML
    private TextField sirano7;
    @FXML
    private TextField sirano8;
    @FXML
    private TextField sirano9;
    @FXML
    private TextField sirano10;
    @FXML
    private TextField sirano11;
    @FXML
    private TextField sirano12;
    @FXML
    private TextField sirano13;
    @FXML
    private TextField sirano14;
    @FXML
    private TextField kpn1;
    @FXML
    private TextField kpn2;
    @FXML
    private TextField kpn3;
    @FXML
    private TextField kpn4;
    @FXML
    private TextField kpn5;
    @FXML
    private TextField kpn6;
    @FXML
    private TextField kpn7;
    @FXML
    private TextField kpn8;
    @FXML
    private TextField kpn9;
    @FXML
    private TextField kpn10;
    @FXML
    private TextField kpn11;
    @FXML
    private TextField kpn12;
    @FXML
    private TextField kpn13;
    @FXML
    private TextField kpn14;
    @FXML
    private TextField ku1;
    @FXML
    private TextField ku2;
    @FXML
    private TextField ku3;
    @FXML
    private TextField ku4;
    @FXML
    private TextField ku5;
    @FXML
    private TextField ky1;
    @FXML
    private TextField ky2;
    @FXML
    private TextField ky3;
    @FXML
    private TextField ky4;
    @FXML
    private TextField ky5;
    @FXML
    private TextField kalinlik1;
    @FXML
    private TextField kalinlik2;
    @FXML
    private TextField kalinlik3;
    @FXML
    private TextField kalinlik4;
    @FXML
    private TextField kalinlik5;
    @FXML
    private TextField cap1;
    @FXML
    private TextField cap2;
    @FXML
    private TextField cap3;
    @FXML
    private TextField cap4;
    @FXML
    private TextField cap5;
    @FXML
    private TextField hatatipi1;
    @FXML
    private TextField hatatipi2;
    @FXML
    private TextField hatatipi3;
    @FXML
    private TextField hatatipi4;
    @FXML
    private TextField hatatipi5;
    @FXML
    private TextField hatayeri1;
    @FXML
    private TextField hatayeri2;
    @FXML
    private TextField hatayeri3;
    @FXML
    private TextField hatayeri4;
    @FXML
    private TextField hatayeri5;
    @FXML
    private TextField ku6;
    @FXML
    private TextField ku7;
    @FXML
    private TextField ku8;
    @FXML
    private TextField ku9;
    @FXML
    private TextField ku10;
    @FXML
    private TextField ku11;
    @FXML
    private TextField ku12;
    @FXML
    private TextField ku13;
    @FXML
    private TextField ku14;
    @FXML
    private TextField ky6;
    @FXML
    private TextField ky7;
    @FXML
    private TextField ky8;
    @FXML
    private TextField ky9;
    @FXML
    private TextField ky10;
    @FXML
    private TextField ky11;
    @FXML
    private TextField ky12;
    @FXML
    private TextField ky13;
    @FXML
    private TextField ky14;
    @FXML
    private TextField kalinlik6;
    @FXML
    private TextField kalinlik7;
    @FXML
    private TextField kalinlik8;
    @FXML
    private TextField kalinlik9;
    @FXML
    private TextField kalinlik10;
    @FXML
    private TextField kalinlik11;
    @FXML
    private TextField kalinlik12;
    @FXML
    private TextField kalinlik13;
    @FXML
    private TextField kalinlik14;
    @FXML
    private TextField cap6;
    @FXML
    private TextField cap7;
    @FXML
    private TextField cap8;
    @FXML
    private TextField cap9;
    @FXML
    private TextField cap10;
    @FXML
    private TextField cap11;
    @FXML
    private TextField cap12;
    @FXML
    private TextField cap13;
    @FXML
    private TextField cap14;
    @FXML
    private TextField hatatipi6;
    @FXML
    private TextField hatatipi7;
    @FXML
    private TextField hatatipi8;
    @FXML
    private TextField hatatipi9;
    @FXML
    private TextField hatatipi10;
    @FXML
    private TextField hatatipi11;
    @FXML
    private TextField hatatipi12;
    @FXML
    private TextField hatatipi13;
    @FXML
    private TextField hatatipi14;
    @FXML
    private TextField hatayeri6;
    @FXML
    private TextField hatayeri7;
    @FXML
    private TextField hatayeri8;
    @FXML
    private TextField hatayeri9;
    @FXML
    private TextField hatayeri10;
    @FXML
    private TextField hatayeri11;
    @FXML
    private TextField hatayeri12;
    @FXML
    private TextField hatayeri13;
    @FXML
    private TextField hatayeri14;
    

       

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
            sonuc8.getItems().addAll(database.showSonuc(sonuc));
            sonuc9.getItems().addAll(database.showSonuc(sonuc));
            sonuc10.getItems().addAll(database.showSonuc(sonuc));
            sonuc11.getItems().addAll(database.showSonuc(sonuc));
            sonuc12.getItems().addAll(database.showSonuc(sonuc));
            sonuc13.getItems().addAll(database.showSonuc(sonuc));
            sonuc14.getItems().addAll(database.showSonuc(sonuc));
           
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
            
             
            
            exportExcell.setOnAction(e->{
                String musteriAd = mstr.getText();
                String projeAd = prjd.getValue();
                String testYeri = testyeri.getText();
                String muayeneStandarti = muayenestandarti.getText();
                String degerlendirmeStandarti = degerlendirmestandarti.getText();
                
                String muayeneProsedürü =muayeneprosedürü.getText();
                String muayeneKapsami = muayenekapsami.getText();
                String resimNo = resimno.getText();
                String yüzeyDurumu = yzydrm.getValue();
                String muayeneAsamasi = mynsm.getValue();
                
                String sayfaNo = sayfano.getText();
                String raporNo = raporno.getText();
                String raporTarihi = rapor_tarihi.getText();
                String isemriNo = isemri.getText();
                String teklifNo = teklifno.getText();
                
                String cihazAd = chz.getValue();
                String kutupMesafesi = kutupmesafesi.getText();
                String tasiyiciOrtam = tasiyiciortam.getText();
                String miknatislamaTeknigi = miknatislamateknigi.getText();
                String isikSiddeti = isiksiddeti.getText();
                String isikMesafesi = isikmesafesi.getText();
                
                String muayeneBölgesi = muayenebölgesi.getText();
                String akimTipi = kmtp.getValue();
                String luxMetre = luxmetre.getText();
                String muayeneOrtami = muayeneortami.getText();
                String miknatisGiderimi = miknatisgiderimi.getText();
                String isilIslem = isilislem.getText();
                
                String yüzeySicakligi = yüzeysicaklik.getText();
                String muayenebölgesindekialanSiddeti = muayenebölgesindekialanşiddeti.getText();
                String surFace = surface.getText();
                String isikcihaziTanimi = isikcihazitanimi.getText();
                String kaldirmaTesti = kaldirmatesti.getText();
                
                String standartSapma = standartsapma.getText();
                String muayeneTarih = muayene_tarihi.getText();
                String aciklamaveEkler = aciklamaveekler.getText();
                
                String siraNo1 =sirano1.getText();
                String kpNo1= kpn1.getText();
                String kuNo1= ku1.getText();
                String kyNo1= ky1.getText();
                String kal1 =kalinlik1.getText();
                String c1 = cap1.getText();
                String ht1 = hatatipi1.getText();
                String hy1 = hatayeri1.getText();
                String s1 = sonuc1.getValue();
                
                String siraNo2 =sirano2.getText();
                String kpNo2= kpn2.getText();
                String kuNo2= ku2.getText();
                String kyNo2= ky2.getText();
                String kal2 =kalinlik2.getText();
                String c2 = cap2.getText();
                String ht2 = hatatipi2.getText();
                String hy2 = hatayeri2.getText();
                String s2 = sonuc2.getValue();
                
                String siraNo3 =sirano3.getText();
                String kpNo3= kpn3.getText();
                String kuNo3= ku3.getText();
                String kyNo3= ky3.getText();
                String kal3 =kalinlik3.getText();
                String c3 = cap3.getText();
                String ht3 = hatatipi3.getText();
                String hy3 = hatayeri3.getText();
                String s3 = sonuc3.getValue();
                
                 String siraNo4 =sirano4.getText();
                String kpNo4= kpn4.getText();
                String kuNo4= ku4.getText();
                String kyNo4= ky4.getText();
                String kal4 =kalinlik4.getText();
                String c4 = cap4.getText();
                String ht4 = hatatipi4.getText();
                String hy4 = hatayeri4.getText();
                String s4 = sonuc4.getValue();
                

                  String siraNo5 =sirano5.getText();
                String kpNo5= kpn5.getText();
                String kuNo5= ku5.getText();
                String kyNo5= ky5.getText();
                String kal5 =kalinlik5.getText();
                String c5 = cap5.getText();
                String ht5 = hatatipi5.getText();
                String hy5 = hatayeri5.getText();
                String s5 = sonuc5.getValue();
                
                  String siraNo6 =sirano6.getText();
                String kpNo6= kpn6.getText();
                String kuNo6= ku6.getText();
                String kyNo6= ky6.getText();
                String kal6 =kalinlik6.getText();
                String c6 = cap6.getText();
                String ht6 = hatatipi6.getText();
                String hy6 = hatayeri6.getText();
                String s6 = sonuc6.getValue();
                
                String siraNo7 =sirano7.getText();
                String kpNo7= kpn7.getText();
                String kuNo7= ku7.getText();
                String kyNo7= ky7.getText();
                String kal7 =kalinlik7.getText();
                String c7 = cap7.getText();
                String ht7 = hatatipi7.getText();
                String hy7 = hatayeri7.getText();
                String s7 = sonuc7.getValue();
                
                  String siraNo8 =sirano8.getText();
                String kpNo8= kpn8.getText();
                String kuNo8= ku8.getText();
                String kyNo8= ky8.getText();
                String kal8 =kalinlik8.getText();
                String c8 = cap8.getText();
                String ht8 = hatatipi8.getText();
                String hy8 = hatayeri8.getText();
                String s8 = sonuc8.getValue();
                
                  String siraNo9 =sirano9.getText();
                String kpNo9= kpn9.getText();
                String kuNo9= ku9.getText();
                String kyNo9= ky9.getText();
                String kal9 =kalinlik9.getText();
                String c9 = cap9.getText();
                String ht9 = hatatipi9.getText();
                String hy9 = hatayeri9.getText();
                String s9 = sonuc9.getValue();
                
                  String siraNo10 =sirano10.getText();
                String kpNo10= kpn10.getText();
                String kuNo10= ku10.getText();
                String kyNo10= ky10.getText();
                String kal10 =kalinlik10.getText();
                String c10 = cap10.getText();
                String ht10 = hatatipi10.getText();
                String hy10 = hatayeri10.getText();
                String s10 = sonuc10.getValue();
                
                  String siraNo11 =sirano11.getText();
                String kpNo11= kpn11.getText();
                String kuNo11= ku11.getText();
                String kyNo11= ky11.getText();
                String kal11 =kalinlik11.getText();
                String c11 = cap11.getText();
                String ht11 = hatatipi11.getText();
                String hy11 = hatayeri11.getText();
                String s11 = sonuc11.getValue();
                
                  String siraNo12 =sirano12.getText();
                String kpNo12= kpn12.getText();
                String kuNo12= ku12.getText();
                String kyNo12= ky12.getText();
                String kal12 =kalinlik12.getText();
                String c12 = cap12.getText();
                String ht12 = hatatipi12.getText();
                String hy12 = hatayeri12.getText();
                String s12 = sonuc12.getValue();
                
                  String siraNo13 =sirano13.getText();
                String kpNo13= kpn13.getText();
                String kuNo13= ku13.getText();
                String kyNo13= ky13.getText();
                String kal13 =kalinlik13.getText();
                String c13 = cap13.getText();
                String ht13= hatatipi13.getText();
                String hy13 = hatayeri13.getText();
                String s13 = sonuc13.getValue();
                
                  String siraNo14 =sirano14.getText();
                String kpNo14= kpn14.getText();
                String kuNo14= ku14.getText();
                String kyNo14= ky14.getText();
                String kal14 =kalinlik14.getText();
                String c14 = cap14.getText();
                String ht14 = hatatipi14.getText();
                String hy14 = hatayeri14.getText();
                String s14 = sonuc14.getValue();
                
                String opAd = operatör_adsoyad.getText();
                String deAd = degerlendiren_adsoyad.getText();
                String onAd = onay_adsoyad.getText();
                String opSeviye = operatör_seviye.getText();
                String deSeviye = degerlendiren_seviye.getText();
                String onSeviye = onay_seviye.getText();
                String operatörTarih= operatör_tarih.getText();
                String degerlendirenTarih = degerlendiren_tarih.getText();
                String onayTarih = onay_tarih.getText();
               
               
                try {
                    ex.excell(musteriAd,projeAd, testYeri, muayeneStandarti , degerlendirmeStandarti,
                            muayeneProsedürü, muayeneKapsami, resimNo, yüzeyDurumu, muayeneAsamasi,
                            sayfaNo, raporNo, raporTarihi, isemriNo ,teklifNo,   
                            cihazAd, kutupMesafesi, tasiyiciOrtam, miknatislamaTeknigi, isikSiddeti, isikMesafesi,
                            muayeneBölgesi , akimTipi, luxMetre, muayeneOrtami, miknatisGiderimi ,isilIslem,
                            yüzeySicakligi , muayenebölgesindekialanSiddeti , surFace ,isikcihaziTanimi , kaldirmaTesti,
                            standartSapma, muayeneTarih , aciklamaveEkler,
                            siraNo1 ,kpNo1 , kuNo1, kyNo1, kal1, c1, ht1, hy1, s1,
                            siraNo2 ,kpNo2 , kuNo2, kyNo2, kal2, c2, ht2, hy2, s2,
                            siraNo3 ,kpNo3 , kuNo3, kyNo3, kal3, c3, ht3, hy3, s3,
                            siraNo4 ,kpNo4 , kuNo4, kyNo4, kal4, c4, ht4, hy4, s4,
                            siraNo5 ,kpNo5 , kuNo5, kyNo5, kal5, c5, ht5, hy5, s5,
                            siraNo6 ,kpNo6 , kuNo6, kyNo6, kal6, c6, ht6, hy6, s6,
                            siraNo7 ,kpNo7 , kuNo7, kyNo7, kal7, c7, ht7, hy7, s7,
                            siraNo8 ,kpNo8 , kuNo8, kyNo8, kal8, c8, ht8, hy8, s8,
                            siraNo9 ,kpNo9 , kuNo9, kyNo9, kal9, c9, ht9, hy9, s9,
                            siraNo10 ,kpNo10 , kuNo10, kyNo10, kal10, c10, ht10, hy1, s10,
                            siraNo11 ,kpNo11 , kuNo11, kyNo11, kal11, c11, ht11, hy1, s11,
                            siraNo12 ,kpNo12 , kuNo12, kyNo12, kal12, c12, ht12, hy1, s12,
                            siraNo13 ,kpNo13 , kuNo13, kyNo13, kal13, c13, ht13, hy1, s13,
                            siraNo14 ,kpNo14 , kuNo14, kyNo14, kal14, c14, ht14, hy1, s14,
                            opAd, deAd, onAd, opSeviye, deSeviye, onSeviye, operatörTarih, degerlendirenTarih, onayTarih );
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
    

