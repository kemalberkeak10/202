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
public class ekipman {
    private final SimpleStringProperty cihaz,kutup_m,t_ortam,hesaplama_t,isik_s,isik_m;
    public ekipman(String cihaz,String kutup_m,String t_ortam,String hesaplama_t,String isik_s,String isik_m){
        this.cihaz= new SimpleStringProperty(cihaz);
        this.kutup_m = new SimpleStringProperty(kutup_m);
        this.t_ortam=  new SimpleStringProperty(t_ortam);
        this.hesaplama_t = new SimpleStringProperty(hesaplama_t);
        this.isik_s = new SimpleStringProperty(isik_s);
         this.isik_m = new SimpleStringProperty(isik_m);
        
    
}

     public String getCihaz(){
         return cihaz.get();
    }
     public void setCihaz(String value){
         cihaz.set(value);
     }
     public String getKutup_m(){
         return kutup_m.get();
     }
     public void setKutup_m(String value){
         kutup_m.set(value);
     }
     public String getT_ortam(){
         return t_ortam.get();
         }
     public void setT_ortam(String value){
         t_ortam.set(value);
     }
     public String getHesaplama_t(){
         return hesaplama_t.get();
    }
     public void setHesaplama_t(String value){
         hesaplama_t.set(value);
     }
     public String getIsik_s(){
         return isik_s.get();
    }
     public void setIsik_s(String value){
         isik_s.set(value);
        }
     public String getIsik_m(){
         return isik_m.get();
    }
     public void setIsik_m(String value){
         isik_m.set(value);
     }
     
         
          
      public StringProperty cihazProperty(){
          return cihaz;
          }
       public StringProperty kutup_mProperty(){
          return kutup_m;
      }
        public StringProperty t_ortamProperty(){
          return t_ortam;
      }
         public StringProperty hesaplama_tProperty(){
          return hesaplama_t;
      }
          public StringProperty isik_sProperty(){
          return isik_s;
      }
           public StringProperty isik_mProperty(){
          return isik_m;
      }
         
    

     
}