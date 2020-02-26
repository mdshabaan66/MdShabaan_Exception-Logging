package com.Logger.shabaan.Logger.shabaan;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleAndCompoundInterest {
	static final Logger LOGGER = LogManager.getLogger(SimpleAndCompoundInterest.class);
	private double compound_Interest,rate_Of_Interest,number_Of_Years,principle,Amount;
	public void simple(){
		double  simple_Interest;
		LOGGER.debug("Enter Principle:");
		//System.out.printf("Enter Principle:");
	//	System.out.printf("\n");
		Scanner sc=new Scanner(System.in);
		principle=sc.nextDouble();
		LOGGER.debug("Enter rate of Interest:");
		//System.out.print("Enter rate of Interest:");
		rate_Of_Interest=sc.nextDouble();
		LOGGER.debug("Enter Time in Year:");
		//System.out.print("Enter Time in Year:");
		number_Of_Years=sc.nextDouble();
		simple_Interest=(principle*rate_Of_Interest*number_Of_Years)/100;
		LOGGER.debug("Simple Interest="+ simple_Interest);
	//	System.out.printf("Simple Interest="+ simple_Interest);
	//	System.out.printf("\n");
	}
	public void compound() {
		double compound_Interest,amount;
		LOGGER.debug("Enter Principle:");
		//System.out.printf("Enter Principle:");
	//	System.out.printf("\n");
		Scanner sc=new Scanner(System.in);
		principle=sc.nextDouble();
		LOGGER.debug("Enter rate of Interest:");
		//System.out.print("Enter rate of Interest:");
		rate_Of_Interest=sc.nextDouble();
		LOGGER.debug("Enter Time in Year:");
	//	System.out.print("Enter Time in Year:");
		number_Of_Years=sc.nextDouble();
		amount=principle*(Math.pow((1+(rate_Of_Interest/100)),number_Of_Years));
		compound_Interest=amount-principle;
		LOGGER.debug("Compound Interest="+compound_Interest);
	//	System.out.printf("Compound Interest="+compound_Interest);
	//	System.out.printf("\n");
		
	}
}

