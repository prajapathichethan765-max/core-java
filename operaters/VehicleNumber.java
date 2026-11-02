class VehicleNumber {
    public static void main(String[] args) {

        char vehicle = 'B';
        String result = VehicleNumber.checkVehicle(vehicle);
        System.out.println(result);

    }

    static String checkVehicle(char vehicleType) {
        System.out.println(vehicleType);

        switch (vehicleType) {

            case 'C':
                return "Vehicle type is Car";

            case 'B':
                return "Vehicle type is Bike";

            case 'T':
                return "Vehicle type is Truck";

            default:
                return "Vehicle type is not registered";
        }
    }
}