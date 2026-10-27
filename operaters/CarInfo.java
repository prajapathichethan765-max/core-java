class CarInfo {
    public static void main(String[] args) {
        System.out.println("Car Information");

        String modelName = "Swift";
        CarInfo.showModel(modelName);

        int manufacturingYear = 2024;
        CarInfo.showYear(manufacturingYear);

        double mileage = 22.5;
        CarInfo.showMileage(mileage);

        float engineCapacity = 1.2f;
        CarInfo.showEngine(engineCapacity);

        boolean hasAirConditioner = true;
        CarInfo.showAC(hasAirConditioner);

        char fuelType = 'P';
        CarInfo.showFuelType(fuelType);

        byte seatCount = 5;
        CarInfo.showSeats(seatCount);
    }

    static void showModel(String model) {
        System.out.println("Model: " + model);
    }

    static void showYear(int year) {
        System.out.println("Manufacturing Year: " + year);
    }

    static void showMileage(double average) {
        System.out.println("Mileage: " + average);
    }

    static void showEngine(float capacity) {
        System.out.println("Engine Capacity: " + capacity);
    }

    static void showAC(boolean ac) {
        System.out.println("Air Conditioner: " + ac);
    }

    static void showFuelType(char fuel) {
        System.out.println("Fuel Type: " + fuel);
    }

    static void showSeats(byte seats) {
        System.out.println("Number of Seats: " + seats);
    }
}