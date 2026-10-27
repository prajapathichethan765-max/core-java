class MobileDetails {
    public static void main(String[] args) {
        System.out.println("Mobile Phone Details");

        String brandName = "Samsung";
        MobileDetails.printBrand(brandName);

        int price = 25000;
        MobileDetails.printPrice(price);

        double screenSize = 6.7;
        MobileDetails.printScreen(screenSize);

        long imeiNumber = 123456789012345L;
        MobileDetails.printImei(imeiNumber);

        boolean has5G = true;
        MobileDetails.printNetwork(has5G);

        char rating = 'A';
        MobileDetails.printRating(rating);

        byte cameraCount = 3;
        MobileDetails.printCameraCount(cameraCount);
    }

    static void printBrand(String brand) {
        System.out.println("Brand: " + brand);
    }

    static void printPrice(int cost) {
        System.out.println("Price: " + cost);
    }

    static void printScreen(double size) {
        System.out.println("Screen Size: " + size);
    }

    static void printImei(long imei) {
        System.out.println("IMEI: " + imei);
    }

    static void printNetwork(boolean network) {
        System.out.println("5G Available: " + network);
    }

    static void printRating(char grade) {
        System.out.println("Rating: " + grade);
    }

    static void printCameraCount(byte count) {
        System.out.println("Camera Count: " + count);
    }
}