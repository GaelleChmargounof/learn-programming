package ascii;

import ascii.big.FontBig;
import ascii.big.FontBigInterface;
import font.CaracterInterface;

public class Ascii
{

    // char fooo;
    public static void main(String[] args)
		{
        
		
		// ici on a le mot static, means qu'il n'y a pas de référence à this possible
		//means que fooo (si il était vraiment écrit), n'appartient pas à l'objet à this=objet en cours de manip
		//MAIS  appartient à la classe indetifié pas Ascii
		//et idemn pour les méthodes
		
		
		    FontBigInterface font                  = new FontBig();
		    CaracterInterface caracter             = font.getCaracter('d');
		    CaracterInterface[] caracterCollection = new CaracterInterface[1];
		    caracterCollection[0]                  = caracter;
		    
		    //Character.MIN_VALUE ! = definition [i][k]
/**
 * Itération od number of line		    		       
 */
		    for (int i = 0; i <font.getLineHeight(); i++)  
		    {
		        /**
                 * Iteration of number of caracters
                 */
                for (int j = 0 ; j < caracterCollection.length; j++ )
                {
                    char [][] definition = caracter.toAscii();
                    char current = font.getSymbolDefault();
                   
                    /**
                     * Iteration of number of symbol
                     */
                    for ( int k = 0; k < definition[i].length ; k++ ) 
                    {
                        if (Character.MIN_VALUE != definition[i][k] && current != definition [i][k])   
                        {
                            current = definition[i][k] ; 
                            

                        } 
                      
                        System.out.print(current);
                    }
                    System.out.println("");

                }  
		    }
 	       	    
		   
		}
			
}
