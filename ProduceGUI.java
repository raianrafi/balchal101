import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class ProduceGUI extends JFrame{
	
	public JMenuBar    menuBar  = new JMenuBar();
	public ProduceGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
       setLocation  (400,200);
	    
       createFileMenu();
	    
	   createDatabase();
       
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
   } 

   private void createFileMenu( ) {
      JMenuItem   item;
     
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);

      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );

      fileMenu.addSeparator();           //add a horizontal separator line
    
      item = new JMenuItem("Quit");       //Quit
      item.addActionListener( fmh );
      fileMenu.add( item );

      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
    
   } //createMenu
   
   private void createDatabase(){
	   JMenuItem   item;
	      
	      JMenu       fileMenu = new JMenu("Database");
	      DatabaseMenuHandler fmh  = new DatabaseMenuHandler(this);

	      item = new JMenuItem("Open");    //Open...
	      item.addActionListener( fmh );
	      fileMenu.add( item );

	      fileMenu.addSeparator();           //add a horizontal separator line
	    
	      item = new JMenuItem("Display Fruits");       //Quit
	      item.addActionListener( fmh );
	      fileMenu.add( item );
	      
	      fileMenu.addSeparator();           //add a horizontal separator line
		    
	      item = new JMenuItem("Display Vegetables");       //Quit
	      item.addActionListener( fmh );
	      fileMenu.add( item );
	      

	      setJMenuBar(menuBar);
	      menuBar.add(fileMenu);
	   
	   
	   
   }

} 
