package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class DealershipFileManager {

    public Dealership getDealership() {
        //File_name represents the path to the file that I want to read.
        try {
            Dealership dealership = new Dealership("", "", "");

            BufferedReader bufferedReader = new BufferedReader(new FileReader("dealership.csv"));
            String line;// This declares a variable to hold each line of text from the file.
            while ((line = bufferedReader.readLine()) != null) { // this loop keeps running as long as there are lines to read from the file.
                String[] parts = line.split("\\|"); // this splits the line into parts where ever there's a "|" character.
                if (parts.length == 8) { // This checks if the line has exactly 8 parts after splitting.
                    int vin = Integer.parseInt(parts[0]);// this converts the first part into a LocalDate object
                    int year = Integer.parseInt(parts[1]); // this converts the second part into a LocalTime object
                    String make = parts[2].trim(); // This removes any trailing spaces from the third part
                    String model = parts[3].trim();// This removes any trailing spaces from the fourth part
                    String vehicleType = parts[4];// converts the fifth part into a double
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);

                } else if (parts.length == 3) {

                    String name = parts[0].trim();
                    String address = parts[1].trim();
                    String phonenumber = parts[2].trim();

                    Dealership dealership1 = new Dealership(name, address, phonenumber);


                }

            }
            bufferedReader.close();
            return dealership;
        } catch (Exception e) {
            System.out.println("Error Loading Inventory: " + e.getMessage());
        }
        return null;
    }

    public static Dealership savedealership() {
        try {
            FileWriter writer = new FileWriter("dealership.csv");
            writer.write(savedealership().toString());
            writer.close();
            System.out.println("Dealership data saved successfully!");
        } catch (IOException e) {
            System.err.println("Error saving dealership data: " + e.getMessage());

        }

        return null;
    }}
