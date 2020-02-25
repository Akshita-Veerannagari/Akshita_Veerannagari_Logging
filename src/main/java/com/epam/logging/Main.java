package com.epam.logging;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main 
{
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	 public static void main( String[] args )
	    {
	        Scanner sc=new Scanner(System.in);
	        InterestCalc interestCalcObj =new InterestCalc();
	        HouseConstrCost houseConstrCost;
	        //PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
	        LOGGER.info("INTEREST CALCULATION:");
	        LOGGER.info("Select an option \n1.Simple Interest 2.Compound Interest");
	        if(sc.nextInt()==1) {
	        	LOGGER.info("Enter principal, rate of interest and time in years");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	LOGGER.info("Simple Interest is: "+interestCalcObj.simpleInterest(principal, rate, timeInYears)+"\n");
	        }
	        else {
	        	LOGGER.info("Enter principal, rate of interest and time in years and number of times interest is compounded in an year");
	        	double principal=sc.nextDouble();
	        	double rate=sc.nextDouble();
	        	double timeInYears=sc.nextDouble();
	        	int noOfTimesInterestCompoundedInYear=sc.nextInt();
	        	LOGGER.info("Amount is: "+interestCalcObj.compoundInterest(principal, rate, timeInYears,noOfTimesInterestCompoundedInYear)+"\n");
	        }
	        LOGGER.info("HOUSE CONSTRUCTION\nEnter material standard(1.standard 2.above standard 3.high standard) and total area of house");
	        int standard=sc.nextInt();
	        double area=sc.nextDouble();
	        if(standard==3){
	        	LOGGER.info("Do you want the house to be fully automated?\n 1.Yes 2.No");
	        	int option=sc.nextInt();
	        	houseConstrCost=new HouseConstrCost(standard,area,option==1?true:false);
	        	LOGGER.info("Total cost required: "+houseConstrCost.cost());
	        }
	        else {
	        	houseConstrCost=new HouseConstrCost(standard,area);
	        	LOGGER.info("Total cost required: "+houseConstrCost.cost());
	        }
	        sc.close();
	    }
}