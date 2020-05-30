/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Toshiba
 */
public class müsteri {
    
    private final SimpleStringProperty id,firma_adi,il,ilce,is_emri,teklif_no;
    public müsteri(String id,String firma_adi,String il,String ilce,String is_emri,String teklif_no){
        this.id= new SimpleStringProperty(id);
        this.firma_adi = new SimpleStringProperty(firma_adi);
        this.il=  new SimpleStringProperty(il);
        this.ilce = new SimpleStringProperty(ilce);
        this.is_emri = new SimpleStringProperty(is_emri);
         this.teklif_no = new SimpleStringProperty(teklif_no);
        
    
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
