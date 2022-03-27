package org.makechtec.financial.financialutils;

public class PerpetuityFixedCashFlow{

    public double presentValue(double payment, double rate){
        return payment/rate;
    }

    public double presentValue(double payment, double rate, double growth){
        return payment/(rate - growth);
    }

}
