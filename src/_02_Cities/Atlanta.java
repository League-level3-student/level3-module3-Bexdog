package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double end = 0;
	end = getGrowthRate()*2*getPopulation();
	return end;
	}

}
