
public class PersonelManager {
	    
        public void personelEkle(Personel personel) {
        	
        PersonelDogrulama personeldogrula = new PersonelDogrulama();
       if(personeldogrula.personelUygunMu(personel)){
        	System.out.println("Personel Uygun");
        }else {
    	   System.out.println("Personel Uygun Degil");
       }
   }
}
//	   UrunDogrulama urundogrula = new UrunDogrulama();
//if(urundogrula.urunGecerliMi(urun)) {
//	   System.out.println("Urun eklendi");
//}
//else {
//	   System.out.println("Urun bilgileri eksik ya da gecersiz");
//}