package oopOdev;



public class Main {

	public static void main(String[] args) {
	     kamplar kamp1 = new kamplar(1,"Yazilim Gelistirici JS","Sifirdan Js Kampi","Ucretsiz","Engin");
         kamp1.id=1;
         kamp1.ad="Yazilim Gelistirici JS";
         kamp1.ayrinti="Sifirdan Js kampi";
         kamp1.ucret="Ucretsiz";
         kamp1.egitmen="Engin";
         
         kamplar kamp2 = new kamplar(2,"Yazilim Gelistirici Python","Sifirdan Python Kampi","Ucretsiz","Engin");
         kamp2.id=2;
         kamp2.ad="Yazilim Gelistirici Python";
         kamp2.ayrinti="Sifirdan Python kampi";
         kamp2.ucret="Ucretsiz";
         kamp2.egitmen="Engin";
         
         kamplar kamp3 = new kamplar(3,"Yazilim Gelistirici C#","Sifirdan C# Kampi","Ucretsiz","Umut");
	kamplar[] kamplar = {kamp1,kamp2,kamp3};
		
		for (kamplar kamp : kamplar) {
			System.out.println(kamp.ad);
		}

		baslaButon basla = new baslaButon();
		basla.basla(kamp1);
		basla.basla(kamp2);
		basla.basla(kamp2);
		
		bitirVeDevamEt bitir = new bitirVeDevamEt();
		bitir.bitirVeDevamEt(kamp1);
		bitir.bitirVeDevamEt(kamp2);
		bitir.bitirVeDevamEt(kamp3);
		
		
	}

}
