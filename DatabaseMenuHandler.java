/**
 * @author usaria jabin
 *
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DatabaseMenuHandler implements ActionListener {
	
	          

	JFrame jframe;
	static database db = new database();
	//ProduceList LinkedList = new ProduceList();
    ProduceList VegetableList = new ProduceList();
    ProduceList FruitList = new ProduceList();
	
	
	   public DatabaseMenuHandler (JFrame jf) {
	      jframe = jf;
	   }
	   public void actionPerformed(ActionEvent event) {
	      String  menuName;
	      menuName = event.getActionCommand();
	      if (menuName.equals("Open"))
	         openFile( ); 
	      else if (menuName.equals("Display Fruits"))
	         DisplayFruits();
	      else if(menuName.equals("Display Vegetables"))
	    	     DisplayVegetables();
	   } //actionPerformed

	    private void openFile( ) {
	       JFileChooser chooser;
	       int          status;
	       chooser = new JFileChooser( );
	       status = chooser.showOpenDialog(null);
	       if (status == JFileChooser.APPROVE_OPTION) 
	          readSource(chooser.getSelectedFile());
	       else 
	          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
	    } //openFile
	    
	    private void readSource(File chosenFile2) {
		       String chosenFileName2 = chosenFile2.getPath();
		       TextFileInput in = new TextFileInput(chosenFileName2);
		      
		       
		      //  ProduceList LinkedList = new ProduceList();
		      // ProduceList VegetableList = new ProduceList();
		      //  ProduceList FruitList = new ProduceList();
		       
		       String line = in.readLine();
           	
               //declare and initialize i as count
               int i=0;
              
               
               //while the line is not empty, keep reading
           	while(line !=null){
       		//read each token, delimiter is ","
               StringTokenizer LineToken = new StringTokenizer(line, ",");
	        	//Each token is assigned to appropriate parameters of ProduceItem class
           String t = (LineToken.nextToken());
       		String c = (LineToken.nextToken());
       		String n = (LineToken.nextToken());
       		Float p = (Float.parseFloat(LineToken.nextToken()));
       		//a linked list of Producelist is created
       	
       		if(t.equals("V")){
       			produceItem List = new veg(c, n, p);
       			db.LinkedList.append(List);
       			VegetableList.append(List);
       		}
       		
       		if(t.equals("F")){
       			produceItem List = new fruits(c, n, p);
       			db.LinkedList.append(List);
       			FruitList.append(List);
       		}
       		
       	
       		
       		i++;
       		line = in.readLine();
       
       	    }
               in.close();
             
		       
	           
	    
	    
	    
	    
	    
	    
	    }
	    
	    
	    
	    
	    private void DisplayFruits(){
	    	
	    	            ProduceNode p = FruitList.first.next;
	    	            String result ="";
	    	            
	    	            
	    	            while(p!=null){
	    	            	
	    	            result += p.data;
	    	            result += "\n";
	    	            	p = p.next;
	    	            }
	    	           
	    	          gui FruitReceipt = new gui();
	    	            
	    	            FruitReceipt.CreateGui(result);
	        
	   	    	  
	   	    	       
	   		  
	   		  
	   		  
	   		   }
	   	  
	    private void DisplayVegetables(){
	    	
	    	  ProduceNode p = VegetableList.first.next;
	            String result ="";
	            
	            
	            while(p!=null){
	            	
	            result += p.data;
	            result += "\n";
	            	p = p.next;
	            }
	           
	            gui VegetableReceipt = new gui();
	            
	            VegetableReceipt.CreateGui(result);
	    	
	    	
	    	
	    	
	    	
	    }
	
	
	

}
