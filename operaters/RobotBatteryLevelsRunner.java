class RobotBatteryLevelsRunner {
    public static void main(String[] args) {

        int robotAlpha = 90;
        int robotBeta = 75;
        int robotGamma = 85;
        int robotDelta = 60;
        int robotOmega = 95;

        int total = RobotBatteryLevels.batteryDetails(
            robotAlpha, robotBeta, robotGamma, robotDelta, robotOmega);

        System.out.println("Total battery percentage: " + total);

        System.out.println(robotAlpha);
        System.out.println(robotBeta);
        System.out.println(robotGamma);
        System.out.println(robotDelta);
        System.out.println(robotOmega);
    }
}