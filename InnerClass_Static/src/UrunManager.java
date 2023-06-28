
public class UrunManager {
	public void add(Urunler urun)
   {
	   
	   UrunDogrulama urundogrula = new UrunDogrulama();
	   if(urundogrula.urunGecerliMi(urun)) {
		   System.out.println("Urun eklendi");
	   }
	   else {
		   System.out.println("Urun bilgileri eksik ya da gecersiz");
	   }
    
    
    }
}
