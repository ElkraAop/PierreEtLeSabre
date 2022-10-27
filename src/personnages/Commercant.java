package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int argent) {
		super(nom, "thé", argent);
	}
	public void seFaireExtorquer() {
		super.perdreArgent(this.getArgent());
		super.parler("J’ai tout perdu! Le monde est trop injuste...");
	}
	public void recevoir(int argent) {
		super.gagnerArgent(argent);
		super.parler(argent+" sous ! Je te remercie généreux donateur!");
	}
}
