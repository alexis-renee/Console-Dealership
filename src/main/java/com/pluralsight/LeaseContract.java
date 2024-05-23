package com.pluralsight;


public class LeaseContract extends Contract{
    private double SalesTax;
    private double RecordingFee;
    private double ProcessingFee;
    private boolean lease;
    private double endingValue;
    private double leaseFee;
    private double monthlyPayment;

    public LeaseContract(String contractDate, String customerName, String customerEmail, Vehicle vehicleSold,double salesTax, double recordingFee, double processingFee, boolean lease, double endingValue) {
        super(contractDate, customerName, customerEmail, vehicleSold);
        this.SalesTax = salesTax;
        this.RecordingFee = recordingFee;
        this.ProcessingFee = processingFee;
        this.lease = lease;
        this.endingValue = endingValue;

    }}
public double getSalesTax() {
    return SalesTax;
}

public void setSalesTax(double salesTax) {
    this.SalesTax = salesTax;
}

public double getRecordingFee() {
    return RecordingFee;
}

public void setRecordingFee(double recordingFee) {
    this.recordingFee = recordingFee;
}

public double getProcessingFee() {
    return processingFee;
}

public void setProcessingFee(double processingFee) {
    this.processingFee = processingFee;
}

public boolean isLease() {
    return lease;
}

public void setLease(boolean lease) {
    this.lease = lease;
}

public double getEndingValue() {
    return endingValue;
}

public void setEndingValue(double endingValue) {
    this.getEndingValue() = endingValue;
}
@Override
public double getTotalPrice() {
    return (getEndingValue().getPrice() - endingValue) + leaseFee;
}@Override
public double getMonthlyPayment() {
    int numberOfPayments = 36;
    double interestRate = 4.0 / 1200;
    double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
    monthlyPayment = Math.round(monthlyPayment * 100);
    monthlyPayment /= 100;
    return monthlyPayment;
}



