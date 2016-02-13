/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.TextField;

/**
 *

 */
public class testProject {

    /**
     * @param args the command line arguments
     */
	
	public static String result="";
	public static float totalCost =0.0f; 
	
    public static void main(String[] args) {
        // TODO code application logic here
    	
        //For counting the number of lines in transaction.txt
        TextFileInput temp = new TextFileInput("database.txt");
        //For reading database.txt
        TextFileInput fDB = new TextFileInput("database.txt");
        //For reading transaction.txt
        TextFileInput fTR = new TextFileInput("transaction.txt");
        
        Database db = new Database();
        

        //temp.getLineCount() will get the number of lines in transaction.txt
        int flag = 0;
        while (true) {
            String s = temp.readLine();
            flag++;
            if (flag > 100) {
                break;

            }
        }
        temp.close();

        for (int i = 0; i < temp.getLineCount(); i++) {
            String trans = fDB.readLine();
            String[] parts = trans.split(",");   //will split the string  ","
            //System.out.println(parts[2]);
            float pr = Float.parseFloat(parts[2]);
            ProduceItem pItem = new ProduceItem(parts[0], parts[1], pr);
            db.itemAra[Database.index] = pItem;
            Database.index++;
        }
        
        //Read Transaction
        temp = new TextFileInput("transaction.txt");
        
        //get line count
        flag = 0;
        while (true) {
            String s = temp.readLine();
            flag++;
            if (flag > 100) {
                break;

            }
        }
        temp.close();
       
     
        
        for (int i = 0; i < temp.getLineCount(); i++){
            String trans = fTR.readLine();
            String[] parts = trans.split(",");   //will split the string  ","
            //System.out.print("Name : " + db.getName(parts[0]) + "\t");
            //System.out.print("Price : " + db.getPrice(parts[0]) + "\t");
            //System.out.print("Weight : " + parts[1] + "\t");
            
            result+= "Name : " + db.getName(parts[0]) + "\t" ;
            result+= "Price : " + db.getPrice(parts[0]) + "\t";
           	result+= "Weight : " + parts[1] + "\t";
           
            float cost = Float.parseFloat(parts[1]) * db.getPrice(parts[0]);
            result+= "Total Cost : " + cost + "\n";
            
            //System.out.print("Total Cost : " + cost + "\n");
            totalCost+= cost ; 
           
        }
        System.out.println( result);
        //System.out.print("Altogether it costs "+ totalCost);
        
    }

}
