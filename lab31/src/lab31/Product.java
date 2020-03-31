/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31;

/**
 *
 * @author pb41483
 */

import java.util.ArrayList;
import java.util.List;

public class Product {
         private double Id;
	private String nazwa;
	public String type;
        private String cena;
    
    public Product(double Id,String nazwa, String type,String cena) {
            
                this.nazwa = nazwa;
		this.type = type;
		this.cena = cena;
                this.Id = Id;
                
		

	}
    
    public double getId() {
    return Id;
}

public String getnazwa() {
    return nazwa;
}
    public String gettype() {
    return type;
}

public String getcena() {
    return cena;
} 

     public void setId(double Id) {
        this.Id = Id;
    }

    public void setnazwa(String nazwa) {
        this.nazwa = nazwa;
    }
   
    
    public void settype(String type) {
        this.type = type;
    }

    public void setcena(String cena) {
        this.cena = cena;
    }
   
    @Override
	public String toString() {
		return Id + " " + nazwa + " " + type+" "+cena;
	}

}
