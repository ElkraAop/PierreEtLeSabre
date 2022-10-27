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
	public void provoquer(Yakuza adversaire) {
		parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if(this.honneur*2 >= adversaire.getReputation()) {
			parler("Je t’ai eu petit yakusa!");
			this.honneur ++;
			this.gagnerArgent(adversaire.perdre());
		}else {
			parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			this.honneur --;
			adversaire.gagner(this.getArgent());
			this.perdreArgent(this.getArgent());
		}
			
	}
}
