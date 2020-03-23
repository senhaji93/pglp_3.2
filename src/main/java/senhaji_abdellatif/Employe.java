package senhaji_abdellatif;

public class Employe implements Salarie {
	
	private int nbAnnees;
	private Coordonnees coordonnees;
	
	public double calculSalaire() {
		return 1500 + nbAnnees * 20;
	}
	public String getCoordonnees() {
		return coordonnees.toString();
	}
	
	
	
}
