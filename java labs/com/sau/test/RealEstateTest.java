package com.sau.test;

import com.sau.realestate.*;

public class RealEstateTest {
    public static void main(String[] args) {
        
        // Part A: Basic usage of RealEstateListing class
        System.out.println("Part A: Basic RealEstateListing Usage");
        System.out.println("-------------------------------------");
        RealEstateListing listing1 = new RealEstateListing(1001, 450000.00, "123 Main St", 2500);
        listing1.display();
        System.out.println();

        // Part B: Inner Class Object Creation
        System.out.println("Part B: Inner Class Object Creation");
        System.out.println("----------------------------------");
        RealEstateListing listing2 = new RealEstateListing(1002, 575000.00, "456 Oak Ave", 3200);

        // Method 1: Creating inner class object using outer class instance
        RealEstateListing.HouseData newHouse = listing2.new HouseData("789 Pine St", 1800);
        System.out.println("Created new HouseData object:");
        System.out.println("Address: " + newHouse.getStreetAddress());
        System.out.println("Square Feet: " + newHouse.getSquareFeet());
        System.out.println();

        // Method 2: Accessing existing inner class object
        System.out.println("Accessing existing HouseData object:");
        RealEstateListing.HouseData existingHouse = listing2.getHouseData();
        System.out.println("Address: " + existingHouse.getStreetAddress());
        System.out.println("Square Feet: " + existingHouse.getSquareFeet());
    }
}