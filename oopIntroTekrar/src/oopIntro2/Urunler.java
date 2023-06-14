package oopIntro2;

public class Urunler {
	   int id;
       String name;
       double birimFiyati;
       String urunDetay;
       public Urunler() {
    	   System.out.println("Ben çalistim");
       }
       public Urunler(int id,String name,double birimFiyati,String urunDetay) {
    	   this();
    	   this.id=id;
    	   this.name=name;
    	   this.birimFiyati=birimFiyati;
    	   this.urunDetay=urunDetay;
       }
}
