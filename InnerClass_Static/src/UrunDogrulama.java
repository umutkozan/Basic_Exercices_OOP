
public class UrunDogrulama {
          public boolean urunGecerliMi(Urunler urun) {
        	  if(urun.ucret>0 && !urun.isim.isEmpty()) {
        		  return true;
        	  }else {
        		  return false;
        	  }
          }
          
    }
    
