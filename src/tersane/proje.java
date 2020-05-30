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
public class proje {
   private final SimpleStringProperty id , proje_ad;
    public proje(String id,String proje_ad){
        this.id= new SimpleStringProperty(id);
        this.proje_ad = new SimpleStringProperty(proje_ad);
        
    
}

     public String getId(){
         return id.get();
    }
     public void setId(String value){
         id.set(value);
     }
     public String getProje_ad(){
         return proje_ad.get();
     }
     public void setProje_ad(String value){
         proje_ad.set(value);
     }
     
     
         
          
      public StringProperty idProperty(){
          return id;
          }
       public StringProperty proje_adProperty(){
          return proje_ad;
      }
      
    
}
