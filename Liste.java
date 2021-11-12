import java.util.ArrayList;
import java.util.Collections;

public class Liste{

	private ArrayList<Mots> liste;

	public Liste(){
		this.liste = new ArrayList<Mots>();
	}

	public void ajouter(Mots... couples){
		for(Mots c : couples){
			this.liste.add(c);
		}
	}

	public void ajouter(Mots m){
		this.liste.add(m);
	}

	public int getNombreDeMots(){
		return this.liste.size();
	}

	public Mots getMots(int a){
		return this.liste.get(a);
	}

	public void melanger(){
		Collections.shuffle(this.liste);
	}

	public Mots getFirst(){
		return this.liste.get(0);
	}

	public String toString(){
		StringBuilder s=new StringBuilder();

		for(Mots c : this.liste){
			s.append(c.toString()+"\n");
		}
		return s.toString();
	}
}
