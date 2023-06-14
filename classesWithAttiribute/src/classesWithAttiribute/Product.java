package classesWithAttiribute;

public class Product {
	//      Constructor
	      public Product(int id, String _name,String _detay, double _fiyat,int _stokAdet) {
	    	  System.out.println("Yapici Blok Calisti");
	    	  this._id=id;
	    	  this._name=_name;
	    	  this._detay=_detay;
	    	  this._fiyat=_fiyat;
	    	  this._stokAdet=_stokAdet;
	      } 
	       //Attiribute ya da Field denir
	        int _id;
            String _name;
            String _detay;
            double _fiyat;
            int _stokAdet;
           //getter
           public int getId() {
        	   
        	   return _id;
           }
           //setter
           public void setId(int id) {
        	   _id= id;
           }
		private String get_name() {
			return _name;
		}
		private void set_name(String name) {
			this._name = _name;
		}
		private int get_stokAdet() {
			return _stokAdet;
		}
		private void set_stokAdet(int stokAdet) {
			this._stokAdet = _stokAdet;
		}
		private double get_fiyat() {
			return _fiyat;
		}
		private void set_fiyat(double fiyat) {
			this._fiyat = _fiyat;
		}
		private String get_detay() {
			return _detay;
		}
        public String getKod() {
        	return this._name.substring(0,1) + _id;
        };
    
}

