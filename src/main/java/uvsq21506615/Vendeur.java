package uvsq21506615;

public class Vendeur extends Employe {
	private double commission;
	
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
	
}