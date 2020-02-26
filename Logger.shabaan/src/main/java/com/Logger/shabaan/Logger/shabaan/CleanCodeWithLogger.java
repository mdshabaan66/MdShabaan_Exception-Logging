package com.Logger.shabaan.Logger.shabaan;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CleanCodeWithLogger {
	static final Logger LOGGER = LogManager.getLogger(CleanCodeWithLogger.class);
	public static void main(String[] args) {
		int choice;
		//System.out.println("*********Interest*********");
		LOGGER.debug("*********Interest*********");
		SimpleAndCompoundInterest s=new SimpleAndCompoundInterest();
		LOGGER.debug("Enter the Choice");
		//System.out.println("Enter the Choice");
		//System.out.println("1.Simple Interest");
		LOGGER.debug("1.Simple Interest");
	//	System.out.println("2.Compound Interest");
		LOGGER.debug("2.Compound Interest");
		Scanner sc =new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				s.simple();
				break;
			}
			case 2:
			{
				s.compound();
				break;
			}
			default:
			{
				LOGGER.debug("Wrong Input");
			//	System.out.println("Wrong Input");
				break;
			}
		}
		CostOfHouse C=new CostOfHouse();
		C.constructionOfHouse();
	}

}
