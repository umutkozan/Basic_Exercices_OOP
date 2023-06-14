package inheritance;

public class Main {

	public static void main(String[] args) {
       IndividualCustomer umut = new IndividualCustomer();
       umut.customerNumber="12345 bireysel ";  
      
       CorporateCustomer hepsiBurada = new CorporateCustomer();
       hepsiBurada.companyName="9876 kurumsal ";
       
       sendikaCustomer sendika = new sendikaCustomer();
       sendika.customerNumber="9999 Sendika";
       
       
       CustomerManager customerManager = new CustomerManager();
       Customer[] customers = {umut, hepsiBurada,sendika};
       customerManager.addMultiple(customers);

	}

}
