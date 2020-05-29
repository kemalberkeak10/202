
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
import static javax.management.remote.JMXConnectorFactory.connect;

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
     PreparedStatement ps; 
   public static void baglan(){
       // "jbdc:mysql://localhost:3306/202" 
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, kullanici_adi, parola);
            System.out.println("Bağlantı Başarılı...");
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
    
        
        
        
        
}
   
    
