
public class Main {

	public static void main(String[] args) {
	    Personel person = new Personel();
	    PersonelManager personelmanag = new PersonelManager();
        person.personelad="Ahmet";
        person.personelid=5;
        person.personelMaas=16000;
        person.personelSehir= "Bursa";
        personelmanag.personelEkle(person);
	}

}
