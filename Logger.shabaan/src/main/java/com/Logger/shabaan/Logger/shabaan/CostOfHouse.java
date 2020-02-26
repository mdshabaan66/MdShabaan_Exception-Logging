package com.Logger.shabaan.Logger.shabaan;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CostOfHouse {
	static final Logger LOGGER = LogManager.getLogger(CostOfHouse.class);
	public void constructionOfHouse() {
		int choice;
		double  area,total_Amount;
		LOGGER.debug("********Value of House**********");
		Scanner ss=new Scanner(System.in);
		LOGGER.debug("Enter the Area of House in Square Meter");
		area=ss.nextDouble();
		LOGGER.debug("Enter the Choice");
		LOGGER.debug("1.Standered Materials");
		LOGGER.debug("2.Above Standered Materials");
		LOGGER.debug("3.High Standered Materials");
		LOGGER.debug("4.High Standered Materials And Fully Automated");
		choice =ss.nextInt();
		switch(choice)
		{
			case 1:
			{
				total_Amount=1200*area;
				LOGGER.debug("Total Cost ="+ total_Amount);
				break;
			}
			case 2:
			{
				total_Amount=1500*area;
				LOGGER.debug("Total Cost ="+ total_Amount);
				break;
			}
			case 3:
			{
				total_Amount=1800*area;
				LOGGER.debug("Total Cost ="+ total_Amount);
				break;
			}
			case 4:
			{
				total_Amount=2500*area;
				LOGGER.debug("Total Cost ="+ total_Amount);
				break;
			}
			default:
				LOGGER.debug("Wrong choice");
				break;
			}
		}

}

