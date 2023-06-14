package diziler;

public class dizileriki {

	public static void main(String[] args) {
		double[] myList = {1.3,1.2,2.5,3.6,5.3};
		double total=0;
		double enBuyuk = myList[0];
        for (double number:myList){
        	if(enBuyuk<number) {	
        		enBuyuk = number;	
        	}
        	total = total + number;
        	System.out.println(number);
        }
            System.out.println("Toplam =" + total);
            System.out.println("En buyuk= " + enBuyuk);
     }
}

