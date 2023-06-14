package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava cok güzel.";
		mesaj.substring(0,2);
		int sayi = topla(5,13);
		String sehir= sehirVer("Bursa");
		System.out.println(sehir + " " + sayi);
		int toplam = topla2(5,3,5,1,2);
		System.out.println(toplam);

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");	
	}
    public static void guncelle() {
    	System.out.println("Guncellendi");
    }
    public static int topla(int sayi1,int sayi2) {
    	return sayi1+sayi2;
    }
    public static String sehirVer(String sehir) {
        return sehir;
    }
    public static int topla2(int...sayilar) {
    	int toplam =0;
    			for(int sayi:sayilar) {
    				toplam+=sayi;
    			}
    			return toplam;	
    }
    }
