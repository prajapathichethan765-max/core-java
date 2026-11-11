class VolcanoTemperature {
    static short temperatureDetails(short v1, short v2, short v3, short v4, short v5) {

        System.out.println("Volcano temperature details");

        short temperatures[] = {v1, v2, v3, v4, v5};

        System.out.println(temperatures[0]);
        System.out.println(temperatures[1]);
        System.out.println(temperatures[2]);
        System.out.println(temperatures[3]);
        System.out.println(temperatures[4]);

        return (short)(v1 + v2 + v3 + v4 + v5);
    }
}