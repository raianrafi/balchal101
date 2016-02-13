
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.*;
public class FileMenuHandler implements ActionListener {

	JFrame jframe;
	   public FileMenuHandler (JFrame jf) {
	      jframe = jf;
	   }
	   public void actionPerformed(ActionEvent event) {
	      String  menuName;
	      menuName = event.getActionCommand();
	      if (menuName.equals("Open"))
	         openFile( ); 
	      else if (menuName.equals("Quit"))
	         System.exit(0);
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
	  
	    
	   
	    
	    
	    private void readSource(File chosenFile){
	       String chosenFileName = chosenFile.getPath();
	       TextFileInput in2 = new TextFileInput(chosenFileName);
	       
	       //create two arrays for the information read from transaction.txt        	  
	        String [] TranCode = new String[20];
		      float [] TranWeight = new float[20];
	      
 	      //read text file
 	      
 	   
 	      //read the first line   	   
 	      String Line = in2.readLine(); 
           //declare and initialize i as count
 	      int i=0;
 	      //while line is not empty, keep reading
           while(Line !=null){
 	          //read each token on th eline
               StringTokenizer TranTokens = new StringTokenizer(Line, ",");
 	          //store each token to the appropriate arrays
 		      TranCode[i] = TranTokens.nextToken();
 		      TranWeight[i] =Float.parseFloat(TranTokens.nextToken());  
 		      i++;
 		      Line = in2.readLine();
 	      }
 	  
           in2.close();
           
           
           //create Database object 
          
           
   	      //call CreateList method
   	     
   	      //start to store output into the string named "result"
   	      String result ="Name"+"\t"+"Price"+"\t"+"Weight"+"\t"+"Total Cost"+"\n";
   	  
   	      //store each items on the text file into the String "result"
   	      
   	      for(int j =0; j<i; j++){
   	      
   	    	  
   	    	  
   	      try{
   		  result += DatabaseMenuHandler.db.getName(TranCode[j])+ "\t";}
   	      catch(ItemNotFoundException e){ System.out.println("Item is not found in the databse");}
   	      
   	     // finally{ result += "null"+ "\t";}
   		
   		if(DatabaseMenuHandler.db.getPrice(TranCode[j]) == 0)
   		
   		{
   			
   			result += JOptionPane.showInputDialog(null,"Enter the price this missing item:");
   			 result += "\t";}
   		  
   		else
   		  result += DatabaseMenuHandler.db.getPrice(TranCode[j])+ "\t";
   		
   		  result += TranWeight[j]+ "\t";
   		  
   		  result += DatabaseMenuHandler.db.getPrice(TranCode[j])*TranWeight[j]+"\t"+"\n";
   		
   	      }
   		  
   	    	  
   	      
   	  
          float sum=0;
          //get the sum of the totals
          for(int s=0; s<i; s++){
     	 
         	 sum += DatabaseMenuHandler.db.getPrice(TranCode[s])*TranWeight[s];
           }
          //DecimalFormat to print the total bil using only two decimal places
          sum = Float.parseFloat(new DecimalFormat("##.##").format(sum));
          //store the last information into "result"
          result = result +"The total cost of all purchases is "+sum+"\n";
     	 //create ReceiptGUI object
          gui receipt = new gui();
          //call the CreateGui method to output the results in gui.
          receipt.CreateGui(result);
           
           
          
   }
   }

                









           
           
           
           
          

	    
	 