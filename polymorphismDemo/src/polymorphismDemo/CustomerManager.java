package polymorphismDemo;

public class CustomerManager {
	private BaseLogger Logger;
	public CustomerManager(BaseLogger logger) {
		 this.Logger=logger;
		 
	}
          public void add(){
        	  System.out.println("Müsteri Eklendi");
        	  this.Logger.log("Log mesaji");
          }
}
