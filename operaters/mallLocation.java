class ShoppingMall {
    public static void main(String[] args) {

        System.out.println("name of shopping mall");
        ShoppingMall.mallName();

        System.out.println("location of shopping mall");
        ShoppingMall.mallLocation();

        System.out.println("total investment");
        long investment = ShoppingMall.totalInvestment();
        System.out.println(investment);

        System.out.println("number of shops");
        short shops = ShoppingMall.shopCount();
        System.out.println(shops);

        System.out.println("number of floors");
        int floors = 8;
        ShoppingMall.floorDetails(floors);

        System.out.println("mall area and parking area");
        double area = 25000.75;
        float parking = 5000.5f;
        ShoppingMall.areaDetails(area, parking);

        System.out.println("popular shop details");
        String shop = "Reliance Trends";
        double rating = 4.8;
        ShoppingMall.popularShop(shop, rating);

        System.out.println("manager details");
        String manager = "Rahul";
        String result = ShoppingMall.managerDetails(manager);
        System.out.println(result);

        System.out.println("check parking availability");
        boolean parkingAvailable = true;
        String status = ShoppingMall.checkParking(parkingAvailable);
        System.out.println(status);

        System.out.println("mall opening time");
        ShoppingMall.openingTime();

        System.out.println("customer capacity");
        int customers = 5000;
        ShoppingMall.customerCapacity(customers);

    }

    static void mallName() {
        System.out.println("Phoenix Marketcity");
    }

    static void mallLocation() {
        System.out.println("Bangalore");
    }

    static long totalInvestment() {
        long amount = 500000000L;
        return amount;
    }

    static short shopCount() {
        short totalShops = 250;
        return totalShops;
    }

    static void floorDetails(int floorCount) {
        System.out.println(floorCount);
    }

    static void areaDetails(double mallArea, float parkingArea) {
        System.out.println(mallArea);
        System.out.println(parkingArea);
    }

    static void popularShop(String shopName, double shopRating) {
        System.out.println(shopName);
        System.out.println(shopRating);
    }

    static String managerDetails(String managerName) {
        return managerName + " manages the shopping mall";
    }

    static String checkParking(boolean available) {
        if (available) {
            return "Parking facility is available";
        } else {
            return "Parking facility is not available";
        }
    }

    static void openingTime() {
        System.out.println("10 AM to 10 PM");
    }

    static void customerCapacity(int capacity) {
        System.out.println(capacity);
    }
}