
public class PersonelDogrulama {
       public boolean personelUygunMu(Personel personel) {
       if(personel.personelMaas<15000 && personel.personelSehir == "Bursa") {
    	   return true;
       }
       else {
    	   return false;
       }
       
   }
}
       

