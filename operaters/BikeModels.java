class BikeModels{
    public static void main(String[] args){

        String bike1 = "KTM";
        String bike2 = "Royal Enfield";
        String bike3 = "Yamaha";
        String bike4 = "Honda";
        String bike5 = "Suzuki";

        System.out.println(bike1);
        System.out.println(bike2);
        System.out.println(bike3);
        System.out.println(bike4);
        System.out.println(bike5);

        String models = BikeModels.bikeNames(
            bike1, bike2, bike3, bike4, bike5);

        System.out.println(models);
    }

    static String bikeNames(String firstBike, String secondBike,
    String thirdBike, String fourthBike, String fifthBike){

        System.out.println(firstBike);
        System.out.println(secondBike);
        System.out.println(thirdBike);
        System.out.println(fourthBike);
        System.out.println(fifthBike);

        String bikes[] = {
            firstBike, secondBike, thirdBike, fourthBike, fifthBike
        };

        System.out.println(bikes[0]);
        System.out.println(bikes[1]);
        System.out.println(bikes[2]);
        System.out.println(bikes[3]);
        System.out.println(bikes[4]);

        bikes[2] = "TVS";
        bikes[4] = "Hero";

        System.out.println(bikes[2]);
        System.out.println(bikes[4]);

        return bikes[0] + bikes[1] + bikes[2]
        + bikes[3] + bikes[4];
    }
}