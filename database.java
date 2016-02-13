/**
 * 
 * @author usaria jabin
 *
 */
public class database{
	         /**
	          * Object named ProduceList is created from ProduceItem Class
	          * 
	          */
	         public ProduceList LinkedList = new ProduceList();
	     
	         /**
	          * CreateList method used to create a linked list of ProduceItem
	          * by reading from a text file and filling the appropriate 
	          * parameters(code, name, and price) into the linked list
	          * @return void
	          */
	       
	         /**
	          * getName method used to return the name with
	          * a given code.
	          * @param code    the given code needed to return the name
	          * @return String the name returned
	          */
	         public String getName(String code) throws ItemNotFoundException{
	        	   
	        	   
	        	   ProduceNode p = LinkedList.first.next;
	        	   
	        	   for(int i=0; i<LinkedList.getLength(); i++)  
	        	   {   
	        		if( p.data.getCode().equals(code))
	        		
	        			return p.data.getName();
	        	   
	        	   p = p.next;
	        	   }
	        	   //return null;
	        	   throw new ItemNotFoundException("Item is not found in the database");
	        	    
	        		}
	        
	         /**
	          * getPrice method used to return price with
	          * a given code
	         * @param code  the given code needed to return the name
	         * @return float the price returned
	         */
	         public float getPrice(String code){
	        	
	        	   ProduceNode p = LinkedList.first.next;
	        	   for(int i=0; i<LinkedList.getLength(); i++)
	        		{
	        		   if(p.data.getCode().equals(code))
	        		
	        			return p.data.getPrice();
	        	   p = p.next;
	        		}
	        	        return 0.00f;       
	                }
	        
}
	   