package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double end = 0;
		end = getGrowthRate()*getPopulation()+1000000;
		return end;
	}
}
