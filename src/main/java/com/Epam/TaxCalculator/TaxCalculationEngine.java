package com.Epam.TaxCalculator;

public class TaxCalculationEngine {
    private float principalAmountInRupee = 0;
    private float rateOfInterest = 0;
    private int timeInYears = 0;
    private float calculatedSimpleInterest = 0;
    private float calculatedCompoundInterest = 0;

    TaxCalculationEngine(float p, float r, int t) {
        this.principalAmountInRupee = p;
        this.rateOfInterest = r;
        this.timeInYears = t;
    }

    public float generateMySimpleInterest() {
        this.calculatedSimpleInterest = (principalAmountInRupee*rateOfInterest*timeInYears)/100;
        return calculatedSimpleInterest;
    }

    public float generateMyCompoundInterest() {
        this.calculatedCompoundInterest =
                (float) (principalAmountInRupee*Math.pow((1+rateOfInterest/100),timeInYears));
        this.calculatedCompoundInterest-=principalAmountInRupee;
        return calculatedCompoundInterest;
    }

}
