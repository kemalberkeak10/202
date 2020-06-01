    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import static tersane.database.con;

/**
 *
 * @author Toshiba
 */
public class müsteri {
    
    private SimpleStringProperty id,firma_adi,il,ilce,is_emri,teklif_no;
    
    public müsteri(String id, String firma_adi, String il, String ilce, String is_emri,String teklif_no){
        this.id= new SimpleStringProperty(id);
        this.firma_adi = new SimpleStringProperty(firma_adi);
        this.il=  new SimpleStringProperty(il);
        this.ilce = new SimpleStringProperty(ilce);
        this.is_emri = new SimpleStringProperty(is_emri);
         this.teklif_no = new SimpleStringProperty(teklif_no);

}
    public müsteri(String firma_adi, String il, String ilce, String is_emri,String teklif_no){
       
        this.firma_adi = new SimpleStringProperty(firma_adi);
        this.il=  new SimpleStringProperty(il);
        this.ilce = new SimpleStringProperty(ilce);
        this.is_emri = new SimpleStringProperty(is_emri);
         this.teklif_no = new SimpleStringProperty(teklif_no);

}
       public müsteri(String firma_adi, String il,String is_emri,String teklif_no){
       
        this.firma_adi = new SimpleStringProperty(firma_adi);
        this.il=  new SimpleStringProperty(il);
        this.is_emri = new SimpleStringProperty(is_emri);
         this.teklif_no = new SimpleStringProperty(teklif_no);

}
        public müsteri(String il,String is_emri,String teklif_no){
       
       
        this.il=  new SimpleStringProperty(il);
        this.is_emri = new SimpleStringProperty(is_emri);
         this.teklif_no = new SimpleStringProperty(teklif_no);

}
    public müsteri(String firma_adi){
       
        this.firma_adi = new SimpleStringProperty(firma_adi);
        
}
  
   
    public static müsteri must(String name){

        String query="select * from müsteriler where firma_adi=?";
         müsteri mus=null;
        PreparedStatement prep;

        try {
            prep=con.prepareStatement(query);
            prep.setString(1, name);
            ResultSet res=prep.executeQuery();
           while(res.next()){
           mus=new müsteri(res.getString("id"),res.getString("firma_adi"), res.getString("il"),res.getString("ilce"),res.getString("is_emri"),res.getString("teklif_no"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }


        return mus;
    }
    public String toString(){
        return this.firma_adiProperty().getValue();
    }

  
    

     public String getId(){
         return id.get();
    }
     public void setId(String value){
         id.set(value);
     }
     public String getFirma_adi(){
         return firma_adi.get();
     }
     public void setFirma_adi(String value){
         firma_adi.set(value);
     }
     public String getIl(){
         return il.get();
         }
     public void setIl(String value){
         il.set(value);
     }
     public String getIlce(){
         return ilce.get();
         }
     public void setIlce(String value){
         ilce.set(value);
     }
     public String getIs_emri(){
         return is_emri.get();
         }
     public void setIs_emri(String value){
         is_emri.set(value);
     }
     public String getTeklif_no(){
         return il.get();
         }
     public void setTeklif_no(String value){
         teklif_no.set(value);
     }
     
     
         
          
      public StringProperty idProperty(){
          return id;
          }
       public StringProperty firma_adiProperty(){
          return firma_adi;
      }
        public StringProperty ilProperty(){
          return il;
      }
         public StringProperty ilceProperty(){
          return ilce;
      }
          public StringProperty is_emriProperty(){
          return is_emri;
      }
           public StringProperty teklif_noProperty(){
          return teklif_no;
      }
    
    
}
