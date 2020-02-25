package com.epam.logging;

public class HouseConstrCost {
	int standard;
	double area;
	boolean fullyAutomated;
	HouseConstrCost(int standard,double area)
	{
		this.area=area;
		this.standard=standard;
	}
	HouseConstrCost(int standard,double area,boolean fullyAutomated)
	{
		this.area=area;
		this.fullyAutomated=fullyAutomated;
		this.standard=standard;
	}
	public double cost() 
	{
		double finalCost=0;
		switch(standard) 
		{
			case 1: finalCost= 1200*area;
	                break;
			case 2: finalCost= 1500*area;
	                      break;
			case 3: if(fullyAutomated) finalCost= 2500*area;
	                     else finalCost= 1800*area;
		}
		return finalCost;
	}
}