package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phonenumber;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phonenumber) {
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclebyMakeModel(String make, String model) {
        return null;

    }

    public List<Vehicle> getVehiclebyYear(double min, double max) {
        return null;

    }

    public List<Vehicle> getVehicleByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehicleByMileage(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return null;
    }

    public void addVehicle(Vehicle vehicle) {

    }

    public void removeVehicle(Vehicle vehicle) {


    }

}