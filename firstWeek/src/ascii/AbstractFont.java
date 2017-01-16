package ascii;

public abstract class AbstractFont extends font.AbstractFont // AbstractFont = parent de abstrat font
{
	
	protected char symbolDefault; /**  attribut dans UML **/
	
	protected abstract void initSymboltDefault();
	
	protected AbstractFont()
	
	/**  méthode  **/
	{
		
		/**  super = parents, on appelle le constructeur parent **/
		super();
		this.initSymboltDefault();
	}
	
	public char getSymbolDefault()
	{
		return this.symbolDefault;
		
	}
	

}
