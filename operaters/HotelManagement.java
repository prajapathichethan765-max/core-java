class HotelManagement {
    public static void main(String[] args) {

        System.out.println("hotel name");
        HotelManagement.hotelName();

        System.out.println("hotel location");
        HotelManagement.hotelLocation();

        System.out.println("room rent");
        int rent = HotelManagement.roomRent();
        System.out.println(rent);

        System.out.println("number of rooms");
        short rooms = HotelManagement.roomCount();
        System.out.println(rooms);

        System.out.println("hotel investment");
        long investment = 75000000L;
        HotelManagement.investmentDetails(investment);

        System.out.println("hotel rating");
        float rating = 4.9f;
        HotelManagement.ratingDetails(rating);

        System.out.println("food availability");
        boolean food = true;
        HotelManagement.foodFacility(food);

        System.out.println("hotel manager");
        String manager = "Karthik";
        String result = HotelManagement.managerInformation(manager);
        System.out.println(result);

        System.out.println("hotel grade");
        char grade = 'A';
        HotelManagement.hotelGrade(grade);

        System.out.println("restaurant name");
        String restaurant = "Spice Garden";
        HotelManagement.restaurantDetails(restaurant);

        System.out.println("check room rent");
        int amount = 3500;
        String status = HotelManagement.checkRoomRent(amount);
        System.out.println(status);

        System.out.println("hotel opening year");
        HotelManagement.openingYear();

        System.out.println("customer service number");
        long phone = 9876501234L;
        HotelManagement.customerService(phone);
    }

    static void hotelName() {
        System.out.println("Grand Palace");
    }

    static void hotelLocation() {
        System.out.println("Mysore");
    }

    static int roomRent() {
        return 2500;
    }

    static short roomCount() {
        return 150;
    }

    static void investmentDetails(long amount) {
        System.out.println(amount);
    }

    static void ratingDetails(float stars) {
        System.out.println(stars);
    }

    static void foodFacility(boolean available) {
        System.out.println(available);
    }

    static String managerInformation(String name) {
        return name + " is responsible for hotel management";
    }

    static void hotelGrade(char category) {
        System.out.println(category);
    }

    static void restaurantDetails(String name) {
        System.out.println(name);
    }

    static String checkRoomRent(int price) {
        if (price <= 4000) {
            return "Room rent is within budget";
        } else {
            return "Room rent is above budget";
        }
    }

    static void openingYear() {
        System.out.println(2015);
    }

    static void customerService(long number) {
        System.out.println(number);
    }
}