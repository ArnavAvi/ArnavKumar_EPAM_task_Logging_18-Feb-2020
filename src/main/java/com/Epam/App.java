package com.Epam;

import com.Epam.HouseCostCalculator.ConstructionCost;
import com.Epam.TaxCalculator.TaxCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        //Construction site
        logger.info("Started the application");

        System.out.println("Welcome to EPAM Estate Solutions ~");
        System.out.println("Area for your home in sq. ft.");
        int areaOfHouse = sc.nextInt();
        System.out.println("Press 1) for std. materials     Press 2) for above std. materials" +
                "   Press 3) for high std. materials");
        int materialType = sc.nextInt();
        System.out.println("For full automation authorise with 1 and 0 to use automation");
        int automation = sc.nextInt();
        ConstructionCost c1 = new ConstructionCost(areaOfHouse,materialType,automation);
        System.out.println("Final cost: " + c1.finalCostOfBuiltHouse());
        System.out.println("Thanks for using our service!");

        logger.info("Construction module completed with final cost: " + c1.finalCostOfBuiltHouse());


        //Tax Calculator
        System.out.println("******************************************************");
        System.out.println("* Welcome to EPAM Digital Solutions *");
        System.out.println("Enter your principal amt.");
        logger.info("Starting Tax Calc module");

        System.out.println("Enter Principal");
        float principal = sc.nextFloat();
        System.out.println("Enter rate of interest");
        float rate = sc.nextFloat();
        System.out.println("Enter the time in years");
        int years = sc.nextInt();
        TaxCalculator t1 = new TaxCalculator(principal,rate,years);
        System.out.println("Simple Interest: "+ t1.getMySimpleInterest());
        System.out.println("Compound Interest: "+ t1.getMyCompoundInterest());
        logger.info("Tax calc ran successfully");

        System.out.println("* Thanks for giving us a chance to serve you! *");
    }
}
