/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Stephanie
 */
public class BeerSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Ninety_Nine_Bottles_of_Beer(99); 
    }
    
    public static void Ninety_Nine_Bottles_of_Beer(int x){
 
         if(x>1){
            System.out.print(x +" bottles of beer on the wall ," ); 
             System.out.print( x + " bottles of beer,\ntake one down, pass it around, " + (x-1)+ " bottles of beer on the wall. \n");
            Ninety_Nine_Bottles_of_Beer(x-1); //decrement the x value
}

else if(x<=1){
        System.out.println(x + " bottle of beer on the wall , "+ x + " bottle of beer\ntake one down, pass it around, no more bottles of beer on the wall"); 
        
      
    }
	
    }
}
    
