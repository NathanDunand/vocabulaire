package anglais;

/**
 * Un couple de mot
 * @author Nathan DUNAND, Université de Lorraine
 */
public class Mots {

	private String francais;
	private String anglais;

	public Mots(String francais, String anglais){
		this.francais=francais;
		this.anglais=anglais;
	}

	public Mots(){
		this.francais="";
		this.anglais="";
	}

	public String getFrancais(){
		return this.francais;
	}

	public String getAnglais(){
		return this.anglais;
	}

	public void setFrancais(String francais){
		this.francais=francais;
	}

	public void setAnglais(String anglais){
		this.anglais=anglais;
	}

	public String toString(){
		return "Couple{" +
                "francais=" + francais +
                ", anglais=" + anglais +
                '}';
	}
}