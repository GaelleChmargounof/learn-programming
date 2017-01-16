package ascii.big;

import font.CaracterInterface;
import ascii.AbstractCaracter;

public class C extends AbstractCaracter implements CaracterInterface
{

    public C(FontBig font)  
    {

    this.definition = new char[font.getLineHeight()][8];
    
    }
    public String toString()
{
        return "C";
}
}
