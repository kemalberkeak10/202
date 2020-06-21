
package tersane;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import static javax.management.remote.JMXConnectorFactory.connect;
import tersane.personel;
import tersane.ekipman;
import tersane.müsteri;
/**
 *
 * @author Toshiba
 */
public class database {
    
    private static String kullanici_adi = "root";
    private static String parola = "";
    
    private static String db_ismi = "202";
    
    private static String host =  "localhost";
    
    private static int port = 3306;
    
    public static Connection con ;
    
    private static Statement statement = null;
    private static PreparedStatement preparedStatement = null;
    private static PreparedStatement ps;
     private static ResultSet rs;
   public static void baglan(){
       // "jbdc:mysql://localhost:3306/202" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, kullanici_adi, parola);
         //   System.out.println("Bağlantı Başarılı...");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
   }
   
   /*  PERSONELLLER ********************  */
    
    public static void preparedCalisanlariEkle(String personel_id,String personel_ad, String personel_soyad, String personel_seviye) {
            String sorgu = "Insert Into personel (personel_id,personel_ad,personel_soyad,personel_seviye) VALUES(?,?,?,?)";
                
          

            try {

                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, personel_id);
                preparedStatement.setString(2, personel_ad);
                preparedStatement.setString(3,personel_soyad);
                preparedStatement.setString(4, personel_seviye);
                preparedStatement.executeUpdate();
                System.out.println("id:" + personel_id +"Personel başarıyla eklendi ");

     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }   
        
