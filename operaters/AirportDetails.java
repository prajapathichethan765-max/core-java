class AirportDetails {
    public static void main(String[] args) {

        System.out.println("airport name");
        AirportDetails.airportName();

        System.out.println("airport location");
        AirportDetails.airportLocation();

        System.out.println("number of terminals");
        int terminals = AirportDetails.terminalCount();
        System.out.println(terminals);

        System.out.println("daily passengers");
        long passengers = AirportDetails.dailyPassengers();
        System.out.println(passengers);

        System.out.println("airport area");
        double area = 45000.75;
        AirportDetails.airportArea(area);

        System.out.println("airport rating");
        float rating = 4.8f;
        AirportDetails.airportRating(rating);

        System.out.println("airport grade");
        char grade = 'A';
        AirportDetails.airportGrade(grade);

        System.out.println("airport manager");
        String manager = "Rohit";
        String result = AirportDetails.managerDetails(manager);
        System.out.println(result);

        System.out.println("check international facility");
        boolean facility = true;
        AirportDetails.internationalFacility(facility);

        System.out.println("number of flights");
        int flights = 250;
        AirportDetails.flightCount(flights);

        System.out.println("check passenger capacity");
        int capacity = 5000;
        String status = AirportDetails.checkCapacity(capacity);
        System.out.println(status);

        System.out.println("airport contact number");
        long contact = 9876543210L;
        AirportDetails.contactNumber(contact);

        System.out.println("airport opening status");
        AirportDetails.openingStatus();
    }

    static void airportName() {
        System.out.println("Kempegowda International Airport");
    }

    static void airportLocation() {
        System.out.println("Bangalore");
    }

    static int terminalCount() {
        return 2;
    }

    static long dailyPassengers() {
        return 85000L;
    }

    static void airportArea(double totalArea) {
        System.out.println(totalArea);
    }

    static void airportRating(float starRating) {
        System.out.println(starRating);
    }

    static void airportGrade(char category) {
        System.out.println(category);
    }

    static String managerDetails(String name) {
        return name + " is managing the airport";
    }

    static void internationalFacility(boolean available) {
        System.out.println(available);
    }

    static void flightCount(int totalFlights) {
        System.out.println(totalFlights);
    }

    static String checkCapacity(int passengerCount) {
        if (passengerCount <= 6000) {
            return "Airport has available capacity";
        } else {
            return "Airport capacity is full";
        }
    }

    static void contactNumber(long phone) {
        System.out.println(phone);
    }

    static void openingStatus() {
        System.out.println("Airport operates 24 hours");
    }
}