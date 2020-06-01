/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tersane;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.DateCell;

/**
 *
 * @author Toshiba
 */
public class rapor {
    private final StringProperty raporNo;
    private final ObjectProperty<LocalDate> raporTarihi;
    String dateFormat = "MM/dd/yyyy";

    public rapor(StringProperty raporNo, ObjectProperty<LocalDate> raporTarihi) {
        this.raporNo = raporNo;
        this.raporTarihi = raporTarihi;
    }
    
    public String getRaporNo() {
		return raporNo.get();
	}

	public void setRaporNo(String raporNo) {
		this.raporNo.set(raporNo);
	}
	
	public StringProperty RaporNoProperty() {
		return raporNo;
	}
    public LocalDate getRaporTarihi() {
		return raporTarihi.get();
	}

	public void setRaporTarihi(LocalDate birthday) {
		this.raporTarihi.set(birthday);
	}
	
	public ObjectProperty<LocalDate> RaporTarihiProperty() {
		return raporTarihi;
	}
  


   
    
}
