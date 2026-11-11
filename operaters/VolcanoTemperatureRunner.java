class VolcanoTemperatureRunner {
    public static void main(String[] args) {

        short volcano1 = 450;
        short volcano2 = 520;
        short volcano3 = 610;
        short volcano4 = 380;
        short volcano5 = 490;

        short total = VolcanoTemperature.temperatureDetails(
            volcano1, volcano2, volcano3, volcano4, volcano5);

        System.out.println("Total temperature: " + total);

        System.out.println(volcano1);
        System.out.println(volcano2);
        System.out.println(volcano3);
        System.out.println(volcano4);
        System.out.println(volcano5);
    }
}