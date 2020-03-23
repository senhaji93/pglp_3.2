package senhaji_abdellatif;

public class Vendeur extends Employe {
	private double commission;
	
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
}
