package com.sau.realestate;

public class RealEstateListing {
    private final int listingNumber;
    private final double price;
    private final HouseData houseData;

    public RealEstateListing(int num, double price, String address, int sqFt) {
        listingNumber = num;
        this.price = price;
        houseData = new HouseData(address, sqFt);
    }

    public void display() {
        System.out.println("Listing number #" + listingNumber + " Selling for $" + price);
        System.out.println("Address: " + houseData.streetAddress);
        System.out.println(houseData.squareFeet + " square feet");
    }

    // Making HouseData public for demonstration of inner class object creation
    public class HouseData {
        private String streetAddress;
        private int squareFeet;

        public HouseData(String address, int sqFt) {
            streetAddress = address;
            squareFeet = sqFt;
        }

        public String getStreetAddress() {
            return streetAddress;
        }

        public int getSquareFeet() {
            return squareFeet;
        }
    }

    // Method to get inner class object (alternative way to demonstrate inner class access)
    public HouseData getHouseData() {
        return houseData;
    }
}