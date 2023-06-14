 package oopIntro;

public class Main {

	public static void main(String[] args) {
		 Product product1 = new Product(1,"Casper",10000,"1 gb ekran karti",10,9000);
//         product1.id=1;
//         product1.name="Casper";
//         product1.unitPrice=11400;
//         product1.detail="1GB Ekran karti";
         
         Product product2 = new Product();
         product2.setId(2);
         product2.setName("Lenovo 15");
         product2.setDetail("16 gb ram");
         product2.setDiscount(10);
         product2.setUnitPrice(16000);
         
         System.out.println(product2.getUnitPriceAfterDiscount());

     
         Product[] products = {product1,product2};
         for(Product product : products) {
        	 
         }
           Category category1 = new Category();
           category1.setId(1);
           category1.setName("İcecek");
           
           Category category2 = new Category();
           category1.setId(2);
           category1.setName("Yiyecek");
           System.out.println(category1.getName());
           System.out.println(category2.getName());
 }
//          private void product() {
//		}
//                  	  
}		