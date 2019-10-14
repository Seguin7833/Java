import java.util.HashMap;

public class Jardin {
	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;

	public Jardin(int longu, int larg) {
		this.panier = new HashMap<String, Integer>();
		this.panier.put("Ail",4);
		this.panier.put("Carotte",4);
		this.panier.put("Betterave",7);
		this.longueur = longu;
		this.largeur = larg;
		emplacement = new Emplacement[longu][larg];
		
	}
}
