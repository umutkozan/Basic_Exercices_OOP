package interfacesAntrenman;




////	             private ICustomerDal customerDal;
//    public CustomerManager(ICustomerDal customerDal) {
// this.customerDal = customerDal;
//}
//    public void add() {
//    	customerDal.add();
public class MusteriManager  { 
	 private IMusteriDal musteriDal;
	 public MusteriManager(IMusteriDal musteriDal) {
		 this.musteriDal = musteriDal;
	 }
	 public void sil() {
		 musteriDal.sil();
	 }
    }
		
		


