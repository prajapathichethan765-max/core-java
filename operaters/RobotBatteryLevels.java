class RobotBatteryLevels {
    static int batteryDetails(int b1, int b2, int b3, int b4, int b5) {

        System.out.println("Robot battery levels");

        int battery[] = {b1, b2, b3, b4, b5};

        System.out.println(battery[0]);
        System.out.println(battery[1]);
        System.out.println(battery[2]);
        System.out.println(battery[3]);
        System.out.println(battery[4]);

        return b1 + b2 + b3 + b4 + b5;
    }
}