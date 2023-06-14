package oopIntro2;

public class Main {

	public static void main(String[] args) {
//	       String[] urunler = {
//	    		   "Casper v14",
//	    		   
//	       };
//	       int[] stokAdedi = {
//	    		   
//	       };
//	       bu tarz yazmak yerine objelerle çalışacağız.
		Urunler urun1 = new Urunler(1,"Casper",15000,"Güzel"); // Örnek oluşturma / instance oluşturma /Referans olusturma
		urun1.id =1;
		urun1.name="Casper 14";
		urun1.birimFiyati=15000;
//        		
		Urunler urun2 = new Urunler(3,"Lenovo 14",15000,"16gb ram"); // Örnek oluşturma / instance oluşturma /Referans olusturma
		urun2.id =3;
		urun2.name="Lenovo 14";
		urun2.birimFiyati=15000;
		urun2.urunDetay="16gb ram";
		
		Urunler urun3 = new Urunler(4,"HP 14",15000,"16gb ram"); // Örnek oluşturma / instance oluşturma /Referans olusturma
		urun3.id =4;
		urun3.name="HP 14";
		urun3.birimFiyati=15000;
		urun3.urunDetay="16gb ram";
//		
		Urunler urun4 = new Urunler(5,"Msi 14", 15000, "16gb ram"); // Örnek oluşturma / instance oluşturma /Referans olusturma
		urun4.id =5;
		urun4.name="Msi 14";
		urun4.birimFiyati=15000;
		urun4.urunDetay="16gb ram";
//		
		
		
		Urunler[] urunlerim = {urun1,urun2,urun3,urun4};
		
		for (Urunler urunler : urunlerim) {
			System.out.println(urunler.name);
		}
		
		System.out.println(urunlerim.length);
          		Kategori kategori1 = new Kategori();
		kategori1.id=1;
		kategori1.name="Bilgisayarlar";
		
		Kategori kategori2 = new Kategori();
		kategori2.id=1;
		kategori2.name="Ev Bahçe";
		
		UrunlerMenajer urunMenajeri = new UrunlerMenajer();
		urunMenajeri.sepeteEkle(urun1);
		urunMenajeri.sepeteEkle(urun2);
		urunMenajeri.sepeteEkle(urun3);
	}

}
