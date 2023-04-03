package ue5.k8055.process;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class StrucEntrees implements Cloneable{
	
	// Entrées analogiques (0 - 255)
	public  int AnaE1=0;
	public  int AnaE2=0; 
	
	// Entrées Digitales (0 - 1)
	public  boolean DE1=false;
	public  boolean DE2=false;
	public  boolean DE3=false;
	public  boolean DE4=false;
	public  boolean DE5=false;
	
	// Redéfinition de la méthode clone de la classe
	public Object clone() {
		Object o= null;
		try {
			o = super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			
		}
		return o;
	}	
}
