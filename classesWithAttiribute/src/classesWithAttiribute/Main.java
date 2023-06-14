package classesWithAttiribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop",3000,1400);
//		product._name = "Laptop";
//		product.setId(1);
//		product._fiyat=5300;
//		product._stokAdet=1300;
//		product._detay="Asus Laptop";
		
        ProductManager productManager = new ProductManager();
        productManager.ekle(product);
        System.out.println(product.getKod());
	}

}
