package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

// création du caractere

public class G extends AbstractCaracter implements CaracterInterface
{
    
    public G(FontBig font)  
    {
        
        this.definition = new char[font.getLineHeight()][8];
                definition[0] [2] = 
                definition[1] [3] =    
                definition[2] [5] =    
                definition[3] [5] =    
                definition[4] [3] = 
                definition[5] [4] =
                definition[5] [2] =   font.getCar1();       
                definition[1] [1] =   font.getCar2();                        
                definition[5] [1] =   font.getCar3();                   
                definition[1] [7] = 
                definition[2] [0] =            
                definition[2] [2] =            
                definition[3] [0] =                
                definition[3] [2] = 
                definition[3] [4] =                            
                definition[3] [7] =    
                definition[4] [0] = 
                definition[4] [2] = 
                definition[4] [5] = 
                definition[4] [7] = 
                definition[5] [7] =    font.getCar4();
                definition[1] [2] = 
                definition[2] [1] =                
                definition[2] [3] =                
                definition[2] [7] =                
                definition[3] [1] =            
                definition[3] [3] =                    
                definition[3] [6] =        
                definition[4] [1] =
                definition[4] [6] =   font.getSymbolDefault();      
    }
    
    public String toString()
    {
        return "G";
    }
}

