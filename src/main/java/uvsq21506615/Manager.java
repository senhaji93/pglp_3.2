package uvsq21506615;

public class Manager extends Employe {
	private int nbSousFifres;
	
	public double calculSalaire() {
		return super.calculSalaire() + nbSousFifres * 100;
	}
	
}
