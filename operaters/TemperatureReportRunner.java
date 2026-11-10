class TemperatureReportRunner {
    public static void main(String[] args) {

        float day1 = 28.5f;
        float day2 = 30.5f;
        float day3 = 32.5f;
        float day4 = 27.5f;
        float day5 = 29.5f;

        float result = TemperatureReport.temperatureValues(day1, day2, day3, day4, day5);

        System.out.println("Total temperature: " + result);

        System.out.println(day1);
        System.out.println(day2);
        System.out.println(day3);
        System.out.println(day4);
        System.out.println(day5);
    }
}