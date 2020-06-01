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
public class yuzey {
    private final SimpleStringProperty id , yuzey_durumu;
    public yuzey(String id,String yuzey_durumu){
        this.id= new SimpleStringProperty(id);
        this.yuzey_durumu = new SimpleStringProperty(yuzey_durumu);
        
    
}

     public String getId(){
         return id.get();
    }
     public void setId(String value){
         id.set(value);
     }
     public String getYuzey_durumu(){
         return yuzey_durumu.get();
     }
     public void setProje_ad(String value){
         yuzey_durumu.set(value);
     }
     
     
         
          
      public StringProperty idProperty(){
          return id;
          }
       public StringProperty yuzey_durumuProperty(){
          return yuzey_durumu;
      }
    
}
