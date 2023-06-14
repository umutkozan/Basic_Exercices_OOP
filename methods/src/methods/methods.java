package methods;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();

	}
    public static void sayiBulmaca() {
    	
    		int[] sayilar = new int[] {1,2,5,7,9,11};
    		int aranacakSayi = 5;
    		boolean buldunMu = false;
    		for(int sayi : sayilar)	 {
    			if(sayi==aranacakSayi) {
    			     buldunMu = true;
    			     break;
    			}
    		}
    			 if(buldunMu)
    			 { 
    				 mesajVer("Aranan sayi bulundu : "+aranacakSayi);
    			 }
    			 else {
    				 System.out.println("Sayi bulunamadi : "+aranacakSayi);
    			 }
    			
    	}
    	 public static void mesajVer(String mesaj) {
    		System.out.println(mesaj);
    	 }
    }

