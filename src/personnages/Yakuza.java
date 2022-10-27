package personnages;

public class Yakuza extends Humain {
private String clan;
private int reputation;

	public Yakuza(String nom, String sodaPref, int argent,String clan) {
		super(nom, sodaPref, argent);
		this.clan = clan;
		this.reputation = 0;
	}
	public void extorquer(Commercant victime) {
		super.parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		super.parler(victime.getNom()+"si tu tiens � la vie donne moi ta bourse !");
		int money = victime.seFaireExtorquer();
		super.gagnerArgent(money);
		super.parler("J�ai piqu� les "+money+ "sous de "+victime.getNom()+"ce qui me fait "+this.getArgent()+"sous dans ma poche. Hi! Hi!");
	}
	public int perdre() {
		parler("J�ai perdu mon duel et mes " +this.getArgent()+"sous, snif... J'ai d�shonor� le clan de" +this.clan);
		int money =this.getArgent();
		super.perdreArgent(this.getArgent());
		this.reputation --;
		return(money);
	}
	public void gagner(int argent) {
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+ this.clan + "? je l'ai d�pouill� de ses"+argent+"sous");
		this.gagnerArgent(argent);
		this.reputation ++;
	}
	public int getReputation() {
		return reputation;
	}
}
