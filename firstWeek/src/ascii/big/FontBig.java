package ascii.big;

import ascii.AbstractFont;
import font.CaracterInterface;

public class FontBig extends AbstractFont implements FontBigInterface
// FontBigInterface= la flèche qui va 
//de l'interface vers la classe
{
    
    private char car1; 
    private char car2; 
    private char car3;
    private char car4;
    private char car5; 

    public FontBig()

    {
        super(); // optionnel, super appelle le constructeur parent
        this.car1 = '_';
        this.car2 = '/';
        this.car3 = '\\';
        this.car4 = '|';
        this.car5 = ' ';
        
    
    }

    protected  void initLineHeight()
    {
        this.lineHeight = 6;
    }

    protected CaracterInterface createCaracter(char caracter)
    {
//        if('G' == caracter)
//        {
 //           return newG(this); 
            
//        } else if ('I' == caracter)
        {
//            return new I(this);
            
 //       }
    }
  
    return new G(this); 
    
    //return new G();  <----- c'était temporaire, remplacer par return new G (this);
    // il nous faut des caractères, C n'existe pas
    //on ne peut pas résoudre ce problème tant quon a pas les caracteres

    

    }

    protected void initSymboltDefault()
    {
        this.symbolDefault = ' ';
    }
    public char getCar1()
    {
        return this.car1;
    }
    public char getCar2()
    {
        return this.car2;
    }
    public char getCar3()
    {
        return this.car3;
    }
    public char getCar4()
    {
        return this.car4;
    }
    public char getCar5()
    {
        return this.car5;
    }
}
