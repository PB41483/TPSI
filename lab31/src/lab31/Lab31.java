/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab31;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.io.*;



/**
 *
 * @author pb41483
 */


public class Lab31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
    
        Set<String> zbiorDni = new TreeSet<>();
        zbiorDni.add("poniedziałek");
zbiorDni.add("wtorek");
zbiorDni.add("sroda");
zbiorDni.add("czwartek");
zbiorDni.add("piatek");
zbiorDni.add("sobota");
zbiorDni.add("niedziela");

for(String dzien : zbiorDni) {
    System.out.println(dzien);
}
       



        Map<String, Person> osoby = new HashMap<>();
       
        osoby.put("Fizyka", new Person("Jan1", "Kowalski1","@jkowalski1@zut.edu.pl"));
        osoby.put("Matematyka", new Person("Jan2", "Kowalski2","@jkowalski2@zut.edu.pl"));
        osoby.put("W-F", new Person("Jan3", "Kowalski3","@jkowalski3@zut.edu.pl"));
        osoby.put("Programowanie obiektowe", new Person("Jan4", "Kowalski4","@jkowalski4@zut.edu.pl"));
        osoby.put("Biologia", new Person("Jan5", "Kowalski5","@jkowalski5@zut.edu.pl"));
        
       
        
for(String skrot2 : osoby.keySet()) {
    if(skrot2=="Programowanie obiektowe"){
     Person nauczyciel = osoby.get(skrot2);
      System.out.println(nauczyciel);
    }
}


        Person s1 = new Student("Jan", "Chleb", "cxvxcv@wi.zut.edu.pl");
	Person s2 = new Student("Hermenegilda", "Nowak", "henowak@wi.zut.edu.pl");
        Person s3 = new Student("Pawel", "Kowalski", "dasdsa@wi.zut.edu.pl");
	Person s4 = new Student("asdz", "Nowak", "henowak@wi.zut.edu.pl");
        
        List<Person> grupa30 = new ArrayList<>();
        grupa30.add(s1);
        grupa30.add(s2);
        grupa30.add(s3);
        grupa30.add(s4);
        
        Person s5 = new Student("Stefan", "Zeromski", "zxcvb@wi.zut.edu.pl");
	Person s6 = new Student("Józef", "Wybicki", "abcd@wi.zut.edu.pl");
        Person s7 = new Student("Damian", "Sandov", "fse@wi.zut.edu.pl");
	Person s8 = new Student("Arnold", "Schwarzenegger", "cvxc@wi.zut.edu.pl");
        
        List<Person> grupa31 = new ArrayList<>();
        grupa31.add(s5);
        grupa31.add(s6);
        grupa31.add(s7);
        grupa31.add(s8);
        
        
        Person s9 = new Student("Marian", "Padzioch", "xvcbz@wi.zut.edu.pl");
	Person s10 = new Student("Ferdynand", "Kiepski", "453twgdf@wi.zut.edu.pl");
        Person s11 = new Student("Halinka", "Kiepska", "fse@wi.zut.edu.pl");
	Person s12 = new Student("Boczek", "Arnold", "cvxc@wi.zut.edu.pl");
        
        List<Person> grupa32 = new ArrayList<>();
        grupa32.add(s9);
        grupa32.add(s10);
        grupa32.add(s11);
        grupa32.add(s12);
        
        Map<Integer, List<Person>> grupy = new HashMap<>();
        
        grupy.put(32, grupa32);
        grupy.put(30, grupa30);
        grupy.put(31, grupa31);
    
        
        
        for(Integer skrot3 : grupy.keySet()) {
        if(skrot3==32){
        List uczen3 = grupy.get(skrot3);
        System.out.println(uczen3);
    }
}
        int i=1;
         List<Product> Lproduct = new ArrayList<>();
         
      
         
       Map<Double, Product> produkty5 = new HashMap<>();
        Map<String, List<Product>> Kategorie1 = new HashMap<>();
       
        List<Product> a = new ArrayList<>();
      try(BufferedReader in = new BufferedReader(new FileReader("produkty.txt"))) {

    String s = in.readLine();

    while(s!=null) {
        
        
        String[] pola = s.split(";");
        double d = Double.parseDouble(pola[0]);
        Product p1=new Product(d,pola[1],pola[2],pola[3]);
        Lproduct.add(p1);
        produkty5.put(d, p1);
       
        
        
       
        

        
        s = in.readLine();
      
    }
} catch (IOException ex) {
    ex.printStackTrace();
}
      
       
        for(double skrot4 : produkty5.keySet()) {
         if(skrot4==107){
        Product uczen3 = produkty5.get(skrot4);
        System.out.println(uczen3);
         }
    }
        
        for(Product produkt : Lproduct)	{ 
		if(Kategorie1.containsKey(produkt.type)) {
			List<Product> lista = Kategorie1.get(produkt.type);
			lista.add(produkt);
                        
		}else {
			List<Product> lista = new ArrayList<>();
			lista.add(produkt);
			Kategorie1.put(produkt.type, lista);
                        
		}
                
	}
  
    
        for(String skrot6 : Kategorie1.keySet()) {
            
        
       if(skrot6.equals("oprogramowanie")){
        List lista6 = Kategorie1.get(skrot6);
        System.out.println(lista6);
       }
        
}
    
      
    
    
    
    }}