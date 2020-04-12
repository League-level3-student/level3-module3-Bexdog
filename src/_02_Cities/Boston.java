package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
	double end = 0;
	end = getGrowthRate()*getPopulation()+(getPopulation()*0.5);
	return end;
	}

}
