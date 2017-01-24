# learn-programming

A first start with JAVA: to display the ascii character G

# Prerequisites

This project require a Java worspace. Here Eclipse Java Neon was used.

# How does it work?
This project contains three packages:

1. Ascii package:
This package contains:
  -public class ascii
  -public abstract class AbstractCaracter
  -public abstract class AbstractFont
  -public interface FontInterface
  
  
  
 Thanks to ascii.big and font packages, it creates the character using loops.
 
 
 
 '''java
 for (int i = 0; i <font.getLineHeight(); i++)  
		    {
		        /**
                 * Iteration of number of characters
                 */
                 
                for (int j = 0 ; j < caracterCollection.length; j++ )
                {
                    char [][] definition = caracter.toAscii();
                    char current = font.getSymbolDefault();
                   
                    /**
                     * Iteration of number of symbols
                     */
                     
                    for ( int k = 0; k < definition[i].length ; k++ ) 
                    {
                        if (Character.MIN_VALUE != definition[i][k] && current != definition [i][k])   
                        {
                            current = definition[i][k] ; 
                        } 
  '''
  
 
 
2. Ascii.Big package
This package contains:
-public class FontBig 
-public interface FontBigInterface 
-public class G 

Here, each parts of the character G is declared.

public FontBig()
    {
        super();
        this.car1 = '_';
        this.car2 = '/';
        this.car3 = '\\';
        this.car4 = '|';
        this.car5 = ' ';
    }
    

3. Font package
This package contains:
-public abstract class AbstractFont
-public interface CaracterInterface
-public interface FontInterface 

It define the form of the character:

{
		this.initLineHeight();
		this.caracter =new CaracterInterface[255];
	}