        public static void preparedCalisanlariSil(String personel_id) {
           // String sorgu = "Insert Into personel (personel_ad,personel_soyad,personel_seviye) VALUES(?,?,?)";
            String sorgu = "Delete from personel where personel_id = ? "; 
            try {
                
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, personel_id);
              /* preparedStatement.setString(1, personel_id); 
               preparedStatement.setString(2,personel_soyad);
               preparedStatement.setString(3, personel_seviye); */
                              

                preparedStatement.executeUpdate();
                System.out.println("id:" + personel_id + "nolu Personel başarıyla silindi");
     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
  
        
    
     public void preparedCalisanlariGetir(int personel_id) {
       
       String sorgu = "Select * From personel";

       
       
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            //ResultSet rs = preparedStatement.executeQuery();
            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
   public static void preparedCalisanlariGüncelle(String personel_ad,String personel_soyad,String personel_seviye, String personel_id) {
       
        String sorgu = "Update personel Set personel_ad = ?, personel_soyad = ? ,personel_seviye= ? where personel_id = ?";

        try {
           
            PreparedStatement preparedStatement  = con.prepareStatement(sorgu);
          
            preparedStatement.setString(1,personel_ad);
            preparedStatement.setString(2,personel_soyad); 
            preparedStatement.setString(3,personel_seviye);
            
            preparedStatement.setString(4,personel_id );

            
            
           preparedStatement.executeUpdate();
             System.out.println("ID:"+ personel_id + "  Personel Başarıyla güncellendi");
           

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
   
   /*    EKİPMANLAR ******************** */
   
     public static void preparedEkipmanEkle(String cihaz,String k_mesafe, String t_ortam, String m_teknik,String i_siddet,String i_mesafe) {
            String sorgu = "Insert Into ekipmanlar (cihaz,k_mesafe,t_ortam,m_teknik,i_siddet,i_mesafe) VALUES(?,?,?,?,?,?)";
                
          

            try {

                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, cihaz);
                preparedStatement.setString(2, k_mesafe);
                preparedStatement.setString(3, t_ortam);
                preparedStatement.setString(4, m_teknik);
                preparedStatement.setString(5, i_siddet);
                preparedStatement.setString(6, i_mesafe);
                preparedStatement.executeUpdate();
                System.out.println("Cihaz:" + cihaz +"Ekipman başarıyla eklendi ");

     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void preparedEkipmanSil(String cihaz) {
           // String sorgu = "Insert Into personel (personel_ad,personel_soyad,personel_seviye) VALUES(?,?,?)";
            String sorgu = "Delete from ekipmanlar where cihaz = ? "; 
            try {
                
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, cihaz);
              

                preparedStatement.executeUpdate();
                System.out.println("!!" + cihaz + "başarıyla silindi");
     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
     public static void preparedEkipmanGüncelle(String cihaz,String k_mesafe,String t_ortam,String m_teknik,String i_siddet , String i_mesafe) {
       
        String sorgu = "Update ekipmanlar Set  k_mesafe = ?,t_ortam= ?, m_teknik= ?, i_siddet = ?, i_mesafe = ? where cihaz = ?";

        try {
           
            PreparedStatement preparedStatement  = con.prepareStatement(sorgu);
          
            preparedStatement.setString(1,cihaz);
            preparedStatement.setString(2,k_mesafe);
            preparedStatement.setString(3,t_ortam);
            preparedStatement.setString(4,m_teknik);
            preparedStatement.setString(5,i_siddet); 
            preparedStatement.setString(6,i_mesafe);


            
           preparedStatement.executeUpdate();
             System.out.println("Cihaz:"+ cihaz + " Başarıyla güncellendi");
           

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
     /*******************************MÜSTERİLER **  */
      
        public static void preparedMüsteriEkle(String id,String firma_adi, String il, String ilce,String is_emri,String teklif_no) {
            String sorgu = "Insert Into müsteriler (id,firma_adi,il,ilce,is_emri,teklif_no) VALUES(?,?,?,?,?,?)";
                
          

            try {

                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, firma_adi);
                preparedStatement.setString(3, il);
                preparedStatement.setString(4, ilce);
                preparedStatement.setString(5, is_emri);
                preparedStatement.setString(6, teklif_no);
                preparedStatement.executeUpdate();
                System.out.println("ID:" + id +" NOlu Müşteri başarıyla eklendi ");

     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
            public static void preparedMüsteriSil(String id) {
           // String sorgu = "Insert Into personel (personel_ad,personel_soyad,personel_seviye) VALUES(?,?,?)";
            String sorgu = "Delete from müsteriler where id = ? "; 
            try {
                
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
              

                preparedStatement.executeUpdate();
                System.out.println("ID: " + id + " başarıyla silindi");
     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
             public static void preparedMüsteriGüncelle(String id,String firma_adi,String il,String ilce,String is_emri , String teklif_no) {
       
        String sorgu = "Update müsteriler Set  firma_adi = ?,il= ?, ilce= ?, is_emri = ?, teklif_no = ? where id = ?";

        try {
           
            PreparedStatement preparedStatement  = con.prepareStatement(sorgu);
          
               preparedStatement.setString(1, id);
                preparedStatement.setString(2, firma_adi);
                preparedStatement.setString(3, il);
                preparedStatement.setString(4, ilce);
                preparedStatement.setString(5, is_emri);
                preparedStatement.setString(6, teklif_no);
                preparedStatement.executeUpdate();
                System.out.println("ID:" + id +" NOlu Müşteri başarıyla eklendi ");
            
                preparedStatement.executeUpdate();
             System.out.println("ID: "+ id + " Başarıyla güncellendi");
           

        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     }
             
             /************************   PROJELER *** */
             public static void preparedProjeEkle(String id,String proje_ad) {
            String sorgu = "Insert Into projeler (id,proje_ad) VALUES(?,?)";
                
          

            try {

                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, proje_ad);
                
                preparedStatement.executeUpdate();
                System.out.println("ID:" + id +" NOlu Proje başarıyla eklendi ");

     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
            public static void preparedProjeSil(String id) {
          
            String sorgu = "Delete from projeler where id = ? "; 
            try {
                
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
              

                preparedStatement.executeUpdate();
                System.out.println("ID: " + id + " başarıyla silindi");
     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
       /********************* YUZEYER  ********** */
            
         public static void preparedYuzeyEkle(String id,String yuzey_durumu) {
            String sorgu = "Insert Into yüzeyler (id,yuzey_durumu) VALUES(?,?)";
                
          

            try {

                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
                preparedStatement.setString(2, yuzey_durumu);
                
                preparedStatement.executeUpdate();
                System.out.println("ID:" + id +" NOlu Yuzey başarıyla eklendi ");

     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
                 Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Ekipman Ekleme İşlemi Başarısız :(");
            alert.setContentText("Ama üzülmeyin, tekrar deneyebilirsiniz :) Herkes ikinci bir şansı hakeder...");
            alert.show();
            ex.printStackTrace();
        }
        }
            public static void preparedYuzeySil(String id) {
          
            String sorgu = "Delete from yüzeyler where id = ? "; 
            try {
                
                preparedStatement = con.prepareStatement(sorgu);
                preparedStatement.setString(1, id);
              

                preparedStatement.executeUpdate();
                System.out.println("ID: " + id + " başarıyla silindi");
     
        }   catch (SQLException ex) {
                 Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
        public static ObservableList<String> showMusteri(String sql) throws SQLException {
        ObservableList<String> musteriList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select firma_adi from müsteriler");
        while(rs.next()){
            musteriList.addAll(rs.getString("firma_adi"));
        }
       
        return musteriList;
    }
        public static ObservableList<müsteri> getMusteriData(String query){
	ObservableList list = FXCollections.observableArrayList();
	try {
          
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
		list.add(new müsteri(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }
	}
        catch(Exception e) {
            e.printStackTrace();
	}
		
	return list;
	}
           public static ObservableList<String> showPersonel(String sql) throws SQLException {
        ObservableList<String> personelList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);
        
        rs=ps.executeQuery("Select personel_ad from personel");
        while(rs.next()){
            personelList.addAll(rs.getString("personel_ad"));
        }
       
        return personelList;
           }
        public static ObservableList<String> showProje(String sql) throws SQLException {
        ObservableList<String> projeList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select proje_ad from projeler");
        while(rs.next()){
            projeList.addAll(rs.getString("proje_ad"));
        }
       
        return projeList;
        
}
                public static ObservableList<String> showYüzeyD(String sql) throws SQLException {
        ObservableList<String> yüzeyList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select yuzey_durumu from yüzeyler");
        while(rs.next()){
           yüzeyList.addAll(rs.getString("yuzey_durumu"));
        }
       
        return yüzeyList;
        
}
                  public static ObservableList<String> showMuayene_asamasi(String sql) throws SQLException {
        ObservableList<String> maList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select asama from muayene_asamasi");
        while(rs.next()){
          maList.addAll(rs.getString("asama"));
        }
       
        return maList;
                 
      }
             
          public static ObservableList<String> showAkimtipi(String sql) throws SQLException {
        ObservableList<String> akimtipiList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select Akim_tipi from acdc");
        while(rs.next()){
          akimtipiList.addAll(rs.getString("Akim_tipi"));
        }
       
        return akimtipiList;        
                   
}
          public static ObservableList<String> showEkipman(String sql) throws SQLException {
        ObservableList<String> ekipmanList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select cihaz from ekipmanlar");
        while(rs.next()){
         ekipmanList.addAll(rs.getString("cihaz"));
        }
          
       
        return ekipmanList; 
         }
         public static ObservableList<String> showSonuc(String sql) throws SQLException {
        ObservableList<String> sonucList = FXCollections.observableArrayList();

        ps=database.con.prepareStatement(sql);

        rs=ps.executeQuery("Select sonuc from sonuc");
        while(rs.next()){
         sonucList.addAll(rs.getString("sonuc"));
        }
       
        return sonucList; 
         }
          
        public static ObservableList<ekipman> getEkipmanData(String query){
	ObservableList list = FXCollections.observableArrayList();
	try {
           
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
		list.add(new ekipman(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
	}
        catch(Exception e) {
            e.printStackTrace();
	}
		
	return list;
    }
        public static ekipman ekipmanbilgileri(String cihazAd){
        ekipman ek = null;
        try {
            String query = "SELECT * from ekipmanlar WHERE cihaz= ?";
            database.baglan();
            ps = con.prepareStatement(query);
            ps.setString(1, cihazAd);
            rs = ps.executeQuery();
           
            while(rs.next()){
          
                ek = new ekipman(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ek;
        
    }
          public static müsteri müsteribilgileri(String firma_ad){
        müsteri müs = null;
        try {
            String query = "SELECT * from müsteriler WHERE firma_adi= ?";
            database.baglan();
            ps = con.prepareStatement(query);
            ps.setString(1, firma_ad);
            rs = ps.executeQuery();
           
            while(rs.next()){
          
                müs = new müsteri(rs.getString(3),rs.getString(5),rs.getString(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return müs;
          }
        
        
         public static ObservableList<personel> Calisan_Sec(){
	ObservableList<personel> list = FXCollections.observableArrayList();
        String query = "SELECT * from personel";
	try {
            database.baglan();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                personel c = new personel(rs.getString(2), rs.getString(3));
                list.addAll(c);
            }
	}
        catch(Exception e) {
            e.printStackTrace();
	}
		
	return list;
	}
          public static ObservableList<müsteri> Müsteri_Sec(){
	ObservableList<müsteri> mlist = FXCollections.observableArrayList();
        String query = "SELECT * from müsteriler";
	try {
            database.baglan();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()) {
                müsteri d = new müsteri(rs.getString(2));
                mlist.addAll(d);
            }
	}
        catch(Exception e) {
            e.printStackTrace();
	}
		
	return mlist;
	} 
          
    public static String getSeviye(String ad, String soyad){  
        
        String l = null;
        
        try {
            String query = "SELECT personel_seviye from personel WHERE (personel_ad,personel_soyad) =(?,?)";
            database.baglan();
            ps = con.prepareStatement(query);
            ps.setString(1, ad);
            ps.setString(2, soyad);
            rs = ps.executeQuery();
            
            while(rs.next()){
                
               l = (rs.getString("personel_seviye"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }        
    










}
   
    
