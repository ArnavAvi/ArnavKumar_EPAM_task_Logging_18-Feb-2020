package com.Epam.TaxCalculator;

public class TaxCalculator {
    private float principalAmountInRupee = 0;
    private float rateOfInterest = 0;
    private int timeInYears = 0;
    private TaxCalculationEngine calc;
    private float mySimpleInterest = 0;
    private float myCompoundInterest = 0;

    public TaxCalculator(float p, float r, int t) {
        this.principalAmountInRupee = p;
        this.rateOfInterest = r;
        this.timeInYears = t;
        calc = new TaxCalculationEngine(p,r,t);
    }

    public float getMySimpleInterest() {
        mySimpleInterest = calc.generateMySimpleInterest();
        return mySimpleInterest;
    }

    public float getMyCompoundInterest() {
        myCompoundInterest = calc.generateMyCompoundInterest();
        return myCompoundInterest;
    }

    public float getPrincipalAmountInRupee() {
        return principalAmountInRupee;
    }

    public void setPrincipalAmountInRupee(int principalAmountInRupee) {
        this.principalAmountInRupee = principalAmountInRupee;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public int getTimeInYears() {
        return timeInYears;
    }

    public void setTimeInYears(int timeInYears) {
        this.timeInYears = timeInYears;
    }
}
