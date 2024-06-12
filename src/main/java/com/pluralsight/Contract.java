package com.pluralsight;

public abstract class Contract {
    private String DateOfContract;
    private String CustomerName;
    private String CustomerEmail;
    private Vehicle VehicleSold;
    private double TotalPrice;
    private double MonthlyPayment;


    public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.DateOfContract = DateOfContract;
        this.CustomerName = CustomerName;
        this.CustomerEmail = CustomerEmail;
        this.VehicleSold = VehicleSold;

    }

    public String getDateOfContract() {
        return DateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        DateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public Vehicle getVehicleSold() {
        return VehicleSold;
    }

    public void setVehicleSold(Vehicle vehicleSold) {
        VehicleSold = vehicleSold;

    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}





