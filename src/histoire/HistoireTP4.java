package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		Commercant Marco = new Commercant("Marco",54);
		Marco.direBonjour();
		Marco.seFaireExtorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza jean = new Yakuza("Yaku Le Noir","whisky",30,"Le clan chauveSourire");
		jean.extorquer(Marco);
	}
}
