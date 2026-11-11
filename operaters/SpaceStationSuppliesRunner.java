class SpaceStationSuppliesRunner {
    public static void main(String[] args) {

        double oxygen = 45.5;
        double water = 60.5;
        double food = 35.5;
        double fuel = 80.5;
        double medicine = 20.5;

        double total = SpaceStationSupplies.supplyDetails(
            oxygen, water, food, fuel, medicine);

        System.out.println("Total supplies: " + total);

        System.out.println(oxygen);
        System.out.println(water);
        System.out.println(food);
        System.out.println(fuel);
        System.out.println(medicine);
    }
}