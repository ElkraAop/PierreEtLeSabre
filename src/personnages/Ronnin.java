package personnages;

public class Ronnin extends Humain{
private int honneur;

	public Ronnin(String nom, String sodaPref, int argent) {
		super(nom, sodaPref, argent);
		this.honneur = 1;
	}

	public void donner(Commercant beneficiaire) {
		int don = this.getArgent()/10;
		this.perdreArgent(don);
		super.parler(beneficiaire.getNom()+"prend ces "+don+" sous");
		beneficiaire.recevoir(don);
	}
}
