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
		super.parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		super.parler(victime.getNom()+"si tu tiens à la vie donne moi ta bourse !");
		int money = victime.seFaireExtorquer();
		super.gagnerArgent(money);
		super.parler("J’ai piqué les "+money+ "sous de "+victime.getNom()+"ce qui me fait "+this.getArgent()+"sous dans ma poche. Hi! Hi!");
	}
	public int perdre() {
		parler("J’ai perdu mon duel et mes " +this.getArgent()+"sous, snif... J'ai déshonoré le clan de" +this.clan);
		int money =this.getArgent();
		super.perdreArgent(this.getArgent());
		this.reputation --;
		return(money);
	}
	public void gagner(int argent) {
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+ this.clan + "? je l'ai dépouillé de ses"+argent+"sous");
		this.gagnerArgent(argent);
		this.reputation ++;
	}
	public int getReputation() {
		return reputation;
	}
}
