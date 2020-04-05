package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList <Animal> farm = new ArrayList <Animal>();
	farm.add(new Pig());
	farm.add(new Cow());
	farm.add(new Sheep());
	farm.add(new Chicken());
	farm.add(new Chicken());
	farm.add(new Cow());
	for(Animal i: farm) {
		i.makeNoise();
		if(i instanceof Pig) {
			Pig p = (Pig)i;
			p.wallowInMud();
		}
		else if(i instanceof Cow) {
			Cow c = (Cow)i;
			c.getMilked();
		}
		else if(i instanceof Sheep) {
			Sheep s = (Sheep)i;
			s.getSheared();
		}
		else if(i instanceof Chicken) {
			Chicken c = (Chicken)i;
			c.layEgg();
		}
	}
}
}
