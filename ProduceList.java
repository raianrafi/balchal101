// LinkedList.java
// 
// This version uses three instance variables,
// a pointer to the first node, a pointer to
// the last node, and length, to make our
// append and getLength methods more efficient
// than the would be if our only instance
// variable were a pointer to the first node.
//
// This version uses a dummy first node.  Hence
// it needs less decision-making than it would
// need if a dummy first node were not used.
//

/**
 * Encapsulates a linked list of <code>String</code>.
 */
public class 	ProduceList  {

/**  First node in linked list - dummy node  */
   public ProduceNode first = new ProduceNode(null);

/**  Last node in linked list  */
   public ProduceNode last = first;

/**  Number of data items in the list.  */
   public int length = 0;

  /**
    * Gets the number of data values currently
    * stored in this LinkedList.
    *
    * @return the number of elements in the list.
    */

   public int getLength()  { 
      return length; 
   }


   /**
    * Appends a String data element to this
    * LinkedList.
    *
    * @param data the data element to be appended.
    */
   public void append(produceItem d)
   {

     //  write the code here for append
	   ProduceNode toAppend=new ProduceNode(d);
	   last.next=toAppend;
	   last=toAppend;
	   length++;
   }  // method append(String)


   
   

}  // class LinkedList

