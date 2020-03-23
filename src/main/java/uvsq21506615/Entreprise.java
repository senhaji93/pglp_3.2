package uvsq21506615;


import java.util.List;
import java.util.ArrayList;

public class Entreprise {
	private List<Salarie> salarieList;
	public Entreprise() {
		salarieList = new ArrayList<Salarie>();
	}
	public double getSommeTotaleSalaires() {
		double sum = 0;
		for (Salarie s : salarieList) {
			sum = sum + s.calculSalaire();
		}
		return sum;
	}	
}