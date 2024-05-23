package com.pluralsight;

public class SalesContract {
    private double SalesTaxAmount;
    private double RecordingFees;
    private double ProcessingFees;
    private boolean Finance;
    private double FinancedMonthlyPayment;

    public SalesContract(double salesTaxAmount, double recordingFees, double processingFees, boolean finance) {
        SalesTaxAmount = salesTaxAmount;
        RecordingFees = recordingFees;
        ProcessingFees = processingFees;
        Finance = finance;
    }

    public double getSalesTaxAmount() {
        return SalesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        SalesTaxAmount = salesTaxAmount;
    }

    public double getRecordingFees() {
        return RecordingFees;
    }

    public void setRecordingFees(double recordingFees) {
        RecordingFees = recordingFees;
    }

    public double getProcessingFees() {
        return ProcessingFees;
    }

    public void setProcessingFees(double processingFees) {
        ProcessingFees = processingFees;
    }

    public boolean isFinance() {
        return Finance;
    }

    public void setFinance(boolean finance) {
        Finance = finance;

    }}
@Override
public double getTotalPrice() {
    return getVehicleSold().getPrice() + salesTax + recordingFee + processingFee;
}

@Override
public double getMonthlyPayment() {
    int numberOfPayments = 0;
    double interestRate = 0;
    if (finance) {
        if (getVehicleSold().getPrice() >= 10000) {
            numberOfPayments = 48;
            interestRate = 4.25 / 1200;
        } else {
            numberOfPayments = 24;
            interestRate = 5.25 / 1200;
        }

        double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
        monthlyPayment = Math.round(monthlyPayment * 100);
        monthlyPayment /= 100;
        return monthlyPayment;
    } else {
        return 0.0;
    }
}





