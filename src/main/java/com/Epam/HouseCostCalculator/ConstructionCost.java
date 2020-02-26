package com.Epam.HouseCostCalculator;

public class ConstructionCost {
    private int areaOfHouse = 0;
    private int totalCost = 0;
    private int constructionCostPerSqFt = 0;
    private int isFullyAutomated = 0;
    private Calculations homeCalculator;

    public ConstructionCost(int a, int c, int i) {
        this.areaOfHouse = a;
        this.constructionCostPerSqFt = CostSetting(c);
        this.isFullyAutomated = i;
        if(isFullyAutomated==1)
               homeCalculator = new Calculations(2500,constructionCostPerSqFt,areaOfHouse);
        else
                homeCalculator = new Calculations(0,constructionCostPerSqFt,areaOfHouse);
    }

    public int CostSetting(int t) {
        if(t==2) {
            return 1500;
        }
        else if(t==3) {
            return 1800;
        }
        else if(t==4) {
            return 2500;
        }
        else {
            return 1200;
        }

    }

    public int finalCostOfBuiltHouse() {
        totalCost = homeCalculator.finalCosting();
        return totalCost;
    }

    public float getAreaOfHouse() {
        return areaOfHouse;
    }

}
