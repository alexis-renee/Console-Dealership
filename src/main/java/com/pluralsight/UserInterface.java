package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private Scanner myScanner;

    public UserInterface() {
        myScanner = new Scanner(System.in);
    }
    private void init () {

        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }
    public void display() {
        init();

        boolean running = true;
        while (running) {
            System.out.println("Main Menu");
            System.out.println("Choose an option:");
            System.out.println("1) Find Vehicles within a Price range ");
            System.out.println("2) Find Vehicles by make / model ");
            System.out.println("3) Find vehicles by year range ");
            System.out.println("4) Find vehicles by color ");
            System.out.println("5) Find vehicles by mileage range ");
            System.out.println("6) Find vehicles by type (car, truck, suv, van) ");
            System.out.println("7) List ALL vehicles ");
            System.out.println("8) Add a vehicle ");
            System.out.println("9) Remove a vehicle ");
            System.out.println("99 Quit");

            String input = myScanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetbyYearRequest();
                    break;
                case "4":
                    processGetbyColorRequest();
                    break;
                case "5":
                    processGetbyMileageRequest();
                    break;
                case "6":
                    processGetbyVehicleRequest();
                    break;
                case "7":
                    processAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }


        }






    }
    private void displayVehicles (List < Vehicle > vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle);


        }


    }
    public void processGetByPriceRequest () {


    }
    public void processGetByMakeModelRequest () {

    }
    public void processGetbyYearRequest () {

    }
    public void processGetbyColorRequest () {

    }
    public void processGetbyMileageRequest () {

    }
    public void processGetbyVehicleRequest () {

    }
    public void processGetAllVehiclesRequest () {

    }
    public void processAddVehicleRequest () {

    }
    public void processRemoveVehicleRequest () {

    }
    private void processAllVehiclesRequest () {
        List<Vehicle> allVehicles = dealership.getAllVehicles();

    }

}

