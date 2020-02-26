package com.Epam.HouseCostCalculator;

public class Calculations {

    private int fullyFurnishCostInRupee=0;
    private int costPerFtInRupee=0;
    private int areaOfHouseInSqFoot=0;

    Calculations(int f, int c, int a) {
        this.fullyFurnishCostInRupee = f;
        this.costPerFtInRupee = c;
        this.areaOfHouseInSqFoot = a;
    }

    public int finalCosting() {
        return areaOfHouseInSqFoot * costPerFtInRupee + fullyFurnishCostInRupee;
    }
}
