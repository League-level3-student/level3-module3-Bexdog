package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double end = 0;
		end = getGrowthRate()*getPopulation()*(getGrowthRate()/2);
		return end;
	}
	
}
