/**
 * @author usaria jabin
 *A class called fruits extended from ProduceItem with three instance variables 
 *for the code (String), name (String) and price (float). 
 *This class include appropriate constructors, get/set methods 
 *and overrides of class Object.
 *
 */
public class fruits extends produceItem {
	    
	          /**
               *instance variables code, name and price
               */
	           
	           private String code;
	           private String name;
	           private float price;
	    
	         //no-argument constructor
	         public fruits(){
	    	
	    	             code = "";
	    	             name = "";
	    	             price = 0.00f;
	          }
	    
	       //3-argument constructor
	        public fruits(String c, String n, float p){
	    	
	    	            code = c;
	    	            name = n;
	    	            price = p;
	          }
	        /**
	         *setter method
	         * @param c specified string
	         * @return void
             */	      
	         public void setCode(String c){
	    	
	    	             code = c;
	          }
	    
	       /**
	        *setter method
	        * @param n specified string
	        * @return void
            */	
	         public void setName(String n){
	     	
	                  	name = n;
	           }
	    
	       /**
	        *setter method
	        * @param p specified float
	        * @return void
            */	
	        public void setPrice(float p){
	    	
	                    	price = p;
	          }
        
	       /**
	        *getter method
	        * @param
	        * @return String get code
            */	
	        public String getCode(){
	    	
	                  	return code;
	         }
	    
	      /**
	       *getter method
	       * @param
	       * @return String get name
           */	
	       public String getName(){
	    	
	    	              return name;
	       }
	    
	      /**
	       *getter method
	       * @param
	       * @return float get price
           */	
	       public float getPrice(){
	    	
	    	             return price;
	        }
	    
	       //override with equals
	       public boolean equals(Object other){
	    	
	    	             return(other != null && getClass() == other.getClass() && 
	                	code.equals(((fruits) other).code) && 
	              	name.equals(((fruits) other).name) &&
	             	price == ((fruits) other).price);
	      	}
	    
	      //override with toString
	       public String toString(){
	    	
	                	return code +" "+name+ " "+ price ; 
	       }
}
