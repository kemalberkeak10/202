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
public class personel {
    private final SimpleStringProperty id,ad,soyad,level;
    public personel(String id,String ad,String soyad,String level){
        this.id= new SimpleStringProperty(id);
        this.ad = new SimpleStringProperty(ad);
        this.soyad =  new SimpleStringProperty(soyad);
        this.level = new SimpleStringProperty(level); ;
    }

    public String getId() {
        return id.get();
    }

    public void setId(String value) {
        id.set(value);
    }

    public String getAd() {
        return ad.get();
    }

    public void setAd(String value) {
        ad.set(value);
    }

    public String getSoyad() {
        return soyad.get();
    }

    public void setSoyad(String value) {
        soyad.set(value);
    }

    public String getLevel() {
        return level.get();
    }

    public void setLevel(String value) {
        level.set(value);
    }
      public StringProperty adProperty(){
          return ad;
      }
       public StringProperty soyadProperty(){
          return soyad;
      }
        public StringProperty idProperty(){
          return id;
      }
         public StringProperty levelProperty(){
          return level;
      }
      
}
