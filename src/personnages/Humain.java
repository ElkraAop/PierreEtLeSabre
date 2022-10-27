package personnages;

public class Humain {
	
private String nom;
private String sodaPref;
private int argent;



public Humain(String nom, String sodaPref, int argent) {
	this.nom = nom;
	this.sodaPref = sodaPref;
	this.argent = argent;
}

public void direBonjour() {
	parler("Bonjour ! Je m'appelle "+ this.nom +" et j'aime boir du "+this.sodaPref);
}

public void boire() {
	parler("Mmmm, un bon verre de "+this.sodaPref+ "! GLOUPS !");
}

public void acheter(String bien, int prix) {
	if(this.argent<prix) {
		parler("Je n'ai plus que "+this.argent+ " sous en poche. Je ne peux même pas m'offrir un "+bien+" a "+prix + "sous");
	}else {
		parler("J'ai "+this.argent+ " sous en poche. Je vais pouvoir m'offrir une "+bien+" a "+prix + "sous");
		perdreArgent(prix);	
	}

}
public void gagnerArgent(int gain) {
	this.argent+= gain;
}
public void perdreArgent(int perte) {
	this.argent-= perte;
	if(this.argent<0)
		this.argent = 0;
	
}
private void parler(String texte) {
	System.out.println("("+this.nom+") - "+texte);
}

public String getNom() {
	return nom;
}
public int getArgent() {
	return argent;
}

}
