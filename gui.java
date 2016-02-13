/**
 * @author usaria jabin
 * gui class is a graphical user interface for the
 * output of results
 */
import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class gui extends JFrame {
	
	
	
	        /**
             *CreateGui method to create a frame, content
             *and text area
             * @param result  this is type String used to output result
             * @return void
             */	
	        public void CreateGui(String result){
	        	
	        	//creates frame
	        	gui frame = new gui();
	        	  
	        	frame.setDefaultCloseOperation(gui.EXIT_ON_CLOSE);
	        	frame.setSize( 400,380);//width, height);
	            frame.setLocation(500,200);//x, y);
	              
	        	//create content pane 
	        	Container myContentPane = frame.getContentPane();
	        	//create text area
	        	TextArea textArea = new TextArea();
	        	//put the text area inside the content pane
	        	myContentPane.add(textArea);
	        	//put the results into the text area
	        	textArea.setText(result);
	        	
	        	frame.setVisible(true);
	       
}
	        
	
	
	            	
	            
	            
	            
	
}
