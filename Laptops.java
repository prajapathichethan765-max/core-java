class Laptops {
    public static void main(String[] args) {

        System.out.println("price of laptop in bangalore");
        long price1 = 55000L;
        Laptops.laptopPrice(price1);

        System.out.println("price of laptop in rajasthan and up");
        long price2 = 60000L;
        long price3 = 75000L;
        Laptops.laptopPriceInRajasthanAndUP(price2, price3);

        System.out.println("price of laptop in mp, nepal, gujarat");
        long price4 = 45000L;
        long price5 = 80000L;
        long price6 = 90000L;
        Laptops.laptopPriceInMPNepalGujarat(price4, price5, price6);

        System.out.println("availability of laptops in mp, nepal, gujarat, rajasthan");
        Laptops.laptopAvailability(true, false, true, false);

        System.out.println("brands of laptops");
        String brand1 = "Dell";
        String brand2 = "HP";
        String brand3 = "Lenovo";
        String brand4 = "Asus";
        String brand5 = "Acer";

        Laptops.laptopBrands(brand1, brand2, brand3, brand4, brand5);
    }

    static void laptopPrice(long amount1) {
        System.out.println("price of laptop = " + amount1);
    }

    static void laptopPriceInRajasthanAndUP(long amount2, long amount3) {
        System.out.println("price of laptop in rajasthan = " + amount2);
        System.out.println("price of laptop in up = " + amount3);
    }

    static void laptopPriceInMPNepalGujarat(long amount4, long amount5, long amount6) {
        System.out.println("price of laptop in mp = " + amount4);
        System.out.println("price of laptop in nepal = " + amount5);
        System.out.println("price of laptop in gujarat = " + amount6);
    }

    static void laptopAvailability(boolean status1, boolean status2,
                                   boolean status3, boolean status4) {
        System.out.println("laptop available in mp = " + status1);
        System.out.println("laptop available in nepal = " + status2);
        System.out.println("laptop available in gujarat = " + status3);
        System.out.println("laptop available in rajasthan = " + status4);
    }

    static void laptopBrands(String name1, String name2, String name3,
                             String name4, String name5) {
        System.out.println("brand of laptop 1 = " + name1);
        System.out.println("brand of laptop 2 = " + name2);
        System.out.println("brand of laptop 3 = " + name3);
        System.out.println("brand of laptop 4 = " + name4);
        System.out.println("brand of laptop 5 = " + name5);
    }
}