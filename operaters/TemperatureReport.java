class TemperatureReport {
    static float temperatureValues(float temp1, float temp2, float temp3, float temp4, float temp5) {

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.println(temp5);

        float temperatures[] = {temp1, temp2, temp3, temp4, temp5};

        System.out.println(temperatures[0]);
        System.out.println(temperatures[1]);
        System.out.println(temperatures[2]);
        System.out.println(temperatures[3]);
        System.out.println(temperatures[4]);

        return temperatures[0] + temperatures[1] + temperatures[2]
             + temperatures[3] + temperatures[4];
    }
}